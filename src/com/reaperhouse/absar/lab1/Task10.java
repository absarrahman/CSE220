package com.reaperhouse.absar.lab1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter day");
        int day = sc.nextInt();

        System.out.println(season(month,day));

    }

    public static String season(int month,int day){
        if((month>=1)||(month<=12)&&(day>=1)||(day<=31)){
            if(((month==12)&&(day>=16))||(month==1)||((month==2)&&(day<=29))||((month==3)&&(day<=15))){
                return "Winter";
            } else if(((month==3)&&(day>=16))||((month==4)&&(day<=30))||(month==5)||((month==6)&&(day<=15))){
                return "Spring";
            } else if(((month==6)&&(day>=16))||(month==7)||(month==8)||((month==9)&&(day<=15))){
                return "Summer";
            } else {
                return "Fall";
            }
        }
        return "Invalid date";
    }
}
