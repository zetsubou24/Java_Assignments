package assignment7.innerclass;

public class Main {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        //Creating a new InnerClass2 instance using OuterClass2 object
        OuterClass2.InnerClass2 innerClass2 = outerClass2.new InnerClass2("Hello");
    }
}
