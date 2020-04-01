package assignment7.cyclefactory;

//Concrete Tricycle Factory extending CycleFactory
public class TricycleFactory extends CycleFactory {
    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}
