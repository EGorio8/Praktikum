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
    }

    public void upr(View view) {
        Intent intent = new Intent(this, upravlat_red.class);
        startActivity(intent);
    }

    public void add(View view) {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }

    public void menu(View view) {
        Intent intent = new Intent(this, main_menu.class);
        startActivity(intent);
    }

}