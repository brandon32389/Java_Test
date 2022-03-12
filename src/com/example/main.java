package com.example;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
       Person p1 = new Person(
               "Bruce"
               ,"Wayne"
               ,LocalDate.parse("1915-04-17")
               ,"notbatman@batcave.com"
               ,"(555) 555-5555"
       );
        Person p2 = new Person(
                "Tony"
                ,"Stark"
                ,LocalDate.parse("1970-05-29")
                ,"iamironman@avengers.com"
                ,"555-555-5555"
        );

        System.out.println("Phone number before Cleaning: " + p1.getPhone());
        p1.CleanPhoneNumber();
        System.out.println("Phone number after Cleaning: " + p1.getPhone());

        System.out.println(p1.getFirstName() + " " + p1.getLastName() + "'s birthday is " + p1.getBirthDate() +". He is " + p1.GetAge() + " years old!");

        System.out.println("Phone number before Cleaning: " + p2.getPhone());
        p2.CleanPhoneNumber();
        System.out.println("Phone number after Cleaning: " + p2.getPhone());

        System.out.println(p2.getFirstName() + " " + p2.getLastName() + "'s birthday is " + p2.getBirthDate() +". He is " + p2.GetAge() + " years old!");
    }
}
