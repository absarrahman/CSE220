package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = new  int[5];
        int i,j;

        for(i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(i=0,j=arr.length-1;i<arr.length&&j>=0;i++,j--){
            if(arr[i]!=arr[j]){
                break;
            }
        }

        if(i>j){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
