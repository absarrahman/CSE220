package com.reaperhouse.absar.basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8};
        int x = binarySearchL(a,6);
        System.out.println(x);
    }

    public static int binarySearchL(int[] arr,int searchVal){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==searchVal){
                return mid;
            } else if(arr[mid]<searchVal){
                start=mid+1;
            } else {
                end=mid;
            }
        }
        return -1;
    }
}
