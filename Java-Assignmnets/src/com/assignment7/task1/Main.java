package com.assignment7.task1;

public class Main {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();

        for(int i = 0; i < 3; i++){
            rodent[i].eat();
            rodent[i].run();
            System.out.println();
        }
    }
}
