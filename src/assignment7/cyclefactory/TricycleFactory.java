package assignment7.cyclefactory;

public class TricycleFactory extends CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}
