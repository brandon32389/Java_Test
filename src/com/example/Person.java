package com.example;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    // Person internal fields.
    private String PersonId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String emailAddress;
    private String phoneNumber;
    private String status;

    //constructors
    public Person(){

    }
    public Person (String id,String fName, String lName, LocalDate dob, String email, String phone, String stat){
        PersonId = id;
        firstName = fName;
        lastName = lName;
        birthDate = dob;
        emailAddress = email;
        phoneNumber = phone;
        status = stat;
    }

    // Getter and setter properties for internal fields.
    public String getPersonId() {return PersonId;}
    public void setPersonId(String fn) { this.PersonId = fn;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String fn) { this.firstName = fn;}

    public String getLastName() {return lastName;}
    public void setLastName(String ln) { this.lastName = ln;}

    public LocalDate getBirthDate() {return birthDate;}
    public void setBirthDate(LocalDate bd) { this.birthDate = bd;}

    public String getEmailAddress() {return emailAddress;}
    public void setEmailAddress(String ea) { this.emailAddress = ea;}

    public String getPhone() {return phoneNumber;}
    public void setPhone(String p) { this.phoneNumber = p;}

    public String getStatus() {return status;}
    public void setStatus(String ea) { this.status = ea;}

    //Methods
    public int GetAge(){
        LocalDate today = LocalDate.now();

        return Period.between(birthDate,today).getYears();
    }
    public void CleanPhoneNumber(){
        phoneNumber = phoneNumber.replace("(","").replace(")","").replace("-","").replace(" ","");
    }
    public void ChangeStatus (String newStatus) throws Exception{
        if (newStatus != null){
            status = newStatus;
        }else {
            throw  new Exception("A persons status cannot be null.");
        }
    }
}
