package assignment10;

public class SListIterator<T> {
    private SList sList;
    private Link head;
    private Link tail;

    //Parameterized constructor, Initializing head and tail pointers
    SListIterator(SList sList){
        this.sList = sList;
        head = sList.getHead();
        tail = sList.getTail();
    }

    //Function to insert a value at the end of the linked list
    public void insert(T val){
        //If list is empty
        if(head == null){
            head = new Link(val);
            tail = head;
        }
        //If list is not empty
        else{
            Link<T> temp = new Link(val);
            tail.setNextLink(temp);
            tail = temp;
        }
        sList.setHead(head);
        sList.setTail(tail);
    }

    //Function to remove specific element from linked list
    public void remove(T val){
        //If list is empty
        if(head == null){
            return;
        }
        else{
            Link<T> temp = head;
            Link<T> prev = null;
            //Loop to find value
            while(temp != null){
                //If value is found
                if(temp.getVal().equals(val)){
                    //If element to be removed is head
                    if(temp == head){
                        if(head == tail){
                            tail = null;
                        }
                        head = head.getNextLink();
                    }
                    //If element to be removed is tail
                    else if(temp == tail){
                        tail = prev;
                        tail.setNextLink(null);
                    }
                    //If element is neither head nor tail
                    else{
                        prev.setNextLink(temp.getNextLink());
                    }
                }
                prev = temp;
                temp = temp.getNextLink();
            }
        }
        sList.setHead(head);
        sList.setTail(tail);
    }

}
