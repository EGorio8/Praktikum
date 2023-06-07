package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class my_world extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_world);

        Button button = (Button) findViewById(R.id.button4);
        View.OnClickListener hbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(my_world.this, main_menu.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(hbutton);

        Button button1 = (Button) findViewById(R.id.button3);
        View.OnClickListener btn = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(my_world.this, MainActivity.class);
                startActivity(intent);
            }
        };
        button1.setOnClickListener(btn);

        Button button2 = (Button) findViewById(R.id.button17);
        View.OnClickListener btn1 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(my_world.this, my_meropr.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(btn1);

        Button button3 = (Button) findViewById(R.id.button5);
        View.OnClickListener hbutton1 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(my_world.this, redactor.class);
                startActivity(intent);
            }
        };
        button3.setOnClickListener(hbutton1);

        Button button4 = (Button) findViewById(R.id.button18);
        View.OnClickListener hbutton2 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(my_world.this, my_sobit.class);
                startActivity(intent);
            }
        };
        button4.setOnClickListener(hbutton2);
    }
}