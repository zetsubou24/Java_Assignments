package assignment5.singleton;

//Singleton Design Pattern
public class Singleton {
    private static Singleton instance = null;
    private String field = "Default";

    //Static method to create/get Singleton instance
    public static Singleton getInstance(String input){
//        this.field = input;   Cannot access non-static member in static method
        //If instance doesn't exist, create a new instance
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //Printing non-static member variable field
    public void printField(){
        System.out.println(field);
    }
}
