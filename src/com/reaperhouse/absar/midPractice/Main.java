package com.reaperhouse.absar.midPractice;

public class Main {
    public static void main(String[] args) {
        int array[]=new int[24];
        int x=7;
        for (int i=1; i<= 23; i++){
            array[i]=x;
            x+=5;
        }
        for(int i:array){
            System.out.println(i);
        }
    }
}
