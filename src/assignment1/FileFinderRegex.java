package assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class FileFinderRegex {
    private LinkedList<String> queue;
    private ArrayList<String> matches;
    private String regex;

    public void find(String regex){
        queue = new LinkedList();
        matches = new ArrayList<>();
        this.regex = regex;
        queue.push("/home/akhil/Desktop");

        while(!queue.isEmpty()) {
            String path = queue.pop();
            File file = new File(path);
            if (Pattern.matches(regex,file.getName())) {
                matches.add(path);
            }
            if (file.isDirectory()) {
                for (File currFile : file.listFiles()) {
                    queue.add(path + "/" + currFile.getName());
                }
            }
        }

        for(String match: matches){
            System.out.println(match);
        }
    }

    public static void main(String[] args) {
        FileFinderRegex fileFinderRegex = new FileFinderRegex();
        fileFinderRegex.find(".*\\.txt");
    }
}
