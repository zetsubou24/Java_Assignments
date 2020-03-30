package assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ping
{
    static void commands(String host) throws Exception
    {
        ProcessBuilder build = new ProcessBuilder("ping","-c","3",host);
        Process process = build.start();

        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        String s = null;
        ArrayList<Float> times = new ArrayList<>();

        while((s = input.readLine()) != null)
        {
            int index = s.indexOf("time=");
            if(index != -1){
                times.add(Float.parseFloat(s.substring(index + 5, s.indexOf("ms", index + 5))));
            }
        }

        int n = times.size();
        float median;
        if(n % 2 == 0){
            median = (times.get(n / 2) + times.get((n / 2) + 1)) / 2;
        }
        else{
            median = times.get(n / 2);
        }
        System.out.println("Median time = " + median);

        while((s = Error.readLine()) != null)
        {
            System.out.println("Exited with error" + s);
        }
    }

    public static void main(String args[]) throws Exception
    {
        Ping.commands("www.google.com");
    }
}
