package com.assignment1;

import java.io.File;
import java.io.FilenameFilter;

public class Assignment1 {
    public static void main(String[] args) {

        //create file object and give path from where (directory) we want to list all files
        String path = "/home/srid/Java_Practice/POCs/Java-Book-Assignment/src";
        File directory = new File(path);

//        FilenameFilter nameFilter = new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                String fileName = name.toLowerCase();
//                if(fileName.endsWith(".java"))
//                    return true;
//                else
//                    return false;
//            }
//        };

        //filtering files for .java extension
        FilenameFilter nameFilter = (dir, name) -> name.toLowerCase().endsWith(".java"); // take ip from user

        //listing all filtered files
        File[] fileList = directory.listFiles(nameFilter);
        System.out.println("List of all .java files: ");

        if (fileList != null) {
            for(File f : fileList){
                System.out.println("name : " + f.getName());
                System.out.println("path : "+ f.getAbsolutePath());
                System.out.println();
            }
        }
    }
}
