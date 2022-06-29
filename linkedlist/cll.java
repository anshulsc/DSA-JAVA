package com.company.linkedlist;

import java.sql.SQLOutput;

public class cll
{
    private Node Head = null;
    private Node Tail;

    public void insertfirst( int val)
    {
        Node node = new Node(val);
        if(Head == null)
        {
            Head = node;
            Tail = node;
            return;
        }
        node.next = Head;
        Tail.next = node;
        Head = node;


    }
    public void display()
    {
        Node temp = Head;
       do
        {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
       while(temp != Head);
        System.out.println("End");
    }

    private class Node
    {
        int val;
        Node next;

        public Node(int val)
        {
            this.val = val;
        }
    }
}
