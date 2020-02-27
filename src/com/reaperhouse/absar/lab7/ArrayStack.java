package com.reaperhouse.absar.lab7;

public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }

    public Object top(){
        return data[size-1];
    }

    @Override
    public void push(Object e) throws StackOverflowException {
        if(size>=data.length){
            throw new StackOverflowException();
        } else {
            data[size]=e;
        }
        size++;
    }

    @Override
    public Object pop() throws StackUnderflowException {
        Object returnVal;

        if(size==0){
            throw new StackUnderflowException();
        } else {
            returnVal=data[size-1];
        }
        size--;
        return returnVal;
    }

    @Override
    public Object peek() throws StackUnderflowException {
        if (size==0){
            throw new StackUnderflowException();
        } else {
            return data[size-1];
        }
    }

    @Override
    public Object[] toArray() {
        Object arr[]=new Object[size];
        int c=0;
        for (int i=size-1;i>=0;i--,c++){
            arr[c]=data[i];
        }
        return arr;
    }

    @Override
    public int search(Object e) {
        Object arr[]=this.toArray();
        int c=0;
        for (int i=0;i<arr.length;i++,c++){
            if(arr[i]==e){
                return c;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        Object halua[]=this.toArray();
        if(halua.length==0){
            return "Empty Stack";
        }
        String s="";
        for (int i=0;i<halua.length;i++){
            s=s+" "+halua[i];
        }
        return s;
    }
}