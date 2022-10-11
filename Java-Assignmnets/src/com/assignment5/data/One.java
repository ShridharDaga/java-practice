package com.assignment5.data;

import java.util.logging.Logger;

public class One {
    private int num;
    private char letter;
    private final static Logger LOG =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public void printMemberVariable(){
        LOG.info("First int member variable : "+num);
        LOG.info("Second char member variable : "+letter);
    }

    public void printLocalVariable(){
        String name;
        String city;

        LOG.warning("Can not print local variable as they are not initialised");
        // below code will give compile error
        // as local variables are not initialized
//        LOG.info(name);
//        LOG.info(city);
    }
}
