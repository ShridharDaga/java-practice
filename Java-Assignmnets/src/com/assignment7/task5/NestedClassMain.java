package com.assignment7.task5;

public class NestedClassMain {
    public static void main(String[] args) {

        OuterTwo outerTwo = new OuterTwo();
        OuterTwo.InnerTwo innerTwo = outerTwo.new InnerTwo("Shridhar");

        System.out.println(innerTwo.getClass());
    }
}
