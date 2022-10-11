package com.assignment7.task3;

public class ConcreteClass extends Other implements Four{
    @Override
    public void methodFour() {
        System.out.println("In Method Four...");
    }

    @Override
    public void printOne() {
        System.out.println("Printing One...");
    }

    @Override
    public void callOne() {
        System.out.println("Calling One...");
    }

    @Override
    public void printThree() {
        System.out.println("Printing Three...");
    }

    @Override
    public void callThree() {
        System.out.println("Calling Three...");
    }

    @Override
    public void printTwo() {
        System.out.println("Printing Two...");
    }

    @Override
    public void callTwo() {
        System.out.println("Calling Two...");
    }
}
