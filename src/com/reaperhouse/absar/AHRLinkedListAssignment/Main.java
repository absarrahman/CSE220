package com.reaperhouse.absar.AHRLinkedListAssignment;

public class Main {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,4,8,9};
        VeryEasy v=new VeryEasy();
        for(int i=0;i<arr.length;i++){
            v.add(arr[i]);
        }
        v.printEven();
        Object t[]=v.toArray();
        for(Object i:t){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        VeryEasy nV= new VeryEasy(v.head);
        nV.removeAnEven();
        nV.printNode();
        VeryEasy n2V= new VeryEasy(v.head);
        n2V.removeAllEven();
        n2V.printNode();
        VeryEasy n3V= new VeryEasy(v.head);
        n3V.firstEvenThenOdd();
    //    n3V.printNode();
    }
}
