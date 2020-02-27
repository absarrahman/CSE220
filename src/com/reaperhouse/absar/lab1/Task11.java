package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(allDigitsOdd(sc.nextInt()));

    }

    public static boolean allDigitsOdd(int number){
        String s = Integer.toString(number);
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)%2==0){
                return false;
            }
        }
        return true;
    }

}
