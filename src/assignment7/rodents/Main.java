package assignment7.rodents;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create ArrayList of Rodent objects
        ArrayList<Rodent> rodents = new ArrayList<>();
        rodents.add(new Mouse());
        rodents.add(new Hamster());
        rodents.add(new Gerbil());

        //Call gnaw method of all Rodent objects
        for(Rodent rodent: rodents){
            rodent.gnaw();
        }
    }
}
