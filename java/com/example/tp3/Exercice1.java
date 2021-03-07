package com.example.tp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Exercice1 extends AppCompatActivity {

    private TextView id;
    private EditText nom;
    private EditText prenom;
    private EditText age;
    private EditText num;
    private EditText mdp;
    private Button button;
    private Button buttonBack;
    private TextView cpt;

    private int check = 0;
    private Utilisation usage;

    private Button goExo4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice1);

        id = (TextView) findViewById(R.id.id);
        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        age = (EditText) findViewById(R.id.age);
        num = (EditText) findViewById(R.id.num);
        mdp = (EditText) findViewById(R.id.mdp);
        button = (Button) findViewById(R.id.button);
        buttonBack = (Button) findViewById(R.id.buttonBack);

        goExo4 = (Button) findViewById(R.id.go_exo4);

        id.setText(genID());
        button.setEnabled(false);

        // Verif Text
        nom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().length() != 0){
                    check--;
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length() != 0){
                    check++;
                }
                button.setEnabled(check == 5);
            }
        });
        prenom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().length() != 0){
                    check--;
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length() != 0){
                    check++;
                }
                button.setEnabled(check == 5);
            }
        });
        age.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().length() != 0){
                    check--;
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length() != 0){
                    check++;
                }
                button.setEnabled(check == 5);
            }
        });
        num.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().length() != 0){
                    check--;
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length() != 0){
                    check++;
                }
                button.setEnabled(check == 5);
            }
        });
        mdp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if(s.toString().length() != 0){
                    check--;
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length() != 0){
                    check++;
                }
                button.setEnabled(check == 5);
            }
        });

        // Exercice 2
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OutputStreamWriter osw = new OutputStreamWriter(openFileOutput(
                            nom.getText().toString() + "," + prenom.getText().toString(), Context.MODE_PRIVATE));
                    String txt = "age : " + age.getText().toString() + '\n' +
                                "num : " + num.getText().toString() + '\n' +
                                "mdp : " + mdp.getText().toString() + '\n' ;
                    osw.write(txt);
                    osw.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Exercice 3
        cpt = (TextView) findViewById(R.id.cpt);
        usage = new Utilisation();

        // Exercice 4
        goExo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exo4 = new Intent(Exercice1.this, Exercice4.class);
                startActivity(exo4);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Exercice 3
        usage.reduceApp();
        cpt.setText("Lancement numéro : "+usage.getCpt());
    }

    // Exercice 2
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        mdp.setText("");
        super.onSaveInstanceState(outState);
        Toast.makeText(this, "Etat du save", Toast.LENGTH_SHORT).show();
    }

    // Exercice 2
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(this, "Etat du restore", Toast.LENGTH_SHORT).show();
    }

    // Exercice 2
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Destroy", Toast.LENGTH_SHORT).show();
    }

    // Exercice 2
    protected String genID(){
        int tmp = (int) (Math.random()*1000);
        return "id"+tmp;
    }
}