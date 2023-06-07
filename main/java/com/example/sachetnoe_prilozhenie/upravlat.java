package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class upravlat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upravlat);

        Button button4 = (Button) findViewById(R.id.button19);
        View.OnClickListener hbutton2 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(upravlat.this, main_menu.class);
                startActivity(intent);
            }
        };
        button4.setOnClickListener(hbutton2);

        Button button5 = (Button) findViewById(R.id.button21);
        View.OnClickListener hbutton3 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(upravlat.this, upravlat_red.class);
                startActivity(intent);
            }
        };
        button5.setOnClickListener(hbutton3);
    }
}