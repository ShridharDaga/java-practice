package com.assignmet12;

import java.util.List;

public class Task2 {
    public void solution2(List<Student> studentList){
        System.out.println("\n---Names of all students who have enrolled after 2018---");
        studentList.stream()
                .filter(s -> s.getYearOfEnroll() > 2018)
                .map(s -> s.getName())
                .forEach(System.out::println);
    }
}
