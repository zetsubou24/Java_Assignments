package assignment5.data;

public class Data {
    private int num;
    private char ch;

    //Printing member variables that will be initialized to default values upon declaration
    public void printVars(){
        System.out.println("num = " + num);
        System.out.println("ch = " + ch);
    }

//Local variables are not initialized to default values upon declaration

/*    public void printLocalVars(){
        int num;
        char ch;
        System.out.println("local num = " + num);
        System.out.println("local chh = " + ch);
    }
*/

    public static void main(String[] args) {
        Data data = new Data();
        data.printVars();
//        data.printLocalVars();
    }
}
