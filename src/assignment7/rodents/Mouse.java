package assignment7.rodents;

public class Mouse extends Rodent{

    public Mouse(){
        System.out.println("A Mouse has been initialized");
    }

    @Override
    public void gnaw() {
        System.out.println("Mouse is gnawing");
    }
}
