package assignment9;

import java.util.regex.Pattern;

public class RegexSentence {

    public static boolean checkIfSentence(String sentence){
        if(Pattern.matches("^[A-Z]+.*\\.$", sentence))
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(RegexSentence.checkIfSentence("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
    }
}
