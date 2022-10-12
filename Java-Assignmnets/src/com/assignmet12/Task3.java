package com.assignmet12;

import java.util.List;

public class Task3 {
    public void solution3(List<Student> studentList){
        System.out.println("\n---Details of all male student in the computer science department---");
        studentList.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .filter(s -> s.getDept().equalsIgnoreCase("Computer Science"))
                .forEach(System.out::println);
    }
}
