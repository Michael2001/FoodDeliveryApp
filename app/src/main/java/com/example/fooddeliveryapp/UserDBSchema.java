package com.example.fooddeliveryapp;

public class UserDBSchema {
    public static class userTable{
        public static final String NAME = "users";
        public static class Cols{
            public static final String COL_USER_ID = "user_id";
            public static final String COL_USER_EMAIL = "user_email";
            public static final String COL_USER_PASSWORD = "user_password";
        }
    }
}
