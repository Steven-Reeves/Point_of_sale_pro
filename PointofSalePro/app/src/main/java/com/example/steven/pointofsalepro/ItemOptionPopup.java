package com.example.steven.pointofsalepro;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.util.DisplayMetrics;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.ListView;
        import android.widget.TextView;

/**
 * Created by Jake on 6/6/2017.
 */

public class ItemOptionPopup extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_options_pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width * .8), (int)(height * .8));

        // Get item from intent extras
        Item item = (Item) getIntent().getExtras().getSerializable("Item");

        // Update optionsLabel with item name
        TextView optionsLabel = (TextView) findViewById(R.id.optionsLabel);
        optionsLabel.setText("Options for " + item.getName());

        Button doneButton = (Button) findViewById(R.id.btn_Done);

        // Set up intent to return to ItemActivity
        final Intent returnIntent = new Intent(this, ItemActivity.class);
        returnIntent.putExtra("Item", item);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
