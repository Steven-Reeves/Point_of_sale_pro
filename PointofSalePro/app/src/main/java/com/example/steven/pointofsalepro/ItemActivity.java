package com.example.steven.pointofsalepro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.example.steven.pointofsalepro.R.id.textView;
import static com.example.steven.pointofsalepro.R.id.total_txtView;

public class ItemActivity extends AppCompatActivity {
    private List<Item> items = new ArrayList<>();
    private float tab = 0.0f;
    final int REQ_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        int tableNum = getIntent().getExtras().getInt("TableNum");

        // Update tableNum_txtView to display correct table number
        TextView tableNumDisplay = (TextView) findViewById(R.id.tableNum_txtView);
        tableNumDisplay.setText(String.valueOf(tableNum));

        Button item1_button = (Button) findViewById(R.id.btn_item1);
        Button item2_button = (Button) findViewById(R.id.btn_item2);
        Button item3_button = (Button) findViewById(R.id.btn_item3);
        Button item4_button = (Button) findViewById(R.id.btn_item4);

        item1_button.setOnClickListener(new ItemClickListener(new Item("Burger", 7.99f)));
        item2_button.setOnClickListener(new ItemClickListener(new Item("Milkshake", 2.99f)));
        item3_button.setOnClickListener(new ItemClickListener(new Item("Soup", 5.99f)));
        item4_button.setOnClickListener(new ItemClickListener(new Item("Fries", 1.99f)));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQ_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                Item item = (Item) data.getExtras().getSerializable("Item");

                AddItem(item);
            }
        }
    }

    public void AddItem(Item item) {
        items.add(item);

        // Update the total tab
        tab += item.getCost();

        // Update the total tab display
        TextView total_txtView = (TextView) findViewById(R.id.total_txtView);
        total_txtView.setText(String.format("$%.2f", tab));
    }

    public class ItemClickListener implements View.OnClickListener {
        private Item m_item = new Item();

        public ItemClickListener(Item item) {
            m_item = item;
        }

        @Override
        public void onClick (View view) {
            Intent intent = new Intent(ItemActivity.this, ItemOptionPopup.class);

            // Include the item associated with this button in the intent
            intent.putExtra("Item", m_item);

            startActivityForResult(intent, REQ_CODE);
        }
    }
}
