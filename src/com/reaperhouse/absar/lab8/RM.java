package com.reaperhouse.absar.lab8;

import java.util.Scanner;

public class RM {
    static int id = 100;
    Scanner sc = new Scanner(System.in);
    ArrayQueue aQ=new ArrayQueue(10);

    public void registerPatient() {
        System.out.println("Enter patient's name");
        String name = sc.next();
        System.out.println("Age");
        int age = sc.nextInt();
        System.out.println("Enter blood group");
        String blood = sc.next();
        Patient p = new Patient(name, age, blood);
        try {
            aQ.enqueue(p);
            System.out.println("Person added successfully");
        } catch (QueueOverflowException e) {
            System.out.println("Person limit exceeded");
        }
    }

    public void serverPatient() {
        try {
            Patient serve = (Patient) aQ.dequeue();
            System.out.println("The person  " + serve.name + " is served");
        } catch (QueueUnderflowException e) {
            //e.printStackTrace();
            System.out.println("No people in the appointment list");
        }
    }

    public boolean canDoctorGoHome() {
        if (aQ.isEmpty()) {
            return true;
        }
        return false;
    }

    public void cancelAll() {
        for (int i = 0; i <= aQ.size; i++) {
            try {
                aQ.dequeue();
                System.out.println("All appointments are cancelled");
            } catch (QueueUnderflowException e) {
                System.out.println("There are no patients left");
            }
        }

    }

    public void showAllPatient() {
        Object temp[]=aQ.toArray();
        for (int i=0;i<temp.length;i++) {
            for(int j=i+1;j<temp.length;j++){
                Patient x= (Patient) temp[i];
                Patient y= (Patient) temp[j];
                if((x.name).compareTo(y.name)>0){
                    Object tempo=temp[i];
                    temp[i]=temp[j];
                    temp[j]=tempo;
                }
            }
          //  System.out.println(temp.length);
        }
        for (Object i:temp) {
            System.out.println(i);
        }
    }

}