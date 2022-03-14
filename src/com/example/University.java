package com.example;

import java.util.List;

public class University {
    // Fields
    private String name;
    private List <Student> students;
    private List <Employee> employees;

    // Constructors
    public University(){

    }
    public University(String n){
        name = n;
    }

    // Getter and Setter methods for fields
    public String getName(){return name;}
    public void setName(String n){name = n;}

    public List<Student> getStudents(){return students;}
    public void setStudents (Student s){students.add(s);}
    public List<Employee> getEmployees(){return employees;}
    public void setEmployees (Employee e){employees.add(e);}
}
