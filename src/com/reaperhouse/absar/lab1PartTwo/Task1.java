package com.reaperhouse.absar.lab1PartTwo;

public class Task1 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[21] = 100;
            System.out.println(arr[21]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your Array size is 5. Index value cannot be more than 4.");
            System.out.println("CSE110 retake nao");
        }
    }
}
