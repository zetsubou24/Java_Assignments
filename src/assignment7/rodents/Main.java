package assignment7.rodents;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<>();
        rodents.add(new Mouse());
        rodents.add(new Hamster());
        rodents.add(new Gerbil());

        for(Rodent rodent: rodents){
            rodent.gnaw();
        }
    }
}
