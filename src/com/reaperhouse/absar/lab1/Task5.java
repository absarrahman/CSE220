package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = new int[15];
        int nArr[] = new int[10];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<nArr.length;j++){
                if(j==arr[i]){
                    nArr[j]++;
                }
            }
        }

        for (int i=0;i<nArr.length;i++){
            System.out.println(i+" was found "+nArr[i]+" times");
        }

    }

}
