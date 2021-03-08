package com.example.tp3;

import androidx.lifecycle.ViewModel;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class viewPlanning extends ViewModel {
    private PlanningModel planning;
    viewPlanning(PlanningModel pm){ planning = pm; }

    public PlanningModel getData(){
        if( planning == null){
            planning = new PlanningModel();
            load();
        }
        return planning;
    }

    private void load(){
        Handler myHandler = new Handler() {
            @Override
            public void publish(LogRecord record) {

            }

            @Override
            public void flush() {

            }

            @Override
            public void close() throws SecurityException {

            }
        };

    }
}
