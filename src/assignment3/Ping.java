package assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ping
{
    static void commands(String host, Integer packets) throws Exception
    {
        //Running system call ping -c 3 hostname
        ProcessBuilder build = new ProcessBuilder("ping","-c", String.valueOf(packets),host);
        Process process = build.start();

        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        String s = null;
        //Store times in ArrayList
        ArrayList<Float> times = new ArrayList<>();

        //Read the output of ping command line by line
        while((s = input.readLine()) != null)
        {
            int index = s.indexOf("time=");
            //If time is present in line, add it to ArrayList
            if(index != -1){
                times.add(Float.parseFloat(s.substring(index + 5, s.indexOf("ms", index + 5))));
            }
        }

        int n = times.size();
        //Sorting times ArrayList
        Collections.sort(times);

        float median;
        //Calculate median for even number of packets
        if(n % 2 == 0){
            median = (times.get(n / 2) + times.get((n / 2) + 1)) / 2;
        }
        //Calculate median for odd number of packets
        else{
            median = times.get(n / 2);
        }
        //Print median
        System.out.println("Median time = " + median);

        //Handle error while reading ping output
        while((s = Error.readLine()) != null)
        {
            System.out.println("Exited with error" + s);
        }
    }

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String host = sc.next(); //Example Input: www.google.com
        Integer packets = sc.nextInt(); //Example Input: 3
        Ping.commands(host, packets);
    }
}

/**
 * Input:
 * www.google.com 3
 *
 * Output:
 * Median time = 57.6
 */