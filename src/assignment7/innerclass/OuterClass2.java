package assignment7.innerclass;

//Outer Class 2 extending Outer Class 1
public class OuterClass2 extends OuterClass1 {
    //Inner Class 2 extending Innner Class 1
    class InnerClass2 extends InnerClass1 {
        InnerClass2(String input){
            super(input);
            System.out.println("Inner Class 2 " + input);
        }
    }
}
