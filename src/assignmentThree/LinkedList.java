package assignmentThree;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    /*
    * Basically our approach is first object will set as head.Then for next object tail will become n.next
    *
    * */

    public void add(Object elem){
        if(head==null){
            Node n = new Node(elem); //created first node
            head = n;
            tail=n;
        } else {
            Node n = new Node(elem);
            tail.next=n;
            tail=n;
        }
        size++;
    }

    public void printList(){
        for (Node i=head;i!=null;i=i.next){
            System.out.print(i.element+" ");
        }
        System.out.println();
    }

    public void countNode(){
        System.out.println(size);
    }

    public Object get(int index){
        int count=-1;
        for (Node n = head;n!=null;n=n.next){
            count++;
            if (count==index){
                return n.element;
            }
        }
        return "Error.Index limit is up to "+(size-1)+"\n";
    }

    public Object set(int index,Object elem){
        int count=-1;
        Object oldElem=null;
        if(index>=size){
            return "Error.Index limit is up to "+(size-1)+"\n";
        }
        for (Node n = head;n!=null;n=n.next){
            count++;
            if (count==index){
                oldElem=n.element;
                n.element=elem;
            }
        }
        return oldElem;
    }

    public void insertFirst(Object elem){
        Node n = new Node(elem);
        n.next=head;
        head=n;
        size++;
    }

    public void insertLast(Object elem){
        Node n = new Node(elem);
        n.next=null;
        Node i;
        for (i=head;i.next!=null;i=i.next){}
        i.next=n;
        size++;
    }

    public void insertInAnyIndex(int index,Object elem){
        Node n = new Node(elem);
        if(head==null){
            head=n;
        }

        //If the index is 0 then it inserts the value there

        if (head != null && index == 0) {
            insertFirst(elem);
            return;
        }

        Node currentNode=head; //for tracing current node
        Node previousNode=null;//for tracing previous node
        int c = 0;

        while (c < index) {
            previousNode = currentNode;
            currentNode = currentNode.next;

            if (currentNode == null) {
                break;
            }
            c++;
        }
        n.next = currentNode;
        previousNode.next = n;
        size++;
    }

    public void removeFirst(){
        head=head.next;
        size--;
    }

    public void removeLast(){
        int count = 1;
        for (Node n=head;n!=null;n=n.next){
            if(count==size-1){
                n.next=null;
                break;
            }
            count++;
        }
        size--;
    }

    public void removeElementFromAnyIndex(int index){
        Node otherStart=null;// Next node of index node
        int  count=0;
        if(index==0){
            removeFirst();
            return;
        }
        if(index==size-1){
            removeLast();
            return;
        }
        for (Node n=head;n!=null;n=n.next){
            if(count==index){
                otherStart=n.next;
                break;
            }
            count++;
        }
        int indexC=0;
        for (Node n=head;n!=null;n=n.next){
            if(indexC==index-1){
                n.next=otherStart;
                break;
            }
            indexC++;
        }
        size--;
    }

}
