package com.assignment7.task5;

public class OuterOne {
    public OuterOne() {
        System.out.println("In Outer-One class...");
    }

    class InnerOne{
        InnerOne(String name){
            System.out.println("In Inner-One class...");
            System.out.println("name : "+ name);
        }
    }
}
