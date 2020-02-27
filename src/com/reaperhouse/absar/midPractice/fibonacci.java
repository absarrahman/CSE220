package com.reaperhouse.absar.midPractice;

public class fibonacci {
    static int fib(int n) {
        if (n <= 1){
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main (String args[]) {
        int n = 6; // X={(last 2 digit of your

System.out.println(fib(n));
}
}
