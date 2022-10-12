package com.assignmet12;

import java.util.List;

public class Task1 {
    public void solution1(List<Student> studentList){
        System.out.println("---All departments in college---");
        studentList.stream()
                .map(s -> s.getDept())
                .distinct()
                .forEach(System.out::println);
    }
}
