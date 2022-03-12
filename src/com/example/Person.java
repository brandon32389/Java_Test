package com.example;

import java.util.Date;

public class Person {
    // Person fields.
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String emailAddress;
    private String phone;

    // Getter and setter for internal fields
    public String getFirstName() {return firstName;}
    public void setFirstName(String fn) { this.firstName = fn;}

    public String getLastName() {return lastName;}
    public void setLastName(String ln) { this.lastName = ln;}

    public Date getL() {return birthDate;}
    public void setBirthDate(Date bd) { this.birthDate = bd;}

    public String getEmailAddress() {return emailAddress;}
    public void setEmailAddress(String ea) { this.emailAddress = ea;}

    public String getPhone() {return phone;}
    public void setPhone(String p) { this.phone = p;}

//    public int GetAge(){
//       Date today = new Date();
////        ZoneId zonedId = ZoneId.of( "America/Montreal" );
////        LocalDate today = LocalDate.now( zonedId );
////        System.out.println( "today : " + today );
//    }
}
