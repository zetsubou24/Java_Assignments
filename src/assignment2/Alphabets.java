/*Time-Complexity:
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

public class Alphabets {
    private static String alphabets = "abcdefghijklmnopqrstuvwxyz";
    private static HashSet trackAlphabets;

    public static boolean checkAlphabets(String text){
        trackAlphabets = new HashSet();
        for(char ch: text.toLowerCase().toCharArray()){
            if(alphabets.indexOf(ch) != -1){
                trackAlphabets.add(ch);
                if(trackAlphabets.size() == 26){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkAlphabets("hello"));
        System.out.println(checkAlphabets("The quick brown fox jumps over the lazy dog"));
    }
}
