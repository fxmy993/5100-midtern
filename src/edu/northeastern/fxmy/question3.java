package edu.northeastern.fxmy;

import org.w3c.dom.NodeList;

public class question3 {

    public static void main(String[] args) {

        LinkedList a = new LinkedList();
        a = sample1();
        Node res = question3(a);

    }


    //Time: O(n) Space: O(1)
    public static Node question3(LinkedList nums){

        Node front = nums.head;
        Node back = nums.head;
        Node res ;

        if(front == null)
            return null;
        if(front.next == front)
            return front;
        while(true){
            if(front.next!=null){
                front = front.next;
                if(front.next!=null){
                    front = front.next;
                    back = back.next;
                }
            }

            if(front == null)
                return back;

            if(front == back) {
                break;
            }
        }

        Node end = nums.head;

        if(front == nums.head){
            while(front.next!= nums.head){
                front = front.next;
            }
            front.next = null;
        }else{
            front = nums.head;
            while(front.next!=back.next){
                front = front.next;
                back = back.next;
            }
            back.next = null;
        }

        front = nums.head;
        back = nums.head;
        while(front!=null){
            if(front.next!=null) {
                front = front.next;
                if (front.next != null) {
                    front = front.next;
                    back = back.next;
                }
            }else{
                return back;
            }
        }

        return back;

    }

    private static LinkedList sample1(){
        LinkedList a = new LinkedList();
        a.addHead(5);
        Node y = a.head;
        a.addHead(4);
        a.addHead(3);
        Node x = a.head;
        a.addHead(2);
        a.addHead(1);
        y.next = x;
        return a;
    }
}