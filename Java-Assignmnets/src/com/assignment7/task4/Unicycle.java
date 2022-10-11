package com.assignment7.task4;

public class Unicycle implements Cycle{
    @Override
    public void cost() {
        System.out.println("Unicycle cost is $250");
    }

    @Override
    public void balance() {
        System.out.println("balancing for Unicycle is tough");
    }
}
