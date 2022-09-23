package com.example.fooddeliveryapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.fooddeliveryapp.UserDBSchema.userTable;


public class UserDBHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "students.db";

    public UserDBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table "+userTable.NAME+"("+userTable.Cols.ID+" Text,"+userTable.Cols.EMAIL+" Text, "+ userTable.Cols.PASSWORD+ " Text);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}