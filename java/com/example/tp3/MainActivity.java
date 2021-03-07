package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goExo1;
    private Button goExo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goExo1 = (Button) findViewById(R.id.go_exo1);
        goExo2 = (Button) findViewById(R.id.go_exo2);

        goExo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo1 = new Intent(MainActivity.this, Exercice1.class);
                startActivity(exo1);
            }
        });
        goExo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo3 = new Intent(MainActivity.this, Exercice2.class);
                startActivity(exo3);
            }
        });
    }
}