package com.reaperhouse.absar.lab8;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RM r = new RM();
//        System.out.println("1. Array Queue");
//        System.out.println("2. List Queue");
        outer:while (true) {
            System.out.println("1. Register patient");
            System.out.println("2. Serve a patient");
            System.out.println("3. Cancel all appointments");
            System.out.println("4. Can doc go home?");
            System.out.println("5. Sorted Patient list ");
            System.out.println("6. Exit");

            int x = sc.nextInt();
            switch (x) {
                case 1:
                    r.registerPatient();
                    break;
                case 2:
                    r.serverPatient();
                    break;
                case 3:
                    r.cancelAll();
                    break;
                case 4:
                    if (r.canDoctorGoHome()) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                    break;
                case 5:
                    r.showAllPatient();
                    break;
                default:
                    System.out.println("Wrong input.");
                    break;
                case 6:
                    break outer;

            }

        }
    }
}