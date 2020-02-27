package com.reaperhouse.absar.FINAL;
import com.reaperhouse.absar.lab4.Node;

public class LinkedList {
    Node head;
    Node tail;

    /**
     *  It will create a new Node
     *  if head is null then that node will be head and tail
     *  else
     *    tail next-> node
     *    tail-> node
     *
     *
     * @param e
     */

    public void add(Object e){
        Node n = new Node(e,null); // new Node created
        if(head==null){
            head=n;
            tail=n;
        } else {
            tail.next=n;
            tail=n;
        }
    }

    public void printList(){
        for(Node n=head;n!=null;n=n.next){
            System.out.println(n.element);
        }
    }

}
