package com.assignment2;

public class Assignment2 {
    public static void main(String[] args) {
        String input1 = "Shridhar";
        String input2 = "abcdefghijklmnopqrstuvwxyz";
        String input3 = "abcdefghijklmnopqrstuvwxyz9876541230";

        long start = System.currentTimeMillis();
        check(input1);
        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time in milli seconds: "+ (end-start)); // 6-9 milli seconds

//        check(input2);
//        check(input3);
    }

    private static void check(String input) {
        // .count have long as return type
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
