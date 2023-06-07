package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class upravlat_red extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upravlat_red);

        Button button5 = (Button) findViewById(R.id.button22);
        View.OnClickListener hbutton3 = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(upravlat_red.this, upravlat.class);
                startActivity(intent);
            }
        };
        button5.setOnClickListener(hbutton3);
    }
}