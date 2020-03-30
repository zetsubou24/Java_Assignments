package assignment11;

import java.io.*;
import java.util.HashMap;

public class TextMap {
    private HashMap<Character, Integer> characterMap;

    TextMap(){
        characterMap = new HashMap<>();
    }

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
        File infile = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(infile));
        TextMap textMap = new TextMap();

        File outfile = new File("textmap-results.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(outfile));
        String s;

        while ((s = br.readLine()) != null) {
            textMap.countCharacters(s);
            System.out.println(s);
        }

        for(Character ch: textMap.characterMap.keySet()){
            bw.write(ch + " " + textMap.characterMap.get(ch));
            bw.newLine();
            System.out.println(ch + " " + textMap.characterMap.get(ch));
        }

        bw.close();
    }
}
