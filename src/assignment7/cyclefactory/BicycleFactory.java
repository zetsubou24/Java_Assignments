package assignment7.cyclefactory;

public class BicycleFactory extends CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Bicycle();
    }
}
