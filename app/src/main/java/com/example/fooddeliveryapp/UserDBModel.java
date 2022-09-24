package com.example.fooddeliveryapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.fooddeliveryapp.UserDBSchema.userTable;

import java.util.ArrayList;

public class UserDBModel   {

    SQLiteDatabase db;

    public void load(Context context){
        this.db = new UserDBHelper(context).getWritableDatabase();
    }

    public void addOrder() {

    }

    public void addUser(User user) {
        ContentValues cv = new ContentValues();
        cv.put(userTable.Cols.COL_USER_EMAIL, user.getEmail());
        cv.put(userTable.Cols.COL_USER_PASSWORD, user.getPassword());

        db.insert(userTable.NAME, null, cv);
    }

    public boolean validateUser(String email) {
        String[] cols = {userTable.Cols.COL_USER_ID};
        String selection = userTable.Cols.COL_USER_EMAIL + " = ?";
        String[] selectionArgs = {email};

        Cursor cursor = db.query(userTable.NAME, cols, selection, selectionArgs, null, null, null);
        int count = cursor.getCount();
        Log.d("TAG", String.valueOf(count));
        cursor.close();

        if(count > 0) {
            return true;
        }
        return false;
    }

    public boolean validateUser(String email, String password) {
        String[] Cols = {userTable.Cols.COL_USER_ID};
        String selection = userTable.Cols.COL_USER_EMAIL + " = ?" + " AND " + userTable.Cols.COL_USER_PASSWORD + " = ?";
        String[] selectionArgs = {email, password};

        Cursor cursor = db.query(userTable.NAME, Cols, selection, selectionArgs, null, null, null);
        int count = cursor.getCount();
        cursor.close();

        if(count > 0) {
            return true;
        }
        return false;
    }

    public ArrayList<User> getAllUsers() {
        ArrayList<User> userList = new ArrayList<>();
        Cursor cursor = db.query(userTable.NAME, null, null, null, null, null, null);
        UserDBCursor userDBCursor = new UserDBCursor(cursor);

        try
        {
            userDBCursor.moveToFirst();
            while (!userDBCursor.isAfterLast()) {
                userList.add(userDBCursor.getUser());
                userDBCursor.moveToNext();
            }
        }
        finally
        {
            cursor.close();
        }
        return userList;
    }
}
