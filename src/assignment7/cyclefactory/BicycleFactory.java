package assignment7.cyclefactory;

//Concrete Bicycle Factory extending CycleFactory
public class BicycleFactory extends CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}
