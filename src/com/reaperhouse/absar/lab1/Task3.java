package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        sortArrayDescending(arr);

        int numberOfEven = findNumberOfEven(arr);

        //all even array method er moddhe normal and size jabe

        int sortEvenArr[]=allEvenArray(arr,numberOfEven);

        sortArrayDescending(sortEvenArr);

        int newSize = arr.length+numberOfEven;

        int newArr[] = new int[newSize];

        for (int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }

        for (int i=0;i<sortEvenArr.length;i++){
            newArr[i+5]=sortEvenArr[i];
        }

        for (int i=0;i<newArr.length;i++){
            if (i==newArr.length-1){
                System.out.println(newArr[i]);
            } else {
                System.out.print(newArr[i]+",");
            }
        }
    }

    // sort

    public static int[] sortArrayDescending(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<(arr.length-1-i);j++){
                if(arr[j+1]>arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    //find number of even numbers

    public static int findNumberOfEven(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    // all even number

    public static int[] allEvenArray(int []arr,int size){
        int newArr[] = new int[arr.length];
        int newEvenArr[] = new int[size];
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                newArr[i]=arr[i];
            }
        }

        sortArrayDescending(newArr);

        for (int i=0;i<newEvenArr.length;i++){
            newEvenArr[i]=newArr[i];
        }
        return newEvenArr;
    }

}
