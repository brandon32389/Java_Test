package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        // Create objects.
        University uni = new University("Avengers University");
        
        // create list that will hold file to allow insertion into the proper object in uni.
        List<String[]> fileResults = new ArrayList<String[]>();
        
        // Read file into  the fileResults list.
        File f = new File("C:\\Users\\Brandon\\IdeaProjects\\Java_Test\\src\\com\\example\\People.csv");
        Scanner reader = new Scanner(f);
        String[] row = new String[7];
        while (reader.hasNextLine()){
            String data = reader.nextLine();
            row = data.split(",");
            fileResults.add(row);
        }

        for (String[] r : fileResults) {
            System.out.println(Arrays.stream(r).toList());
        }

//        for(int i = 1; i < fileResults.size(); i++){
//            if (fileResults.get(i)[6] == "Employee"){
//                Employee e = new Employee();
//                e.setPersonId(fileResults.get(i)[0]);
//                e.setFirstName(fileResults.get(i)[1]);
//                e.setLastName(fileResults.get(i)[2]);
//                //e.setBirthDate(LocalDate.parse(fileResults.get(i)[3]));
//                e.setEmailAddress(fileResults.get(i)[4]);
//                e.setPhone(fileResults.get(i)[5]);
//                e.setStatus(fileResults.get(i)[6]);
//                uni.setEmployees(e);
//            }else {
//                Student s = new Student();
//                s.setPersonId(fileResults.get(i)[0]);
//                s.setFirstName(fileResults.get(i)[1]);
//                s.setLastName(fileResults.get(i)[2]);
//                //s.setBirthDate(LocalDate.parse(fileResults.get(i)[3]));
//                s.setEmailAddress(fileResults.get(i)[4]);
//                s.setPhone(fileResults.get(i)[5]);
//                s.setStatus(fileResults.get(i)[6]);
//                uni.setStudents(s);
//
//            }
//        }
    }
}
