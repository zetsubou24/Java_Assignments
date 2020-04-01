package assignment1;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileFinderRegex {
    private LinkedList<String> queue;
    private ArrayList<String> matches;
    private String regex;

    //Performing search on the directory structure recursively, i.e. checking in each nested directory for presence of required pattern
    public void find(String regex){
        queue = new LinkedList();
        matches = new ArrayList<>();
        this.regex = regex;
        queue.push("/home");

        //Performing Breadth-First-Search on the home directory
        while(!queue.isEmpty()) {
            String path = queue.pop();
            File file = new File(path);
            //Checking if current file matches given Regex pattern
            if (Pattern.matches(regex,file.getName())) {
                matches.add(path);
            }
            //If current file is a directory, add it to the queue, so that BFS can be peformed recursively
            if (file.isDirectory()) {
                for (File currFile : file.listFiles()) {
                    queue.add(path + "/" + currFile.getName());
                }
            }
        }

        //Printing out all the matches that have been stored in the matches ArrayList
        for(String match: matches){
            System.out.println(match);
        }
    }

    public static void main(String[] args) {
        FileFinderRegex fileFinderRegex = new FileFinderRegex();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        fileFinderRegex.find(input); // For example, input can be a regex like ".*\.txt"
    }
}

/**
 * Input:
 * .*\.txt
 *
 * Output:
 * /home/akhil/Desktop/Github/FuturePredictor/client/node_modules/html-encoding-sniffer/LICENSE.txt
 * /home/akhil/Desktop/Github/FuturePredictor/client/node_modules/css.escape/LICENSE-MIT.txt
 * /home/akhil/Desktop/Github/FuturePredictor/client/node_modules/cssstyle/MIT-LICENSE.txt
 * /home/akhil/Desktop/Github/FuturePredictor/client/node_modules/unicode-match-property-value-ecmascript/LICENSE-MIT.txt
 * /home/akhil/Desktop/Github/FuturePredictor/client/node_modules/html-escaper/LICENSE.txt
 * ....
 */
