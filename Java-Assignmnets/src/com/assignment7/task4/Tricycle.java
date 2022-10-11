package com.assignment7.task4;

public class Tricycle implements Cycle{

    @Override
    public void cost() {
        System.out.println("Tricycle cost is $400");
    }

    @Override
    public void balance() {
        System.out.println("Balancing for tricycle is easy");
    }
}
