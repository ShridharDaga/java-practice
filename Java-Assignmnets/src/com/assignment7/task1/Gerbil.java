package com.assignment7.task1;

public class Gerbil extends Rodent{
    public Gerbil() {
        System.out.println("In Gerbil class...");
    }

    @Override
    void run() {
        System.out.println("Gerbil running...");
    }

    @Override
    void eat() {
        System.out.println("Gerbil eating...");
    }
}
