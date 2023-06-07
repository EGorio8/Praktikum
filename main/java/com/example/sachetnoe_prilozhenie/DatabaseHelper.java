package com.example.sachetnoe_prilozhenie;

import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "userstore.db"; // название бд
    private static final int SCHEMA = 1; // версия базы данных
    static final String TABLE = "users"; // название таблицы в бд
    // названия столбцов
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_LOGIN = "login";
    public static final String COLUMN_PASSWORD = "password";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE users (" + COLUMN_ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_LOGIN
                + " TEXT, " + COLUMN_PASSWORD + " INTEGER);");
        // добавление начальных данных
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_LOGIN
                + ", " + COLUMN_PASSWORD  + ") VALUES (qwerty);");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE);
        onCreate(db);
    }
}