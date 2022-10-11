package com.assignment7.task2;

public class CycleMain {
    public static void main(String[] args) {
        //up-casting
        System.out.println("Up-casting : ");
        Cycle uni = (Cycle) new Unicycle();
        Cycle bi = (Cycle) new Bicycle();
        Cycle tri = (Cycle) new Tricycle();

        uni.balance();
        bi.balance();
        tri.balance();

        //down-casting
        System.out.println("Down-casting : ");
        Unicycle u = (Unicycle) uni;
        Bicycle b = (Bicycle) bi;
        Tricycle t = (Tricycle) tri;

        u.balance();
        b.balance();
        t.balance();
    }
}
