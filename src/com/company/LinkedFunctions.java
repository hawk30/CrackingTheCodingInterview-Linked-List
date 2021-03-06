package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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
        Node currNode = head;
        Node temp;
        while (currNode != null && currNode.next != null) {
            prevNode = currNode;
            while (prevNode.next != null) {
                if (currNode.data == prevNode.next.data) {
                    temp = prevNode.next;
                    prevNode.next = prevNode.next.next;
                } else
                    prevNode = prevNode.next;
            }
            currNode = currNode.next;
        }
        return head;
    }

    int findKthToLastElementLinkedList(Node head, int k) {
        if (head == null)
            return -1;
        Node ptr1 = head, ptr2 = head;
        int count = 1;
        while (ptr1 != null && ptr1.next != null && count < k) {
            count++;
            ptr1 = ptr1.next;
        }
        while (ptr1.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr2.data;

    }

    Node deleteElementFromMiddleOfLinkedList(Node head) {
        if (head == null)
            return head;
        Node ptr1 = head, ptr2 = head, prevNode = null;
        while (ptr1 != null && ptr1.next != null) {
            ptr1 = ptr1.next.next;
            prevNode = ptr2;
            ptr2 = ptr2.next;
        }
        prevNode.next = ptr2.next;
        return head;

    }

    Node partitionOfLinkedList(Node head, int x) {
        if (head == null)
            return head;
        Node lowerHead = null, lowertail = null, greaterHead = null, greaterTail = null;
        Node temp = head;
        while (temp != null) {
            if (temp.data <= x) {
                if (lowerHead == null)
                    lowerHead = temp;
                if (lowertail == null)
                    lowertail = temp;
                else
                    lowertail = lowertail.next = temp;

            } else {
                if (greaterHead == null)
                    greaterHead = temp;
                if (greaterTail == null)
                    greaterTail = temp;
                else
                    greaterTail = greaterTail.next = temp;
            }
            temp = temp.next;
        }
        if (greaterHead != null)
            greaterTail.next = null;
        if (lowerHead == null) {
            return greaterHead;
        } else {
            lowertail.next = greaterHead;
            return lowerHead;
        }
    }

    Node addLists(Node l1, Node l2) {
        return addLists(0, l1, l2);
    }

    Node addLists(int carryOver, Node l1, Node l2) {
        Node l3 = null;
        // stop conditions
        if (l1 == null && l2 == null && carryOver == 0) {
            return null;
        }
        if (l1 == null) {
            l1 = new Node(0);
        }
        if (l2 == null) {
            l2 = new Node(0);
        }

        // iteration
        int addedValue = l1.data + l2.data + carryOver;
        carryOver = 0;

        if (addedValue >= 10) {
            addedValue -= 10;
            carryOver = 1;
        }

        l3 = new Node(addedValue);

        // recursion
        l3.next = addLists(carryOver, l1.next, l2.next);
        return l3;
    }

    Node circularLinkedListHead(Node head) {
        if (head == null)
            return head;
        Node slow = head, fast = head.next;
        boolean loopExists = false;
        if (slow == fast)
            loopExists = true;
        else {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (loopExists) {
            slow = head;
            while (slow != head && slow != null && fast != null) {
                slow = slow.next;
                head = head.next;
            }
            return slow;
        }
        return null;
    }

    boolean linkedListIsPalindrome(Node head) {
        if (head == null)
            return false;
        Stack<Node> sk = new Stack<>();
        Node temp = head;
        while (temp != null) {
            sk.push(temp);
            temp = temp.next;
        }
        temp = head;
        while (!sk.isEmpty() && temp != null) {
            if (temp.data == sk.peek().data) {
                sk.pop();
            }
            temp = temp.next;
        }
        if (sk.isEmpty())
            return true;
        else
            return false;

    }

    boolean LinkedListPalindromeWithoutAddnSpace(Node head) {
        if (head == null)
            return false;
        Node slowPtr = head, fastPtr = head, middleNode = null, prevToSlowptr = null;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            prevToSlowptr = slowPtr;
            slowPtr = slowPtr.next;
        }
        if (fastPtr != null) {//in case of odd list
            middleNode=slowPtr;
            slowPtr=slowPtr.next;
     }
     Node secondhalf=slowPtr;
         prevToSlowptr.next=null;
         Node reverseLL=reverse(secondhalf);
         boolean res=compare(head,reverseLL);
        reverseLL=reverse(secondhalf);
         if(middleNode!=null){
             prevToSlowptr.next=middleNode;
             middleNode.next=reverseLL;
         }else
             prevToSlowptr.next=reverseLL;
         return res;

    }

    Node reverse(Node secondHalf) {
        Node prevNode = null, currNode = secondHalf, nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        secondHalf = prevNode;
        return secondHalf;
    }

    boolean compare(Node head, Node secondhalf) {
        Node temp1 = head, temp2 = secondhalf;
        while (temp1 != null && temp2 != null) {
                if(temp1.data!=temp2.data)
                    return false;
                else{
                    temp1=temp1.next;
                    temp2=temp2.next;
                }
        }

        return true;
    }
}

