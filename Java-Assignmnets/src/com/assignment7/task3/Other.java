package com.assignment7.task3;

public class Other {
    public Other() {
        System.out.println("In Other class Constructor...");
    }

    public void method1(One one){
        one.callOne();
    }

    public void method2(Two two){
        two.callTwo();
    }

    public void method3(Three three){
        three.callThree();
    }

    public void method4(Four four){
        four.methodFour();;
    }

    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.method1(obj);
        obj.method2(obj);
        obj.method3(obj);
        obj.method4(obj);

    }
}
