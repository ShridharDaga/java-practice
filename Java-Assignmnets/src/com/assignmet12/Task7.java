package com.assignmet12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task7 {
        public void solution7(List<Student> studentList){
        System.out.println("\n---Number of students in each department---");
        Map<String, List<Student>> grpByDept = studentList.stream().collect(Collectors.groupingBy(s -> s.getDept()));

        for(String s : grpByDept.keySet()){
            System.out.println(s+ " : " + grpByDept.get(s).stream().count());
        }
    }
}
