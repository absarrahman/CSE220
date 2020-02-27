package com.reaperhouse.absar.lab4;

public class LinkedList{
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public LinkedList(Object [] a){
        // TO DO
        head = new Node(a[0],null);
        Node tail = head;
        for (int i=1;i<a.length;i++){
            Node n = new Node(a[i],null);
            tail.next=n;
            tail=n;
        }
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h){
        // TO DO
        head=h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
        int c=0;
        for (Node i=head;i!=null;i=i.next){
            c++;
        }
        return c; // please remove this line!
    }

    /* prints the elements in the list */
    public void printList(){
        // TO DO
        for (Node i=head;i!=null;i=i.next){
            System.out.print(i.element+" ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
        int c=0;
        for (Node i=head;i!=null;i=i.next){
            if(c==idx){
                return i;
            } else {
                c++;
            }
        }
        return null; // please remove this line!
    }


    // returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx){
        // TO DO
        int c=0;
        for (Node i=head;i!=null;i=i.next){
            if(c==idx){
                return i.element;
            } else {
                c++;
            }
        }
        return null;// please remove this line!
    }



    /* updates the element of the Node at the given index.
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem){
        // TO DO
        int c=0;
        for (Node i=head;i!=null;i=i.next){
            if(c==idx){
                i.element=elem;
                return i.element;
            } else {
                c++;
            }
        }
        return null; // please remove this line!
    }


    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
        int c = 0;
        for (Node n=head;n!=null;n=n.next){
            if(n.element==elem){
                return c;
            }
            c++;
        }
        return -1; // please remove this line!
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem){
        // TO DO

        for (Node n=head;n!=null;n=n.next){
            if(n.element==elem){
                return true;
            }
        }
        return false; // please remove this line!
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList(){
        // TO DO
        Node n = head;
        if(head==null){
            return null;
        }

        Node newHead= new Node(n.element,null);
        Node newTail=newHead;

        while (n!=null){
            Node nNode = new Node(n.element,null);
            newTail.next=nNode;
            newTail = newTail.next;
            n = n.next;
        }
        return newHead; // please remove this line!
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList(){
        // TO DO
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        Node nHead = prev;
        return nHead; // please remove this line!
    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        int c=0;
        Node indexNode = nodeAt(idx);
        Node n = new Node(elem,indexNode);
        if(idx==0){
            n.next=head;
            head=n;
        }
        for (Node i=head;i!=null;i=i.next){
            if (c==idx-1){
                i.next=n;
            }
            c++;
        }
    }


    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
        Object removed=nodeAt(index).element;
        int c = 0;
        if(index==0){
            head=head.next;
        }
        for (Node i=head;i!=null;i=i.next){
            if (c==index-1){
                i.next=i.next.next;
                break;
            }
            c++;
        }
        return removed; // please remove this line!
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft(){
        // TO DO
       Node store = head;
       head=head.next;
       Node n = head;
       while (n.next!=null){
           n=n.next;
       }
       n.next=store;
       store.next=null;
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight(){
        // TO DO
        Node n = head;
        Node prev=null;
        while (n.next!=null){
            prev=n;
            n=n.next;
        }
        n.next=head;
        prev.next=null;
        head=n;
    }

    public int sumOfLastNNodes(int num){
        int c=0;
        int size=this.countNode();
        int sum=0;
        for (Node n = head;n!=null;n=n.next){
            if(c+1>size-num){
                sum+=(int)n.element;
            }
            c++;
        }
        return sum;
    }

}