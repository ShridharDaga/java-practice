package com.assignment2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input : ");
        String input = sc.nextLine();
        check(input);
    }

    private static void check(String input) {
        // .count have long as return type. Time complexity will be O(n)
        long c = input.toLowerCase().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .distinct()
                .count();

        if(c == 26)
            System.out.println(input+" : string contains all alphabets (a-z)");
        else
            System.out.println(input+" : string not contains all alphabets(a-z)");

        System.out.println();
    }
}
