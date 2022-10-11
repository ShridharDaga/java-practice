package com.assignment5.main;

import com.assignment5.data.One;
import com.assignment5.singleton.Two;

import java.util.logging.Logger;

public class Main {
    private final static Logger LOG =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        One one = new One();
        Two two = new Two("India");

        one.printLocalVariable();
        one.printMemberVariable();

        two.display(); //non static method
        LOG.info("calling static method : "+Two.print("Bharat"));
    }
}
