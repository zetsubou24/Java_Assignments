package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Gruber {

    public void getTimeRange(String signup, String curr){
        //Creating DateTimeFormatter object with required format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        //Creating LocalDate objects for signup and curr
        LocalDate signupDate = LocalDate.parse(signup, formatter);
        LocalDate currDate = LocalDate.parse(curr, formatter);

        //No Range id signupDate is greater than currDate
        if(currDate.getYear() <= signupDate.getYear()) {
            System.out.println("No Range");
        }
        else{
            //Calculate year difference to both dates
            int yearDiff = signupDate.getYear() - currDate.getYear();
            //Add year difference to signupDate
            signupDate = signupDate.minusYears(yearDiff);
            //Find startWindow and stopWindow by adding/subtracting 30 days
            LocalDate startWindow = signupDate.minusDays(30);
            LocalDate stopWindow = signupDate.minusDays(-30);
            //stopWindow cannot exceed currDate
            if(currDate.compareTo(stopWindow) < 0){
                stopWindow = currDate;
            }
            //Printing startWindow and stopWindow
            System.out.println(startWindow.format(formatter) + " " + stopWindow.format(formatter));
        }
    }

    public static void main(String[] args) {
        Gruber gruber = new Gruber();
        int noOfQueries;
        Scanner sc = new Scanner(System.in);
        //Scanning no. of queries
        noOfQueries = sc.nextInt();
        //Scanning user input in the format of "signupDate currDate"
        for(int i = 1; i <= noOfQueries; i++){
            String signupDate = sc.next();
            String currDate = sc.next();
            gruber.getTimeRange(signupDate, currDate);
        }
    }
}

/**
 * Test Input:
 * 5
 * 16-07-1998 27-06-2017
 * 04-02-2016 04-04-2017
 * 04-05-2017 04-04-2017
 * 04-04-2015 04-04-2016
 * 04-04-2015 15-03-2016
 *
 * Output:
 * 16-06-2017 27-06-2017
 * 05-01-2017 06-03-2017
 * No Range
 * 05-03-2016 04-04-2016
 * 05-03-2016 15-03-2016
 *
 */
