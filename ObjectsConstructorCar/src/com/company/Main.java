package com.company;

public class Main {

    public static void main(String[] args) {

        Car dacia = new Car();

        dacia.setModel("Logan");
        dacia.setDoors(4);
        System.out.println("Model of dacia is " + dacia.getModel());
        System.out.println("and has " + dacia.getDoors()
                + " doors");
    }
}
