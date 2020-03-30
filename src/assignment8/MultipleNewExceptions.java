package assignment8;

class Exception1 extends Exception{
    public Exception1(String message) {
        super(message);
    }
}

class Exception2 extends Exception{
    public Exception2(String message) {
        super(message);
    }
}

class Exception3 extends Exception{
    public Exception3(String message) {
        super(message);
    }
}

public class MultipleNewExceptions {
    public static void printMessage(int input){
        try {
            if (input == 1) throw new Exception1("Exception1");
            else if (input == 2) throw new Exception2("Exception2");
            else if (input == 3) throw new Exception3("Exception3");
            else throw new NullPointerException();
        }
        catch(Exception1 | Exception2 | Exception3 e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Reached finally block");
        }
    }

    public static void main(String[] args) {
        MultipleNewExceptions.printMessage(2);
    }
}

