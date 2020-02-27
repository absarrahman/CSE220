package com.reaperhouse.absar.lab1PartTwo;

public class Task2 {
    public static void main(String[] args) {
        try {
            int x = 1 / 0;
            System.out.println(x);
        } catch (ArithmeticException e){
            System.out.println("One cannot be divided by 0. Class One e jao. Varsity te porteso keno???");
        }
    }
}
