package com.reaperhouse.absar.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[10];
        int cArr[]= new int[10];
        int maxIndex = 0,minIndex = 0;

        // takes number

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        // copy array for sort

        for (int i=0;i<cArr.length;i++){
            cArr[i]=arr[i];
        }

        // Sort arrays and find min and max

        Arrays.sort(cArr);
        int max = cArr[cArr.length-1];
        int min = cArr[0];

        //find maxIndex

        for (int i=0;i<arr.length;i++){
            if(arr[i]==max){
                maxIndex=i;
                break;
            }
        }

        //find minIndex

        for (int i=0;i<arr.length;i++){
            if(arr[i]==min){
                minIndex=i;
                break;
            }
        }

        //swap position

        //arr[minIndex]^=arr[maxIndex]^=arr[minIndex]^=arr[maxIndex];

        int temp=arr[minIndex];
        arr[minIndex]=arr[maxIndex];
        arr[maxIndex]=temp;

        for (int i=0;i<arr.length;i++){
            if (i==arr.length-1){
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i]+",");
            }
        }

    }
}
