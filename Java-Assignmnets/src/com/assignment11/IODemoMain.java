package com.assignment11;

public class IODemoMain {
    public static void main(String[] args) {
        IODemo obj = new IODemo("input.txt");
        obj.readFile();
        obj.writeFile();
    }
}
