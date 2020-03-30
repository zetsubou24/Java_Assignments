package assignment5.main;

import assignment5.data.Data;
import assignment5.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printVars();
//        data.printLocalVars();

        Singleton instance = Singleton.getInstance("Hello");
        instance.printField();
    }
}
