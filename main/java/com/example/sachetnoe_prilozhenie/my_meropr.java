package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class my_meropr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_meropr);

        Button button1 = (Button) findViewById(R.id.button6);
        View.OnClickListener btn = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(my_meropr.this, my_world.class);
                startActivity(intent);
            }
        };
        button1.setOnClickListener(btn);
    }
}