package com.reaperhouse.absar.midPractice;

public class Tester {
    public static void main(String[] args) {
        LinkedList n = new LinkedList();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.printList();
        n.removeOdd();
        n.printList();
        n.countNode();
    }
}
