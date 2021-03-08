package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class Exercice6 extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice6);

        text = (TextView) findViewById(R.id.text6);

        String data = "";


        Database db = Room.databaseBuilder(getApplicationContext(), Database.class, "database_TP3").build();
        UserDao userDao = db.userDao();
        List<User> users = userDao.getUsers();
/*
        for(User u : users){
            data += u.surname+", "+u.name+", "+u.age+", "+u.phone+", "+u.pass+"\n";
        }
*/
        text.setText(data);
    }
}