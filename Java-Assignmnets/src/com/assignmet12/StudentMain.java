package com.assignmet12;

import java.util.*;;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new StudentUtil().getStudentList();
        new Task1().solution1(studentList);
        new Task2().solution2(studentList);
        new Task3().solution3(studentList);
        new Task4().solution4(studentList);
        new Task5().solution5(studentList);
        new Task6().solution6(studentList);
        new Task7().solution7(studentList);
        new Task8().solution8(studentList);
        new Task9().solution9(studentList);
        new Task10().solution10(studentList);
    }
}
