package com.assignment8;

import java.util.logging.Logger;

public class ExceptionHandling {

    private static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        ExceptionHandling exp = new ExceptionHandling();
        try{
            exp.check(20,123456,null);
        }
        catch (InvalidName | InvalidAge | InvalidPinCode exception){
            LOG.warning(exception.getMessage());
        }
        finally {
            LOG.info("In finally block");
        }
    }

    public void check(int age, int pincode, String name) throws InvalidAge, InvalidPinCode, InvalidName {
        if(age < 18 || age > 60)
            throw new InvalidAge("Age should be between 18-60");
        if(String.valueOf(pincode).length() != 6)
            throw new InvalidPinCode("Pin-code must be of 6 digits");
        if(name.length() < 3 || name.strip().length() < 3)
            throw new InvalidName("Name should not be empty or less than 2 letters");
    }
}
