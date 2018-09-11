package com.company;

//Create a class named BloodData that includes fields that hold a blood type (the
//four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
//Create a default constructor that sets the fields to “O” and “+”, and an overloaded
//constructor that requires values for both fields. Include get and set methods for
//each field. Save this file as BloodData.java. Create an application named
//TestBloodData that demonstrates each method works correctly. Save the
//application as TestBloodData.java.

public class BloodData {

    public String bloodType;
    public String rhFactor;

    public BloodData(){
        setBloodType("0");
        setRhFactor("+");
    }

    public BloodData(String bloodType, String rhFactor){
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        if (bloodType.equals("0") || bloodType.equals("A") ||
            bloodType.equals("B") || bloodType.equals("AB")) {
            this.bloodType = bloodType;
        } else {
            System.out.println("Invalid blood type");
        }
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {

        if (rhFactor.equals("+") || rhFactor.equals("-")){
        this.rhFactor = rhFactor;} else {
            System.out.println("Invalid RH Factor type");
        }
    }
}
