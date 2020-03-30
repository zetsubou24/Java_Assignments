package assignment6;

public class ConstructorChaining {
    private int key;

    ConstructorChaining(){
        this(100);
    }

    ConstructorChaining(int key){
        this.key = key;
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining();
        System.out.println(constructorChaining.key);
    }
}
