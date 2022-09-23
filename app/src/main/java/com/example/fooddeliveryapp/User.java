package com.example.fooddeliveryapp;

public class User {
    private String id;
    private String email;
    private String password;

    public User(String id, String email, String password) {
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
