package assignment8;

//Custom Exception 1
class Exception1 extends Exception{
    public Exception1(String message) {
        super(message);
    }
}

//Custom Exception 2
class Exception2 extends Exception{
    public Exception2(String message) {
        super(message);
    }
}

//Custom Exception 3
class Exception3 extends Exception{
    public Exception3(String message) {
        super(message);
    }
}

public class MultipleNewExceptions {
    public static void printMessage(int input){
        //Throw custom exception based on input
        try {
            if (input == 1) throw new Exception1("Exception1");
            else if (input == 2) throw new Exception2("Exception2");
            else if (input == 3) throw new Exception3("Exception3");
            else throw new NullPointerException();
        }
        //Catch custom exceptions
        catch(Exception1 | Exception2 | Exception3 e){
            System.out.println(e.getMessage());
        }
        //Finally block
        finally {
            System.out.println("Reached finally block");
        }
    }

    public static void main(String[] args) {
        MultipleNewExceptions.printMessage(2);
    }
}

