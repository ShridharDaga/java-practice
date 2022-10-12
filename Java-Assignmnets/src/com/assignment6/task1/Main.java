package com.assignment6.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        Set<Integer> set = new HashSet<>();
        int i;
        VampireNumbers obj = new VampireNumbers();

        // starting from first vampire number 1260
        for(i = 1260; set.size() < 101; i++ ){
            //Check number of digits to verify even number of digits condition
            if((obj.countDigits(i) % 2) != 0) {
                i = i * 10 - 1; // to make next even number of digits
                continue;
            }

            for(int factor1 = 10; factor1 <= Math.sqrt(i) + 1; factor1++){
                if(i % factor1 == 0){
                    int factor2 = i / factor1;
                    if(obj.check(i, factor1, factor2)){
                        set.add(i);
                        System.out.println(i + ": (" + factor1 + "*" + factor2 +")");
                    }
                }
            }
        }
    }
}
