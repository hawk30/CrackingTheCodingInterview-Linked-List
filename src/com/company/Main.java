package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedFunctions lf= new LinkedFunctions();
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(13);
        llist.push(14);
        llist.push(7);
        llist.push(11);
        lf.printLinkedList(llist.head);
        System.out.println("...........................................................");
        //lf.printLinkedList(lf.removeduplicatesFromUnsortedLinkedList(llist.head));
        //lf.printLinkedList(lf.removingduplicatesFromLinkedListInPlace(llist.head));
        //System.out.println(lf.findKthToLastElementLinkedList(llist.head,2));
        lf.printLinkedList(lf.deleteElementFromMiddleOfLinkedList(llist.head));

    }
}
