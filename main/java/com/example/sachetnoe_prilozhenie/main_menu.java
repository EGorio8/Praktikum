package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button button = (Button) findViewById(R.id.button10);
        View.OnClickListener hbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(main_menu.this, my_world.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(hbutton);

        Button button1 = (Button) findViewById(R.id.button9);
        View.OnClickListener hbutton1 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(main_menu.this, dobav_meropr.class);
                startActivity(intent);
            }
        };
        button1.setOnClickListener(hbutton1);

        Button button2 = (Button) findViewById(R.id.button16);
        View.OnClickListener btn = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(main_menu.this, upravlat.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(btn);
    }
}