package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.widget.TextView;

public class Exercice4 extends AppCompatActivity {

    private TextView t1, t2, t3, t4;
    private PlanningModel planning;

    private viewPlanning viewPlanning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice4);

        t1 = (TextView) findViewById(R.id.premier);
        t2 = (TextView) findViewById(R.id.second);
        t3 = (TextView) findViewById(R.id.troisieme);
        t4 = (TextView) findViewById(R.id.quatrieme);

        planning = new PlanningModel();

        t1.setText("08h-10h : "+planning.get1());
        t2.setText("10h-12h : "+planning.get2());
        t3.setText("14h-16h : "+planning.get3());
        t4.setText("16h-18h : "+planning.get4());

        // Exercice 5
        viewPlanning = new viewPlanning(planning);
        planning = viewPlanning.getData();

        //planning.update(data);

    }
}