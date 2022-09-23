package com.example.fooddeliveryapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.example.fooddeliveryapp.UserDBSchema.userTable;

public class UserDBCursor extends CursorWrapper {
    public UserDBCursor(Cursor cursor) {
        super(cursor);
    }

    public User getUsers(){
        String id = getString((getColumnIndex(userTable.Cols.ID)));
        String email = getString(getColumnIndex(userTable.Cols.EMAIL));
        String password = getString(getColumnIndex(userTable.Cols.PASSWORD));
        return new User(id, email,password);
    }
}
