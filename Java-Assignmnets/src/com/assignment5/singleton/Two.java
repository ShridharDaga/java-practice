package com.assignment5.singleton;

import java.util.logging.Logger;

public class Two {
    private String country;
    private final static Logger LOG =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public Two(String country) {
        this.country = country;
    }

    public static Two print(String s){
        return new Two(s);
    }

    public void display(){
        LOG.info("String Member variable : " + country);
    }

    @Override
    public String toString() {
        return "Two{" +
                "country='" + country + '\'' +
                '}';
    }
}
