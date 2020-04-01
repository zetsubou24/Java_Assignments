package assignment10;

public class Link<T>{
    private Link<T> nextLink = null;
    private T val;

    //Constructor initializing new node with input value
    Link(T val){
        this.val = val;
    }

    public Link<T> getNextLink(){
        return nextLink;
    }

    public void setNextLink(Link nextLink){
        this.nextLink = nextLink;
    }

    public T getVal(){
        return val;
    }

    public void setVal(T val){
        this.val = val;
    }
}

