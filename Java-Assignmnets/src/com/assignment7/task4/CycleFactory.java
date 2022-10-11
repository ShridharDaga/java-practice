package com.assignment7.task4;

public class CycleFactory {
    public Cycle chooseType(String type){
        if(type == null || type.isEmpty())
            return null;
        switch (type.toLowerCase()){
            case "unicycle":
                return new Unicycle();
            case "bicycle" :
                return new Bicycle();
            case "tricycle" :
                return new Tricycle();
            default:
                throw new IllegalArgumentException("Unknown cycle type : " + type);
        }

    }
}
