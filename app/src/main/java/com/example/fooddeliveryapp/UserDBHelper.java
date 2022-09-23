package com.example.fooddeliveryapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.fooddeliveryapp.UserDBSchema.userTable;

public class UserDBHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "users.db";


    private String CREATE_TABLE = "CREATE TABLE " + userTable.NAME + "("
            + userTable.Cols.COL_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + userTable.Cols.COL_USER_EMAIL + " TEXT," + userTable.Cols.COL_USER_PASSWORD + " TEXT" + ")";

    public UserDBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}