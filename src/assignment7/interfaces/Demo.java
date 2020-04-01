package assignment7.interfaces;

//Class Demo that implements the combined interface and extending the Concrete Class
public class Demo extends ConcreteClass implements IFourth {

    @Override
    public void print() {
        System.out.println("This is Child class");
    }

    @Override
    public void fourth() {
        System.out.println("Fourth");
    }

    @Override
    public void first1() {
        System.out.println("First 1");
    }

    @Override
    public void first2() {
        System.out.println("First 2");
    }

    @Override
    public void second1() {
        System.out.println("Second 1");
    }

    @Override
    public void second2() {
        System.out.println("Second 2");
    }

    @Override
    public void third1() {
        System.out.println("Third 1");
    }

    @Override
    public void third2() {
        System.out.println("Third 2");
    }

    public void implementFirst(IFirst first){
        first.first1();
        first.first2();
    }

    public void implementSecond(ISecond second){
        second.second1();
        second.second2();
    }

    public void implementThird(IThird third){
        third.third1();
        third.third2();
    }

    public void implementFourth(IFourth fourth){
        fourth.fourth();
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.implementFirst(demo);
        demo.implementSecond(demo);
        demo.implementThird(demo);
        demo.implementFourth(demo);
    }
}
