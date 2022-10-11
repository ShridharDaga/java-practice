package com.assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment3 {

    public static void main(String[] args) throws Exception {
        String ipAddr1 = "127.0.0.1";
        String ipAddr2 = "www.youtube.com";

        ping(ipAddr1);
        ping(ipAddr2);

    }
    public static void ping(String host) {

        InetAddress address;
        List<Integer> reachableMedian = new ArrayList<>();
        List<Integer> unreachableMedian = new ArrayList<>();
        boolean flag = false;

        try {
            address = InetAddress.getByName(host);
            for(int i = 0; i < 5 ;i++) {
                Instant startTime = Instant.now();
                if (address.isReachable(1000)) {
                    reachableMedian.add(Duration.between(startTime, Instant.now()).getNano());
                    flag = true;
                } else {
                    unreachableMedian.add(Duration.between(startTime, Instant.now()).getNano());
                }
            }
        } catch (IOException e) {
            System.out.println(host + " host is not available");
        }


        if(flag){
            Collections.sort(reachableMedian);
            double floor = Math.floor(reachableMedian.size() / 2);
            System.out.println("Median time taken to ping reachable host (" + host + ") : " + reachableMedian.get((int) floor) + " nano seconds");
        }
        else{
            Collections.sort(unreachableMedian);
            double floor2 = Math.floor(unreachableMedian.size() / 2);
            System.out.println("Median time taken to ping unreachable host (" + host + ") : " + unreachableMedian.get((int) floor2) + " nano seconds");
        }
    }
}
