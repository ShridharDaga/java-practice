package com.assignment7.task1;

public class Mouse extends Rodent{
    public Mouse() {
        System.out.println("In Mouse class...");
    }

    @Override
    void run() {
        System.out.println("Mouse running...");
    }

    @Override
    void eat() {
        System.out.println("Mouse eating...");
    }
}
