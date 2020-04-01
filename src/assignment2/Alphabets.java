/**Time-Complexity:
    Worst case = O(n)
    Average case = O(n)
    Best case = O(1)

Space-Complexity:
    Worst case = O(1)
    Average case = O(1)
    Best case = O(1)
 */

package assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class Alphabets {
    //Alphabet set
    private static String alphabets = "abcdefghijklmnopqrstuvwxyz";
    private static HashSet trackAlphabets;

    //Checking if all alphabets are present in given text
    public static boolean checkAlphabets(String text){
        //Using a HashSet to keep track of alphabets
        trackAlphabets = new HashSet();
        for(char ch: text.toLowerCase().toCharArray()){
            //Check if character is present in alphabet set
            if(alphabets.indexOf(ch) != -1){
                trackAlphabets.add(ch);
                //Early breaking of loop if all alphabets have been found
                if(trackAlphabets.size() == alphabets.length()){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test;
        test = sc.nextInt();
        sc.nextLine();
        for(int t = 0; t < test; t++){
            String input = sc.nextLine().strip();
            if(checkAlphabets(input)){
                System.out.println(input + " : contains all alphabets" );
            }
            else{
                System.out.println(input + " : does not contain all alphabets");
            }
        }
    }
}

/**
 * Input
 * 2
 * Hello World
 * The quick brown fox jumps over the lazy dog
 *
 * Output:
 * Hello World : does not contain all alphabets
 * The quick brown fox jumps over the lazy dog : contains all alphabets
 *
 */
