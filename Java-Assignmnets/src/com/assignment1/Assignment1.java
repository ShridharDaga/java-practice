package com.assignment1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public class Assignment1 {
    public static void main(String[] args) {

        File directory = new File("/home/srid/Java_Practice/POCs/Java-Book-Assignment/src");

        //filtering files for .java extension
        FilenameFilter nameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String fileName = name.toLowerCase();
                if(fileName.endsWith(".java"))
                    return true;
                else
                    return false;
            }
        };

        //listing all filtered files
        File fileList[] = directory.listFiles(nameFilter);
        System.out.println("List of all .java files: ");

        for(File f : fileList){
            System.out.println("name : " + f.getName());
            System.out.println("path : "+ f.getAbsolutePath());
            System.out.println();
        }
    }
}
