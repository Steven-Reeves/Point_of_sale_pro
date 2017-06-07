package com.example.steven.pointofsalepro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.btn_server1);
        Button button2 = (Button) findViewById(R.id.btn_server2);
        Button button3 = (Button) findViewById(R.id.btn_server3);
        Button button4 = (Button) findViewById(R.id.btn_server4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                intent.putExtra("ServerName", "Toni");
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                intent.putExtra("ServerName", "Jake");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                intent.putExtra("ServerName", "Steven");
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                intent.putExtra("ServerName", "Cathy");
                startActivity(intent);
            }
        });
    }
}
