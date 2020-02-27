package com.reaperhouse.absar.FINAL;

import com.reaperhouse.absar.lab8.Queue;
import com.reaperhouse.absar.lab8.QueueOverflowException;
import com.reaperhouse.absar.lab8.QueueUnderflowException;

public class CirclularArray implements Queue {
    private Object[] data;
    private int front;
    private int size;
    private static final int DEF_INIT_CAPACITY=10;

    public CirclularArray(){
        data=new Object[DEF_INIT_CAPACITY];
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

    @Override
    public void enqueue(Object e) throws QueueOverflowException {
        if(size==data.length){
            throw new QueueOverflowException();
        }
        int k=(size+front)%data.length;
        data[k]=e;
        size++;
    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        return null;
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public int search(Object e) {
        int counter=0;
        int s=front;
        for(int i=0;i<size;i++){
            if(data[s]==e){
                return counter;
            }
            s=(s+1)%data.length;
            counter++;
        }
        return -1;
    }
}
