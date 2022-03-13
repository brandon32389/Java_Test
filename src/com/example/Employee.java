package com.example;

import java.time.LocalDate;

public class Employee extends Person{
    //Fields
    private String jobTitle;
    private String departmentCode;
    private LocalDate hireDate;
    private LocalDate terminationDate;


    // Constructors
    public Employee(){

    }
    public Employee(String title, String dept, LocalDate hDate){
        jobTitle = title;
        departmentCode = dept;
        hireDate = hDate;
    }
    public Employee(String id, String fName, String lName, LocalDate dob, String email, String phone, String sts, String title, String dept, LocalDate hDate){
        // Person Class fields
        setPersonId(id);
        setFirstName(fName);
        setLastName(lName);
        setBirthDate(dob);
        setEmailAddress(email);
        setPhone(phone);
        setStatus(sts);

        // Employee class fields
        jobTitle = title;
        departmentCode = dept;
        hireDate = hDate;
    }

    // Getter and Setter methods for fields
    public String getJobTitle() {return jobTitle;}
    public void setJobTitle(String jt) { this.jobTitle = jt;}

    public String getDepartmentCode() {return departmentCode;}
    public void setDepartmentCode(String dc) { this.departmentCode = dc;}

    public LocalDate getHireDate() {return hireDate;}
    public void setHireDate(LocalDate hd) { this.hireDate = hd;}

    // Only method in class can terminate an Employee.
    public LocalDate getTerminationDate() {return terminationDate;}

    // Methods
    public void TerminateEmployee(LocalDate termDate) throws Exception{
        // Check that the termination date is not before the start of the job.
        if (termDate.isBefore(hireDate)){
            throw new Exception("Termination date before the start of the job");
        }else {
            terminationDate = termDate;
        }
    }
}
