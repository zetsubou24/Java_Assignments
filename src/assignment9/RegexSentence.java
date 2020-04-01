package assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexSentence {

    public static boolean checkIfSentence(String sentence){
        //Checks is sentence starts with Capital letter and ends with period
        if(Pattern.matches("^[A-Z]+.*\\.$", sentence))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for(int t = 0; t < test; t++){
            String input = sc.nextLine();
            if(RegexSentence.checkIfSentence(input)){
                System.out.println("Valid sentence");
            }
            else{
                System.out.println("Not a valid sentence");
            }
        }
    }
}

/**
 * Input:
 * 2
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
 * question?
 *
 * Output:
 * Valid sentence
 * Not a valid sentence
 */
