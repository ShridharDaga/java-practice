package com.assignment7.task5;

public class OuterTwo extends OuterOne{
    public OuterTwo() {
        System.out.println("In Outer-Two class...");
    }

    class InnerTwo extends OuterOne.InnerOne {

        InnerTwo(String name) {
            super(name);
        }
    }
}
