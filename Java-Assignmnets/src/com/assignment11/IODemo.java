package com.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IODemo {
    private Map<Character,Integer> map = new HashMap<>();
    private String arg;
    private String path = "src/com/assignment11/";

    public IODemo(String arg) {
        this.arg = arg;
    }

    //reading file
    public void readFile(){
        Scanner inFile;

        try {
            inFile = new Scanner(new File(path + arg));
            while (inFile.hasNext()){
                String word = inFile.next();
                addToMap(word);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    //store count of each character in map
    private void addToMap(String word) {
        char [] chars = word.toCharArray();
        for(Character c : chars){
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c,1);
        }
    }

    //write into file
    public void writeFile(){
        PrintWriter pw;
        try {
            pw = new PrintWriter(path+"output.txt");
            map.forEach((k,v) -> pw.println(k + " : "+ v));
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        IODemo obj = new IODemo("input.txt");
        obj.readFile();
        obj.writeFile();
    }
}
