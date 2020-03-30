package assignment7.innerclass;


public class OuterClass2 extends OuterClass1 {
    class InnerClass2 extends InnerClass1 {
        InnerClass2(String input){
            super(input);
            System.out.println("Inner Class 2 " + input);
        }
    }
}
