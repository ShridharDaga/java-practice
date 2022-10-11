package com.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        boolean match = Pattern.compile("^[A-Z].*\\.$").matcher(sentence).find();
        System.out.println("Is sentence begins with a capital letter and ends with a period. = " + match);
    }
}
