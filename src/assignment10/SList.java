package assignment10;

class Link<T>{
    private Link<T> nextLink = null;
    private T val;
    Link(T val){
        this.val = val;
    }
    public void setNextLink(Link nextLink){
        this.nextLink = nextLink;
    }

    public Link<T> getNextLink(){
        return nextLink;
    }

    public T getVal(){
        return val;
    }

    public void setVal(T val){
        this.val = val;
    }
}

public class SList<T> {
    private Link<T> head = null;
    private Link<T> tail = null;
    public void iterator(){
        Link<T> temp = head;
        while(temp != null){
            System.out.println(temp.getVal());
            temp = temp.getNextLink();
        }
    }
    public void insert(T val){
        if(head == null){
            head = new Link(val);
            tail = head;
        }
        else{
            Link<T> temp = new Link(val);
            tail.setNextLink(temp);
            tail = temp;
        }
    }

    public void remove(T val){
        if(head == null){
            return;
        }
        else{
            Link<T> temp = head;
            Link<T> prev = null;
            while(temp != null){
                if(temp.getVal().equals(val)){
                    if(temp == head){
                        if(head == tail){
                            tail = null;
                        }
                        head = head.getNextLink();
                    }
                    else if(temp == tail){
                        tail = prev;
                        tail.setNextLink(null);
                    }
                    else{
                        prev.setNextLink(temp.getNextLink());
                    }
                }
                prev = temp;
                temp = temp.getNextLink();
            }
        }
    }
    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        sList.insert("1");
        sList.insert("2");
        sList.insert("3");
        sList.remove("2");
        sList.iterator();
    }
}
