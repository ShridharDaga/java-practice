package com.assignment7.task4;

public class Bicycle implements Cycle{
    @Override
    public void cost() {
        System.out.println("Bicycle cost is $350");
    }

    @Override
    public void balance() {
        System.out.println("Balancing for bicycle is comparatively easy");
    }
}
