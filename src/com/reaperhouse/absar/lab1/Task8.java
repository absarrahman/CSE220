package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter dimension for two row matrices");
        int x = sc.nextInt();
        int []a = new int[x];
        int []b = new int[x];


        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            a[i]=5*a[i];
        }

        for(int i=0;i<b.length;i++){
            b[i]=a[i]-b[i];
        }

        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }
}
