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
        Map<Integer, Integer> map = new HashMap<>();
        Node prevNode = head;
        Node currNode = head.next;
        map.put(head.data, 1);
        Node temp;
        while (currNode != null) {
            int data = currNode.data;
            if (map.containsKey(data)) {

                prevNode.next = currNode.next;
                temp = currNode;
                currNode = currNode.next;
                temp.next = null;

            } else {
                map.put(data, 1);
                prevNode = currNode;
                currNode = currNode.next;
            }
        }
        return head;
    }

    Node removingduplicatesFromLinkedListInPlace(Node head) {
        if (head == null)
            return head;
        Node prevNode;
        Node currNode=head;
        Node temp;
        while (currNode!=null && currNode.next!=null){
            prevNode=currNode;
            while(prevNode.next!=null){
                if(currNode.data==prevNode.next.data){
                    temp=prevNode.next;
                    prevNode.next=prevNode.next.next;
                }else
                    prevNode=prevNode.next;
            }
            currNode=currNode.next;
        }
        return head;
    }

    int findKthToLastElementLinkedList(Node head, int k){
        if(head==null)
            return -1;
        Node ptr1=head, ptr2=head;
        int count=1;
        while(ptr1!=null && ptr1.next!=null && count<k){
            count++;
            ptr1=ptr1.next;
        }
        while(ptr1.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr2.data;

    }

    Node deleteElementFromMiddleOfLinkedList(Node head){
        if(head==null)
            return head;
        Node ptr1=head,ptr2=head, prevNode=null;
        while ( ptr1!=null && ptr1.next!=null){
            ptr1=ptr1.next.next;
            prevNode=ptr2;
            ptr2=ptr2.next;
        }
        prevNode.next=ptr2.next;
        return head;

    }

}
