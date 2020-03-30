package assignment7.cycles;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cycle> cycles = new ArrayList<>();
        cycles.add(new Unicycle());
        cycles.add(new Bicycle());
        cycles.add(new Tricycle());

        for(Cycle cycle: cycles){
            if(cycle.getName().equals("unicycle")) ((Unicycle) cycle).balance();
            else if(cycle.getName().equals("bicycle")) ((Bicycle) cycle).balance();
            else continue; // Since tricycle doesn't have balance method
        }
    }
}
