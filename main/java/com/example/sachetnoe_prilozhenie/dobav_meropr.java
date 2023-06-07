package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dobav_meropr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dobav_meropr);

        Button button4 = (Button) findViewById(R.id.button14);
        View.OnClickListener hbutton2 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(dobav_meropr.this, main_menu.class);
                startActivity(intent);
            }
        };
        button4.setOnClickListener(hbutton2);
    }
}