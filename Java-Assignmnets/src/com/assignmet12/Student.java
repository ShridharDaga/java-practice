package com.assignmet12;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String dept;
    private int yearOfEnroll;
    private double perTillDate;

    public Student(int id, String name, int age, String gender, String dept, int yearOfEnroll, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.yearOfEnroll = yearOfEnroll;
        this.perTillDate = perTillDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getYearOfEnroll() {
        return yearOfEnroll;
    }

    public void setYearOfEnroll(int yearOfEnroll) {
        this.yearOfEnroll = yearOfEnroll;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public void setPerTillDate(double perTillDate) {
        this.perTillDate = perTillDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", yearOfEnroll=" + yearOfEnroll +
                ", perTillDate=" + perTillDate +
                '}';
    }
}
