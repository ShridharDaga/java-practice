package com.assignmet12;

import java.util.*;;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println("---All departments in college---");
        studentList.stream()
                .map(s -> s.getDept())
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n---Names of all students who have enrolled after 2018---");
        studentList.stream()
                .filter(s -> s.getYearOfEnroll() > 2018)
                .map(s -> s.getName())
                .forEach(System.out::println);

        System.out.println("\n---Details of all male student in the computer science department---");
        studentList.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .filter(s -> s.getDept().equalsIgnoreCase("Computer Science"))
                .forEach(System.out::println);

        System.out.println("\n---count of male and female students---");
        Map<String, List<Student>> grpByGender = studentList.stream().collect(Collectors.groupingBy(s -> s.getGender()));

        for(String s : grpByGender.keySet()){
            if(s.equalsIgnoreCase("male"))
                System.out.println("Male count: " + grpByGender.get(s).stream().count());
            else
                System.out.println("Female count: " + grpByGender.get(s).stream().count());
        }

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

        System.out.println("\n---Details of highest student having highest percentage ---");
        double highestPer = studentList.stream()
                            .mapToDouble(s -> s.getPerTillDate())
                            .max().orElse(0);
        studentList.stream()
                .filter(s -> s.getPerTillDate() == highestPer)
                .forEach(System.out::println);

        System.out.println("\n---Number of students in each department---");
        Map<String, List<Student>> grpByDept = studentList.stream().collect(Collectors.groupingBy(s -> s.getDept()));

        for(String s : grpByDept.keySet()){
            System.out.println(s+ " : " + grpByDept.get(s).stream().count());
        }

        System.out.println("\n---Average percentage achieved in each department---");
        for(String s : grpByDept.keySet()){
            System.out.println(s+ " : " + grpByDept.get(s)
                                            .stream()
                                            .mapToDouble(p -> p.getPerTillDate())
                                            .average().orElse(0));
        }

        System.out.println("\n---Details of youngest male student in the Electronic department---");
        Optional<Student> obj = studentList.stream()
                                .filter(s -> s.getDept().equalsIgnoreCase("electronic"))
                                .filter(s -> s.getGender().equalsIgnoreCase("male"))
                                .min(((o1, o2) -> o1.getAge()));
        System.out.println(obj.isPresent() ? obj.get() : "Not found");

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
