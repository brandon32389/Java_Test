package com.example;

import java.time.LocalDate;

public class Student extends Person{
    // Fields
    private String majorCode;
    private float gpa;
    private boolean isRegistered;

    // Constructors
    public Student(){

    }

    public Student(String id, String fName, String lName, LocalDate dob, String email, String phone, String sts, String major, float g, boolean reg ){
        // Person Class fields
        setPersonId(id);
        setFirstName(fName);
        setLastName(lName);
        setBirthDate(dob);
        setEmailAddress(email);
        setPhone(phone);
        setStatus(sts);

        // Student fields.
        majorCode = major;
        gpa = g;
        isRegistered = reg;
    }

    public Student(String mc, float g, boolean reg){
        majorCode = mc;
        gpa = g;
        isRegistered = reg;
    }

    // Getter and Setter methods for the fields.
    public String getMajorCode(){return majorCode;};
    public void setMajorCode(String mc){this.majorCode = mc;}

    public float getGpa(){return gpa;};
    public void getGpa(float g){this.gpa = g;}

    public boolean getIsRegistered(){return isRegistered;};
    public void getIsRegistered(boolean r){this.isRegistered = r;}

    //Methods
    public void ChangeRegistrationStatus(boolean status) {
        isRegistered = status;
    }
}
