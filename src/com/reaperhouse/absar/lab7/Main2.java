package com.reaperhouse.absar.lab7;

import java.util.Scanner;

public class Main2 {
    static ArrayStack a = new ArrayStack();
    public static void main(String[] args) throws StackUnderflowException, StackOverflowException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        indentCode(s);
    }
    public static void indentCode(String s) throws StackUnderflowException, StackOverflowException {
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                System.out.println("{");
                for(int j=1;j<=4;j++){
                    System.out.print(" ");
                }
                a.push(s.charAt(i));
            }
            else if(s.charAt(i)==';'){
                if(s.charAt(i+1)=='}'){
                    System.out.print(";");
                } else {
                    System.out.print(";");
                    System.out.println();
                    for (int j = 1; j <= 4; j++) {
                        System.out.print(" ");
                    }
                }
            }
            else if(s.charAt(i)=='}'){
                System.out.println("");
                System.out.println("}");
                a.pop();
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }

}
/*

if(x==3){System.out.println(x/2);}
if(x==3){System.out.println(x/2);System.out.println("END");}
 */