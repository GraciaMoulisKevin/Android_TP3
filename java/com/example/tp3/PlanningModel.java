package com.example.tp3;

public class PlanningModel {
    private String[] planning = new String[4];
    public PlanningModel(){
        planning[0] = "default1";
        planning[1] = "default2";
        planning[2] = "default3";
        planning[3] = "default4";
    }

    public void put1(String x){
        planning[0] = x;
    }
    public void put2(String x){
        planning[1] = x;
    }
    public void put3(String x){
        planning[2] = x;
    }
    public void put4(String x){
        planning[3] = x;
    }

    public void update(String[] data){ planning = data; }

    public String get1(){
        return planning[0];
    }
    public String get2(){
        return planning[1];
    }
    public String get3(){
        return planning[2];
    }
    public String get4(){
        return planning[3];
    }

}
