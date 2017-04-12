package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaurav on 11/4/17.
 */
public class LinkedFunctions {

    void printLinkedList(Node head) {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    Node removeduplicatesFromUnsortedLinkedList(Node head) {
        if (head == null)
            return head;
        Map<Integer,Integer> map= new HashMap<>();
        Node prevNode=head;
        Node currNode=head.next;
        map.put(head.data,1);
        Node temp;
        while(currNode!=null){
            int data=currNode.data;
            if(map.containsKey(data)){

                prevNode.next=currNode.next;
                temp=currNode;
                currNode=currNode.next;
                temp.next=null;

            }else{
                map.put(data,1);
                prevNode=currNode;
                currNode=currNode.next;
            }
        }
        return head;
    }
}
