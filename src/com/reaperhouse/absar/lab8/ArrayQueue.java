package com.reaperhouse.absar.lab8;

public class ArrayQueue implements Queue {
    public Object arr[];
    int capacity,frontTrack,size,rearTrack; //capacity->ArraySize,size->number of elem,frontTrack tracks front and rearTrack tracks rear

    public ArrayQueue(int capacity){
        this.capacity=capacity;
        arr=new Object[capacity];
        this.size=0;
        frontTrack=0;
        rearTrack=capacity-1;
    }

    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(Object e) throws QueueOverflowException {
        if(size==arr.length){
            throw new QueueOverflowException();
        } else {
            rearTrack=(rearTrack+1)%capacity;
            arr[rearTrack]=e;
            size++;
        }

    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        } else {
            Object temp = arr[frontTrack];
            frontTrack = (frontTrack + 1) % capacity;
            size--;
            return temp;
        }
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        if(size==0){
            throw new QueueUnderflowException();
        }
        return arr[frontTrack];
    }

    @Override
    public Object[] toArray() {
        Object temp[]=new Object[size];
        for (int i=frontTrack,j=0;j<size;j++,i=(i+1)%arr.length){
            temp[j]=arr[i];
        }
        return temp;
    }

    @Override
    public int search(Object e) {
        return 0;
    }

}