package com.company;

/**
 * Created by gaurav on 11/4/17.
 */
public class LinkedList {

        Node head;  // head of list

        /* Inserts a new Node at front of the list. */
        public void push(int new_data)
        {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
            Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
            new_node.next = head;

        /* 4. Move the head to point to new Node */
            head = new_node;
        }
}
