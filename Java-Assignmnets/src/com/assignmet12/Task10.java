package com.assignmet12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task10 {
    public void solution10(List<Student> studentList){

        System.out.println("\n---Male and female students are there in the computer science department---");
        Map<String , List<Student>> compSci = studentList.stream()
                .filter(s -> s.getDept().equalsIgnoreCase("computer science"))
                .collect(Collectors.groupingBy(s -> s.getGender()));

        for(String s : compSci.keySet()){
            if(s.equalsIgnoreCase("male"))
                System.out.println("Male count: " + compSci.get(s).stream().count());
            else
                System.out.println("Female count: " + compSci.get(s).stream().count());
        }
    }
}
