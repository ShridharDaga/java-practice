package com.assignmet12;

import java.util.List;

public class Task5 {
    public void solution5(List<Student> studentList){

        System.out.println("\n---Average age of male and female students---");
        System.out.println("Male Average age : "+
                studentList.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("male"))
                        .mapToInt(s -> s.getAge())
                        .average().orElse(0));
        System.out.println("Female Average age : "+
                studentList.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("female"))
                        .mapToInt(s -> s.getAge())
                        .average().orElse(0));
    }
}
