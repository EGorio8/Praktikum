package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class redactor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redactor);

        Button button = (Button) findViewById(R.id.button15);
        View.OnClickListener hbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(redactor.this, my_world.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(hbutton);
    }
}