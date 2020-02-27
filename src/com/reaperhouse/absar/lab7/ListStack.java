package com.reaperhouse.absar.lab7;

public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (top==null){
            return true;
        }
        return false;
    }

    @Override
    public void push(Object e) throws StackOverflowException {
        Node n = new Node(e,null);
        if(top==null){
            top=n;
        } else {
            Node temp = top;
            top=n;
            n.next=temp;
        }
        size++;
    }

    @Override
    public Object pop() throws StackUnderflowException {
        Object returnValue;
        if(top==null){
            throw new StackUnderflowException();
        } else {
            returnValue=top.val;
            top=top.next;
        }
        size--;
        return returnValue;
    }

    @Override
    public Object peek() throws StackUnderflowException {
        if(top==null){
            throw new  StackUnderflowException();
        } else {
            return top.val;
        }
    }

    @Override
    public Object[] toArray() {
        Object arr[]=new Object[size];
        int c=0;
        for (Node n=top;n!=null;n=n.next,c++){
            arr[c]=n.val;
        }
        return arr;
    }

    @Override
    public int search(Object e) {
        int c=0;
        for (Node n=top;n!=null;n=n.next,c++){
            if(n.val==e){
                return c;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        Object arr[]=toArray();
        String s="";
        for (int i=0;i<arr.length;i++){
            s=s+" "+arr[i];
        }
        return s;
    }
}