package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter input"); //index
        int n = sc.nextInt();

        for (int i=1;i<=arr[n];i++){
            System.out.print("*");
        }

    }

}
