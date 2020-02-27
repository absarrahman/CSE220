package com.reaperhouse.absar.lab5;

public class DoublyList{
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;

        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
        int c= 0;
        for(Node n=head.next;n!=head;n=n.next){
            c++;
        }
        return c;

    }

    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO
        for(Node n=head.next;n!=head;n=n.next){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }

    public void backwardprint(){
        // TO DO
        for (Node n=head.prev;n!=head;n=n.prev){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }


    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
        int c=0;
        for (Node n = head.next;n!=head;n=n.next){
            if(c==idx){
                return n;
            }
            c++;
        }

        return null; // please remove this line!
    }



    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
        int c=0;
        for (Node n = head.next;n!=head;n=n.next){
            if(elem==n.element){
                return c;
            }
            c++;
        }

        return -1; // please remove this line!
    }



    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        if(idx==0){
            Node n = new Node(elem,head.next,head);
            head.next.prev=n;
            head.next=n;
        } else {
            Node previous=nodeAt(idx-1);
            Node current=previous.next;
            Node n = new Node(elem,current,previous);
            previous.next=n;
            current.prev=n;
        }

    }




    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
        Node removed=nodeAt(index);
        Node ind_prev = removed.prev;
        removed.prev.next=removed.next;
        removed.next.prev=ind_prev;

        return removed.element; // please remove this line!
    }



}