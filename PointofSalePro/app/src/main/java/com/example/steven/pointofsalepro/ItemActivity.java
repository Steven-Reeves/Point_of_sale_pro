package com.example.steven.pointofsalepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Button item1_button = (Button) findViewById(R.id.btn_item1);
        Button item2_button = (Button) findViewById(R.id.btn_item2);
        Button item3_button = (Button) findViewById(R.id.btn_item3);
        Button item4_button = (Button) findViewById(R.id.btn_item4);


        item1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(ItemActivity.this, pop1.class);
                startActivity(intent);
            }
        });

        item2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(ItemActivity.this, pop2.class);
                startActivity(intent);
            }
        });

        item3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(ItemActivity.this, pop3.class);
                startActivity(intent);
            }
        });

        item4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(ItemActivity.this, pop4.class);
                startActivity(intent);
            }
        });
    }
}
