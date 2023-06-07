package com.example.sachetnoe_prilozhenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autorisation);

        Button button = (Button) findViewById(R.id.enter);
        View.OnClickListener hbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, main_menu.class);
                startActivity(intent);
            }
        };
        button.setOnClickListener(hbutton);
    }

}