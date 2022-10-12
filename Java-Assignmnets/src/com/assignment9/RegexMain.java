package com.assignment9;

import java.util.Scanner;

public class RegexMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        RegexDemo obj = new RegexDemo();
        obj.check(sentence);
    }
}
