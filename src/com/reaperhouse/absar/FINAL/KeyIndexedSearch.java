package com.reaperhouse.absar.FINAL;

public class KeyIndexedSearch {
    public static void main(String[] args) {
        int arr[]={6,7,8,9,1,2,3,4}; //max value is 9
        int nArr[]=keyIndexArray(arr);
        System.out.println(keyIndexSearch(100,nArr));

    }
    public static int[] keyIndexArray(int arr[]){
        int nArr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                nArr[arr[i]]=1;
            }
        }
        return nArr;
    }

    public static boolean keyIndexSearch(int x,int arr[]){
        if(x<0||x>arr.length){
            return false;
        } else if(arr[x]==1) {
            return true;
        }
        return false;
    }
}
