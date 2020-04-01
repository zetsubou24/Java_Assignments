package assignment7.cyclefactory;

//Concrete Unicycle Factory extending CycleFactory
public class UnicycleFactory extends CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}
