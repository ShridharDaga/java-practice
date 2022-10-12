package com.assignmet12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task4 {
    public void solution4(List<Student> studentList){
        System.out.println("\n---count of male and female students---");
        Map<String, List<Student>> grpByGender = studentList.stream().collect(Collectors.groupingBy(s -> s.getGender()));

        for(String s : grpByGender.keySet()){
            if(s.equalsIgnoreCase("male"))
                System.out.println("Male count: " + grpByGender.get(s).stream().count());
            else
                System.out.println("Female count: " + grpByGender.get(s).stream().count());
        }
    }
}
