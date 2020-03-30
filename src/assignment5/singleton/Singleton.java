package assignment5.singleton;

public class Singleton {
    private static Singleton instance = null;
    private String field = "Default";

    public static Singleton getInstance(String input){
//        this.field = input;   Cannot access non-static member in static method
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printField(){
        System.out.println(field);
    }
}
