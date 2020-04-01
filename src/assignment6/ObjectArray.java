package assignment6;

public class ObjectArray {
    public ObjectArray(String input){
        //Printing message during construction
        System.out.println(input);
    }

    public static void main(String[] args) {
        //Initializing array of ObjectArray objects
        ObjectArray[] objectArray = new ObjectArray[3];
        //Add new ObjectArray objects to the array
        objectArray[0] = new ObjectArray("ONE");
        objectArray[1] = new ObjectArray("TWO");
        objectArray[2] = new ObjectArray("THREE");
    }
}
