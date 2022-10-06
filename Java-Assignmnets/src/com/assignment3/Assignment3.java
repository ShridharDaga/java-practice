package com.assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Assignment3 {

    public static void main(String[] args) throws Exception {
        String ipAddr1 = "127.0.0.1";
        String ipAddr2 = "www.youtube.com";

        ping(ipAddr1);
        ping(ipAddr2);

        ArrayList<String> commandList = new ArrayList<String>();

        commandList.add("ping");
        commandList.add("www.google.com");

        commands(commandList);

    }

    public static void ping(String host) {
        Instant startTime = Instant.now();
        InetAddress address = null;
        try {
            address = InetAddress.getByName(host);
            if (address.isReachable(1000)) {
                System.out.println("Reachable host : " + host);
                System.out.println("time in nano seconds: " + Duration.between(startTime, Instant.now()).getNano());
                System.out.println();
            } else {
                System.out.println("Non reachable host : " + host);
                System.out.println("time in seconds:" + Duration.between(startTime, Instant.now()).getSeconds());
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(host + " host is not available");
        }

    }

    // method for finding the ping statics of website
    static void commands(ArrayList<String> commandList) throws Exception {

        // creating the sub process, execute system command
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        // to read the output
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        String s = null;

        System.out.println("Standard output: ");
        int count = 0;
        while((s = input.readLine()) != null && count != 5) {
            System.out.println(s);
            count++;
        }

        System.out.println("\nerror (if any): ");
        while((s = Error.readLine()) != null ) {
            System.out.println(s);
        }
    }


}
