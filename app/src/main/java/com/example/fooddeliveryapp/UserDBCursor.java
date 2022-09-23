package com.example.fooddeliveryapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.example.fooddeliveryapp.UserDBSchema.userTable;

public class UserDBCursor extends CursorWrapper {
    public UserDBCursor(Cursor cursor) {
        super(cursor);
    }

    public User getUser()
    {
        User user = new User();

        String id = String.valueOf(getInt(getColumnIndex(userTable.Cols.COL_USER_ID)));
        String email = getString(getColumnIndex(userTable.Cols.COL_USER_EMAIL));
        String password = getString(getColumnIndex(userTable.Cols.COL_USER_PASSWORD));

        user.setId(id);
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }
}
