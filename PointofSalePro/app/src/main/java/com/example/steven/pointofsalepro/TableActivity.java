package com.example.steven.pointofsalepro;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        String ServerName =  "DEFAULT";
        ServerName = getIntent().getStringExtra("ServerName");
        TextView TableText = (TextView) findViewById(R.id.textView);
        Button button1 = (Button) findViewById(R.id.btn_table1);
        Button button2 = (Button) findViewById(R.id.btn_table2);
        Button button3 = (Button) findViewById(R.id.btn_table3);
        Button button4 = (Button) findViewById(R.id.btn_table4);
        Button button5 = (Button) findViewById(R.id.btn_table5);
        Button button6 = (Button) findViewById(R.id.btn_table6);
        Button button7 = (Button) findViewById(R.id.btn_table7);
        Button button8 = (Button) findViewById(R.id.btn_table8);
        Button button9 = (Button) findViewById(R.id.btn_table9);

        TableText.setText("Welcome, " + ServerName + " Choose a Table");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(TableActivity.this, ItemActivity.class);
                startActivity(intent);
            }
        });

    }
}
