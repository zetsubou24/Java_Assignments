package assignment11;

import java.io.*;
import java.util.HashMap;

public class TextMap {
    private HashMap<Character, Integer> characterMap;

    TextMap(){
        characterMap = new HashMap<>();
    }

    //Uses HashMap to count occurrences of characters in file
    public void countCharacters(String input){
        for(Character ch: input.toLowerCase().toCharArray()){
            if(characterMap.containsKey(ch)){
                characterMap.put(ch, characterMap.get(ch) + 1);
            }
            else{
                characterMap.put(ch, 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //Input file name is provided as command line argument
        File infile = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(infile));
        TextMap textMap = new TextMap();

        File outfile = new File("textmap-results.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outfile));
        String s;

        //Reading from input file
        while ((s = br.readLine()) != null) {
            //Counting characters in input file
            textMap.countCharacters(s);
            System.out.println(s);
        }

        //Iterating through character map
        for(Character ch: textMap.characterMap.keySet()){
            //Writing to output file
            bw.write(ch + " " + textMap.characterMap.get(ch));
            bw.newLine();
            System.out.println(ch + " " + textMap.characterMap.get(ch));
        }

        bw.close();
    }
}
