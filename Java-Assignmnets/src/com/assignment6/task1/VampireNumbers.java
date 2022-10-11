package com.assignment6.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VampireNumbers{
    public static boolean check(int num, int factor1, int factor2){
        //No trailing zero with both factor
        if((""+factor1).endsWith("0") && (""+factor2).endsWith("0"))
            return false;

        //Checking number of digits to verify factor condition
        int len = countDigits(num) / 2;
        if(countDigits(factor1) != len || countDigits(factor2) != len)
            return false;

        //Converting to char array so that we can easily check if original number and factors are equal or not
        char[] numChars = (""+num).toCharArray();
        char[] factorChars = ("" + factor1 + factor2).toCharArray();

        Arrays.sort(numChars);
        Arrays.sort(factorChars);
        return Arrays.equals(numChars, factorChars);
    }

    //Find number of digits present in a number
    public static int countDigits(int num){
        return Long.toString(Math.abs(num)).length();
    }

    public static void main(String[] args){

        Set<Integer> set = new HashSet<>();
        int i;

        // starting from first vampire number 1260
        for(i = 1260; set.size() < 101; i++ ){
            //Check number of digits to verify even number of digits condition
            if((countDigits(i) % 2) != 0) {
                i = i * 10 - 1; // to make next even number of digits
                continue;
            }

            for(int factor1 = 10; factor1 <= Math.sqrt(i) + 1; factor1++){
                if(i % factor1 == 0){
                    int factor2 = i / factor1;
                    if(check(i, factor1, factor2)){
                        set.add(i);
                        System.out.println(i + ": (" + factor1 + "*" + factor2 +")");
                    }
                }
            }
        }
    }
}
