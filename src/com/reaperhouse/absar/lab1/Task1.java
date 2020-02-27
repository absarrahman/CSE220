package com.reaperhouse.absar.lab1;

public class Task1 {
    public static void main(String[] args) {
        int arr[]={1,2,6};
        int arr1[]={6,1,2,3};
        int arr2[]={13,6,1,2,3};

        System.out.println(firstLast6(arr));
        System.out.println(firstLast6(arr1));
        System.out.println(firstLast6(arr2));
    }

    //firstLast6

    public static boolean firstLast6(int[] arr){
        int x= arr.length-1;
        if((arr[0])==6||arr[x]==6){
            return true;
        }
        return false;
    }
}
