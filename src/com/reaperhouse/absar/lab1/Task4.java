package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = sc.nextInt();

        for (int i = 1;i< arr.length;i++) {
            int n = sc.nextInt();

            for (int j = 0; j<i; j++) {
                while (arr[j] == n) {
                    System.out.println(n+" is already in among the entered numbers. Enter again");
                    n = sc.nextInt();
                    j = 0;
                }

            }
            arr[i] = n;
        }
    }

}
