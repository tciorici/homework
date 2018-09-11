package com.company;

public class TestBloodData {

    public static void main(String[] args) {

        BloodData basicBlood = new BloodData();
        BloodData blood = new BloodData("AB", "-");

        System.out.println("Info for basic blood:");
        System.out.println("Blood type: " + basicBlood.bloodType);
        System.out.println("RH Factor type: " + basicBlood.rhFactor);

        System.out.println("\nInfo for not ordinary blood:");
        System.out.println("Blood type: " + blood.getBloodType());
        System.out.println("RH Factor type: " + blood.getRhFactor());


        Patient basicPatient = new Patient();
        Patient patient = new Patient(25, 12345, "B", "+");

        System.out.println("\nInfo about 'basic' patient");
        System.out.println("Age: " + basicPatient.age);
        System.out.println("ID number: " + basicPatient.idNumber);
        System.out.println("Blood type: " + basicPatient.bloodType);
        System.out.println("RH Factor: " + basicPatient.rhFactor);

        System.out.println("\nInfo about not ordinary patient");
        System.out.println("Age: " + patient.age);
        System.out.println("ID number: " + patient.idNumber);
        System.out.println("Blood type: " + patient.bloodType);
        System.out.println("RH Factor: " + patient.rhFactor);

        System.out.println("\nTest for inserting a incorrect blood type");
        blood.setBloodType("D");



    }


}
