package assignment7.cyclefactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();

        ArrayList<Cycle> cycles = new ArrayList<>();
        cycles.add(unicycleFactory.createCycle());
        cycles.add(bicycleFactory.createCycle());
        cycles.add(tricycleFactory.createCycle());

        for(Cycle cycle: cycles){
            cycle.ride();
        }
    }
}
