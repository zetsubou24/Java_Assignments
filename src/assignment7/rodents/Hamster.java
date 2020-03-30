package assignment7.rodents;

public class Hamster extends Rodent {

    public Hamster(){
        System.out.println("A Hamster has been initalized");
    }

    @Override
    public void gnaw() {
        System.out.println("Hamster is gnawing");
    }
}
