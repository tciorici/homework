package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel (String model){

        this.model = model;
    }

    public String getModel (){
        return this.model;
    }

    public void setDoors (int numOfDoors){
        this.doors = numOfDoors;
    }

    public int getDoors (){
        return this.doors;
    }

}
