package com.assignmet12;

import java.util.List;
import java.util.Optional;

public class Task9 {
    public void solution9(List<Student> studentList){

        System.out.println("\n---Details of youngest male student in the Electronic department---");
        Optional<Student> obj = studentList.stream()
                .filter(s -> s.getDept().equalsIgnoreCase("electronic"))
                .filter(s -> s.getGender().equalsIgnoreCase("male"))
                .min(((o1, o2) -> o1.getAge()));
        System.out.println(obj.isPresent() ? obj.get() : "Not found");
    }
}
