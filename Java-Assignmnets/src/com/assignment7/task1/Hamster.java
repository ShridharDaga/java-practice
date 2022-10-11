package com.assignment7.task1;

public class Hamster extends Rodent{
    public Hamster() {
        System.out.println("In Hamster class...");
    }

    @Override
    void run() {
        System.out.println("Hamster running...");
    }

    @Override
    void eat() {
        System.out.println("Hamster eating...");
    }
}
