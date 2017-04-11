package com.company;

/**
 * Created by gaurav on 11/4/17.
 */
public class LinkedFunctions {

    void printLinkedList(Node head){
        if(head==null)
            return;
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
