package com.assignment6.task2;

public class OverloadConstructor {
    private String name;

    public OverloadConstructor() {
        this("Harry");
    }

    public OverloadConstructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        OverloadConstructor obj1 = new OverloadConstructor("Shridhar");
        OverloadConstructor obj2 = new OverloadConstructor();

        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
    }
}


