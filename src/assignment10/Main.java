package assignment10;

public class Main {
    public static void main(String[] args) {
        //Creating new SList
        SList<String> sList = new SList<>();

        //Get SListIterator of the SListObject
        SListIterator sListIterator = sList.iterator();

        //Insert 3 values
        sListIterator.insert("1");
        sListIterator.insert("2");
        sListIterator.insert("3");

        //Remove a value
        sListIterator.remove("2");

        //Printing all values
        System.out.println(sList.toString());
    }
}

/**
 * Output:
 * 1->3->
 */
