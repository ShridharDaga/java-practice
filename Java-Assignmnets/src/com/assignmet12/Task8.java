package com.assignmet12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public void solution8(List<Student> studentList){
        System.out.println("\n---Average percentage achieved in each department---");
        Map<String, List<Student>> grpByDept = studentList.stream().collect(Collectors.groupingBy(s -> s.getDept()));
        for(String s : grpByDept.keySet()){
            System.out.println(s+ " : " + grpByDept.get(s)
                    .stream()
                    .mapToDouble(p -> p.getPerTillDate())
                    .average().orElse(0));
        }
    }
}
