package com.example.sachetnoe_prilozhenie;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    EditText nameBox;
    EditText vremaBox;
    EditText fioBox;
    MultiAutoCompleteTextView opisanieBox;
    Button delButton;
    Button saveButton;

    DatabaseHelper sqlHelper;
    SQLiteDatabase db;
    Cursor userCursor;
    long userId=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        nameBox = findViewById(R.id.name);
        vremaBox = findViewById(R.id.vrema);
        fioBox = findViewById(R.id.fio);
        opisanieBox = findViewById(R.id.opisanie);
        delButton = findViewById(R.id.deleteButton);
        saveButton = findViewById(R.id.saveButton);

        sqlHelper = new DatabaseHelper(this);
        db = sqlHelper.getWritableDatabase();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            userId = extras.getLong("id");
        }
        // если 0, то добавление
        if (userId > 0) {
            // получаем элемент по id из бд
            userCursor = db.rawQuery("select * from " + DatabaseHelper.TABLE + " where " +
                    DatabaseHelper.COLUMN_ID + "=?", new String[]{String.valueOf(userId)});
            userCursor.moveToFirst();
            nameBox.setText(userCursor.getString(1));
            vremaBox.setText(userCursor.getString(2));
            fioBox.setText(userCursor.getString(3));
            opisanieBox.setText(userCursor.getString(4));
            userCursor.close();
        } else {
            // скрываем кнопку удаления
            delButton.setVisibility(View.GONE);
        }
    }

    public void save(View view){
        ContentValues cv = new ContentValues();
        cv.put(DatabaseHelper.COLUMN_NAME, nameBox.getText().toString());
        cv.put(DatabaseHelper.COLUMN_VREMA, vremaBox.getText().toString());
        cv.put(DatabaseHelper.COLUMN_FIO, fioBox.getText().toString());
        cv.put(DatabaseHelper.COLUMN_OPISANIE, opisanieBox.getText().toString());
        //cv.put(DatabaseHelper.COLUMN_VREMA, Integer.parseInt(vremaBox.getText().toString()));

        if (userId > 0) {
            db.update(DatabaseHelper.TABLE, cv, DatabaseHelper.COLUMN_ID + "=" + userId, null);
        } else {
            db.insert(DatabaseHelper.TABLE, null, cv);
        }
        goHome();
    }
    public void delete(View view){
        db.delete(DatabaseHelper.TABLE, "_id = ?", new String[]{String.valueOf(userId)});
        goHome();
    }
    private void goHome(){
        // закрываем подключение
        db.close();
        // переход к главной activity
        Intent intent = new Intent(this, main_menu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }
}
