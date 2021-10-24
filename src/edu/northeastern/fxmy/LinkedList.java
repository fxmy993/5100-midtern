package edu.northeastern.fxmy;

public class LinkedList <T> {

    public Node<T> head;
    public int count = 0;

    public LinkedList(){
        head = null;
        count = 0;
    }
    public void addHead( T data ){
        Node<T> add = new Node<>(data);
        if(head == null){
            head = add;
            return;
        }
        add.next = head;
        head = add;
    }
}

