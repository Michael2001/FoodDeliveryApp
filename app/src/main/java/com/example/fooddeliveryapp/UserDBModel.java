package com.example.fooddeliveryapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import com.example.fooddeliveryapp.UserDBSchema.userTable;

public class UserDBModel {


    SQLiteDatabase db;

    public void load(Context context){
        this.db = new UserDBHelper(context).getWritableDatabase();
    }

    public void addStudent(User user){
        ContentValues cv = new ContentValues();
        cv.put(userTable.Cols.ID, user.getId());
        cv.put(userTable.Cols.EMAIL, user.getEmail());
        cv.put(userTable.Cols.PASSWORD, user.getPassword());
        db.insert(userTable.NAME, null, cv);
    }

    public ArrayList<User> getAllUsers(){
        ArrayList<User> studentList = new ArrayList<>();
        Cursor cursor = db.query(userTable.NAME,null,null,null,null,null,null);
        UserDBCursor userDBCursor = new UserDBCursor(cursor);

        try{
            userDBCursor.moveToFirst();
            while(!userDBCursor.isAfterLast()){
                studentList.add(userDBCursor.getUsers());
                userDBCursor.moveToNext();
            }
        }
        finally {
            cursor.close();
        }
        return studentList;
    }

}
