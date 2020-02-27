package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]=new int[10];

        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Values in array");
        displayValues(arr);

        System.out.println("Square values are");
        findSquare(arr);
        displayValues(arr);

    }

    public static void displayValues(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] findSquare(int arr[]){
        for (int i=0;i<arr.length;i++){
            arr[i]= (int) Math.pow(arr[i],2);
        }
        return arr;
    }

}
