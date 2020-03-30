package assignment7.rodents;

public class Gerbil extends Rodent {

    public Gerbil(){
        System.out.println("A Gerbil has been initialized");
    }

    @Override
    public void gnaw() {
        System.out.println("Gerbil is gnawing");
    }
}
