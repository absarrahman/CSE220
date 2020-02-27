package com.reaperhouse.absar.lab7;

import java.util.Scanner;

public class Main {
    static ArrayStack a = new ArrayStack();

    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String z = "";
        int x = s.length();
//        for (int i = 0; i < x; i++) {
//            if((s.charAt(i)=='(')||(s.charAt(i)=='{')||(s.charAt(i)=='[')||(s.charAt(i)==')')||(s.charAt(i)=='}')||(s.charAt(i)==']')) {
//                z = z + s.charAt(i);
//            }
//        }
        System.out.println(check(s));
    }

    public static boolean check(String v) throws StackOverflowException, StackUnderflowException {
        char e[] = v.toCharArray();
        int x = e.length;
        for (int i = 0; i < x; i++) {
            if ((e[i] == '(') || (e[i] == '{') || (e[i] == '[')||(e[i] == ')') || (e[i] == '}') || (e[i] == ']')) {

                if ((e[i] == '(') || (e[i] == '{') || (e[i] == '[')) { //opening
                    a.push(e[i]);
                } else if ((e[i] == ')') || (e[i] == '}') || (e[i] == ']')) { //closing
                    if ((a.isEmpty()) || (!matchBrackets((Character) a.top(), e[i]))) {
                        return false;
                    } else {
                        a.pop();
                    }
                }
            }

        }
        if (a.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean matchBrackets(char c1, char c2) {
        if ((c1 == '(') && (c2 == ')')) {
            return true;
        }
        if ((c1 == '{') && (c2 == '}')) {
            return true;
        }
        if ((c1 == '[') && (c2 == ']')) {
            return true;
        }
        return false;
    }
}
