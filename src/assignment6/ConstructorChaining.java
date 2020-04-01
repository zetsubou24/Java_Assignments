package assignment6;

public class ConstructorChaining {
    private int key;

    //Default Constructor
    ConstructorChaining(){
        //Calling parameterized constructor
        this(100);
    }

    //Parameterized Constructor
    ConstructorChaining(int key){
        this.key = key;
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining();
        System.out.println(constructorChaining.key);
    }
}
