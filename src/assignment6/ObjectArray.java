package assignment6;

public class ObjectArray {
    public ObjectArray(String input){
        System.out.println(input);
    }

    public static void main(String[] args) {
        ObjectArray[] objectArray = new ObjectArray[3];
        objectArray[0] = new ObjectArray("ONE");
        objectArray[1] = new ObjectArray("TWO");
        objectArray[2] = new ObjectArray("THREE");
    }
}
