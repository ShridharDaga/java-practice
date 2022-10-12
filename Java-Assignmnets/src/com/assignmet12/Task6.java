package com.assignmet12;

import java.util.List;

public class Task6 {
    public void solution6(List<Student> studentList){

        System.out.println("\n---Details of highest student having highest percentage ---");
        double highestPer = studentList.stream()
                .mapToDouble(s -> s.getPerTillDate())
                .max().orElse(0);
        studentList.stream()
                .filter(s -> s.getPerTillDate() == highestPer)
                .forEach(System.out::println);
    }
}
