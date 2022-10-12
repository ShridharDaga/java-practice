package com.assignment4;

public class Assignment4 {
    public static void main(String[] args) {
        KYCDemo obj1 = new KYCDemo();
        obj1.check("1998-07-16", "2017-06-27");
        KYCDemo obj2 = new KYCDemo();
        obj2.check("2016-02-04", "2017-04-04");
        KYCDemo obj3 = new KYCDemo();
        obj3.check("2017-04-05", "2017-04-04");
        KYCDemo obj4 = new KYCDemo();
        obj4.check("2015-04-04", "2016-04-04");
        KYCDemo obj5 = new KYCDemo();
        obj5.check("2015-04-04", "2016-03-15");
    }


}
