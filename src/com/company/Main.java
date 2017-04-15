package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedFunctions lf= new LinkedFunctions();
        /*LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(13);
        llist.push(14);
        llist.push(7);
        llist.push(11);*/
        LinkedList llist = new LinkedList();
        llist.push(3);
        llist.push(1);
        llist.push(5);
        lf.printLinkedList(llist.head);
        System.out.println("...........................................................");
        LinkedList llist1 = new LinkedList();
        llist1.push(5);
        llist1.push(9);
        llist1.push(2);
        lf.printLinkedList(llist1.head);
        System.out.println("...........................................................");
        //lf.printLinkedList(llist.head);
//        System.out.println("...........................................................");
        //lf.printLinkedList(lf.removeduplicatesFromUnsortedLinkedList(llist.head));
        //lf.printLinkedList(lf.removingduplicatesFromLinkedListInPlace(llist.head));
        //System.out.println(lf.findKthToLastElementLinkedList(llist.head,2));
        //lf.printLinkedList(lf.deleteElementFromMiddleOfLinkedList(llist.head));
        //lf.printLinkedList(lf.partitionOfLinkedList(llist.head,8));
        int data1[] = {3, 1, 5};
        int data2[] = {5, 9, 2};
        System.out.println("...........................................................");
        lf.printLinkedList(lf.addLists(llist.head,llist1.head));

    }
}
