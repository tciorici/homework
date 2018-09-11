package com.company;

//Create a class named Patient that includes an ID number, age, and BloodData.
//Provide a default constructor that sets the ID number to “0”, the age to 0, and the
//BloodData to “O” and “+”. Create an overloaded constructor that provides values
//for each field. Also provide get methods for each field. Save the file as Patient.java.
//Create an application that demonstrates that each method works correctly, and
//save it as TestPatient.java


public class Patient {

    public int idNumber;
    public int age;
    public String bloodType;
    public String rhFactor;


    public Patient(){
        this.age = 0;
        this.idNumber = 0;
        this.bloodType = "A";
        this.rhFactor = "+";

    }

    public Patient(int age, int idNumber, String bloodType, String rhFactor){
        this.age = age;
        this.idNumber = idNumber;
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;

    }


    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}
