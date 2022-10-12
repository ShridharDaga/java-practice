package com.assignment7.task4;

public class Main {
    public static void main(String[] args) {

        CycleFactory cf = new CycleFactory();
        Cycle c = cf.chooseType("tricycle");
        c.balance();
        c.cost();
    }
}
