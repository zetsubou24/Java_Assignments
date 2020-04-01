package assignment10;

//SList class that works similar to a singly linked list
public class SList<T> {
    private Link<T> head = null;
    private Link<T> tail = null;

    //Instantiates SListIterator
    public SListIterator<T> iterator(){
        return new SListIterator<>(this);
    }

    public String toString(){
        Link<T> temp = head;
        StringBuilder sb = new StringBuilder("");
        while(temp != null){
            sb.append(temp.getVal());
            sb.append("->");
            temp = temp.getNextLink();
        }
        return sb.toString();
    }

    public Link<T> getHead() {
        return head;
    }

    public void setHead(Link<T> head) {
        this.head = head;
    }

    public Link<T> getTail() {
        return tail;
    }

    public void setTail(Link<T> tail) {
        this.tail = tail;
    }
}
