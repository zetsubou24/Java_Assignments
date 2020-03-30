package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Gruber {

    public void getTimeRange(String signup, String curr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        LocalDate signupDate = LocalDate.parse(signup, formatter);
        LocalDate currDate = LocalDate.parse(curr, formatter);

        if(currDate.getYear() <= signupDate.getYear()) {
            System.out.println("No Range");
        }
        else{
            int yearDiff = signupDate.getYear() - currDate.getYear();
            signupDate = signupDate.minusYears(yearDiff);
            LocalDate startWindow = signupDate.minusDays(30);
            LocalDate stopWindow = signupDate.minusDays(-30);
            if(currDate.compareTo(stopWindow) < 0){
                stopWindow = currDate;
            }
            System.out.println(startWindow.format(formatter) + " " + stopWindow.format(formatter));
        }
    }

    public static void main(String[] args) {
        Gruber gruber = new Gruber();
        int noOfQueries;
        Scanner sc = new Scanner(System.in);
        noOfQueries = sc.nextInt();
        for(int i = 1; i <= noOfQueries; i++){
            String signupDate = sc.next();
            String currDate = sc.next();
            gruber.getTimeRange(signupDate, currDate);
        }
    }
}

/*
Test Input:
5
16-07-1998 27-06-2017
04-02-2016 04-04-2017
04-05-2017 04-04-2017
04-04-2015 04-04-2016
04-04-2015 15-03-2016

 */