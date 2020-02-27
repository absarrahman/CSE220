package com.reaperhouse.absar.AHRLinkedListAssignment.File;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Finally "+hMB(5));
        System.out.println("Pow");
        System.out.println(pow(3,3));
        System.out.println("Hoc builder");
        System.out.println(hocBuilder(2));
        System.out.println("Pattern A");
        patternA(4);
    }
    public  static  int hMB(int h){
        if(h==0){
            System.out.println("Stop: "+h);
            return 0;
        } else if(h==1){
            System.out.println("Stop: "+h);
            return h;
        } else {
            System.out.println("Continue: "+h);
            return h+hMB(h-1);
        }
    }

    public static int pow(int n1,int n2){
        if(n2==0){
            return 1;
        }
        return n1*pow(n1,n2-1);
    }

    public static int hocBuilder (int height){
        if(height==1){
            return 8;
        }
        return 5+hocBuilder(height-1);
    }

    /*
    *
    * Here patternA is for handling row and patternB is for column printing
    *
    */

    public static void patternA(int x){
        if(x==1){
            System.out.print("1");
            return;
        }
        patternA(x-1);
        System.out.println();
        patternB(x);
    }
    public static void patternB(int x){
        if(x==1){
            System.out.print("1");
            return;
        }
        patternB(x-1);
        System.out.print(" "+x);
    }

}
