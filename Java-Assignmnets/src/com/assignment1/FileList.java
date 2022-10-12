package com.assignment1;

import java.io.File;
import java.io.FilenameFilter;

public class FileList {

    public void listFilenames(String path){

        //create file object and give path from where (directory) we want to list all files
        File directory = new File(path);

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
