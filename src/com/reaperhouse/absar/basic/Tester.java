package com.reaperhouse.absar.basic;

public class Tester {
    public static void main(String[] args) {
        Hexagon h1=new Hexagon(6);
        Hexagon h2=new Hexagon(3);
        System.out.println(h1.findArea());
        System.out.println(h2.findArea());
        System.out.println(h1.findPerimeter());
        System.out.println(h2.findPerimeter());
        System.out.println(h2.compareTo(h2));
    }
}
