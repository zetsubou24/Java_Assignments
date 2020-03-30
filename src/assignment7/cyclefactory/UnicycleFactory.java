package assignment7.cyclefactory;

public class UnicycleFactory extends CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Unicycle();
    }
}
