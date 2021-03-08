package com.example.tp3;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"surname", "name"})
public class User {
    @NonNull
    @ColumnInfo(name = "surname")
    public String surname;

    @NonNull
    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "age")
    public String age;

    @ColumnInfo(name = "phone_number")
    public String phone_number;

    @ColumnInfo(name = "password")
    public String password;

    public User(String surname,String name,String age,String phone_number,String password){
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.password = password;
    }
}
