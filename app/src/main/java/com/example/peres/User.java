package com.example.peres;

import com.google.gson.annotations.SerializedName;

public class User {

    private int Id;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    private String photo;

    @SerializedName("password")
    private String password;

    public User(int Id, String name, String email, String photo, String password) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.photo = photo;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
