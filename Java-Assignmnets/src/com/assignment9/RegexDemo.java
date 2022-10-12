package com.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {
    public void check(String str){
        boolean match = Pattern.compile("^[A-Z].*\\.$").matcher(str).find();
        System.out.println("Is sentence begins with a capital letter and ends with a period. = " + match);
    }

}
