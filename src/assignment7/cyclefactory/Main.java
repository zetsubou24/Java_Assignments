package assignment7.cyclefactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create instances of all factories
        UnicycleFactory unicycleFactory = new UnicycleFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();
        TricycleFactory tricycleFactory = new TricycleFactory();

        //Create ArrayList of Cycle objects
        ArrayList<Cycle> cycles = new ArrayList<>();
        //Call respective factory's createCycle method to create Cycle Object
        cycles.add(unicycleFactory.createCycle());
        cycles.add(bicycleFactory.createCycle());
        cycles.add(tricycleFactory.createCycle());

        //Call ride method of all Cycle objects
        for(Cycle cycle: cycles){
            cycle.ride();
        }
    }
}
