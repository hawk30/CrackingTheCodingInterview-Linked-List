package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedFunctions lf= new LinkedFunctions();
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        lf.printLinkedList(llist.head);
        System.out.println("...........................................................");
        lf.printLinkedList(lf.removeduplicatesFromUnsortedLinkedList(llist.head));
    }
}
