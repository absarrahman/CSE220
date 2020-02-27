package com.reaperhouse.absar.AHRLinkedListAssignment;

import com.reaperhouse.absar.midPractice.Node;

public class VeryEasy {
    public Node head;
    public Node tail;

    public VeryEasy(){}

    public VeryEasy(Node h){
        head=h;
    }

    public void add(Object e){
        Node n = new Node(e);
        if(head==null){
            head=n;
            tail=n;
        } else {
            tail.next=n;
            tail=n;
        }
    }

    public int countNode(){
        int c=0;
        for(Node n=head;n!=null;n=n.next){
            c++;
        }
        return c;
    }

    public Node copyList() {
        // TO DO
        Node n = head;
        if (head == null) {
            return null;
        }
        return n;
    }

    public void printNode(){
        for (Node n=head;n!=null;n=n.next){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }

    public void removeAnEven(){
        if((int)head.element%2==0){
            head=head.next;
        } else {
            Node prev = head;
            for (Node n = head.next; n != null; n = n.next, prev = prev.next) {
                if ((int) n.element % 2 == 0) {
                    prev.next = n.next;
                    break;
                }
            }
        }
    }

    public void firstEvenThenOdd(){
        Node oddH = null;
        Node evenH = null;
        Node oddT = null;
        Node evenT=null;
        Node n=head;
        while(n!=null){
            if((int)n.element%2==0){
                if(evenH==null){
                    evenH=n;
                    evenT=n;
                } else {
                    evenT.next=n;
                    evenT=n;
                }
            }
            System.out.println(evenT.element);
            n=n.next;
        }

    }

    public void removeAllEven(){
        while((int)head.element%2==0){
            head=head.next;
        }
        Node prev=head;
        for (Node n=head.next;n!=null;n=n.next){
            if((int)n.element%2!=0){
                prev=n;
            } else {
                prev.next=n.next;
            }
        }
    }

    public void printEven(){
        for(Node n=head;n!=null;n=n.next){
            if((int)n.element%2==0){
                System.out.print(n.element+" ");
            }
        }
        System.out.println();
    }

    public Object[] toArray(){
        int c=0;
        for(Node n=head;n!=null;n=n.next){
            if((int)n.element%2==0){
                c++;
            }
        }
        Object temp[]=new Object[c];
        c=0;
        for(Node n=head;n!=null;n=n.next){
            if((int)n.element%2==0){
                temp[c]=n.element;
                c++;
            }
        }
        return temp;
    }

}
