package com.assignment4;

import java.time.LocalDate;

public class Assignment4 {
    public static void main(String[] args) {
        check("1998-07-16", "2017-06-27");
        check("2016-02-04", "2017-04-04");
        check("2017-04-05", "2017-04-04");
        check("2015-04-04", "2016-04-04");
        check("2015-04-04", "2016-03-15");
    }

    private static void check(String signup, String current) {

        // store string input to LocalDate
        LocalDate signupDate = LocalDate.parse(signup);
        LocalDate currentDate = LocalDate.parse(current);

        System.out.println("Signup Date : " +signupDate);
        System.out.println("Current date : " + currentDate);

        //end condition
        if(signupDate.isAfter(currentDate)){
            System.out.println("No Range\n");
        }

        else{
            LocalDate start;
            LocalDate end;
            start = signupDate;

            //find years of difference
            int diff = currentDate.getYear() - signupDate.getYear();
            if(diff >= 1){
                start = signupDate.plusYears(diff);  // match current date year
            }

            //+30 -30 condition
            start = start.minusDays(30);
            end =   start.plusDays(60);

            // after +30, end date should not be greater than current date
            if(end.isAfter(start)){
                end = currentDate;
            }

            System.out.println("KYC range : "+start +" to " + end);
            System.out.println();
        }
    }
}
