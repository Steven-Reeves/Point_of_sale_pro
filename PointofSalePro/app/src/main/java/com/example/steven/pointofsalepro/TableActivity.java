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

        TableText.setText("Welcome, " + ServerName + "! Choose a Table:");

        button1.setOnClickListener(new TableSelectionListener(1));
        button2.setOnClickListener(new TableSelectionListener(2));
        button3.setOnClickListener(new TableSelectionListener(3));
        button4.setOnClickListener(new TableSelectionListener(4));
        button5.setOnClickListener(new TableSelectionListener(5));
        button6.setOnClickListener(new TableSelectionListener(6));
        button7.setOnClickListener(new TableSelectionListener(7));
        button8.setOnClickListener(new TableSelectionListener(8));
        button9.setOnClickListener(new TableSelectionListener(9));
    }

    private class TableSelectionListener implements View.OnClickListener {
        private int m_tableNum = 0;

        public TableSelectionListener(int tableNum) {
            m_tableNum = tableNum;
        }

        @Override
        public void onClick (View view) {
            Intent intent = new Intent(TableActivity.this, ItemActivity.class);

            // Add the table number to the intent's extra data
            intent.putExtra("TableNum", m_tableNum);
            startActivity(intent);
        }
    }
}
