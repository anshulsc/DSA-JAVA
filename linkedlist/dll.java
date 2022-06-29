package com.company.linkedlist;

import java.sql.SQLOutput;

public class dll
{
    private Node Head;


    public void insertfirst(int val)
    {
        Node node = new Node(val);
        if(Head == null)
        {
            node.prev = null;
            node.next = null;
            Head = node;


        }
        else
        node.next = Head;
        Head.prev =  node;
        node.prev = null;
        Head  = node;
    }
    public void display()
    {
        Node temp = Head;
        Node last =  null ;
        while(temp != null)
        {
            System.out.print(temp.val + "->");
            last =temp;
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("Print in Reverse");
        while(last != null)
        {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }
    public void insert(int index,int val )
    {
        if(index == 0)
        {
            insertfirst(val);
            return;
        }
        Node node  = new Node(val);
        Node temp = Head;
        for(int i = 1; i< index; i++)
        {
            temp = temp.next;
        }


        Node temp2 = null;
        if(temp.next == null )
        {
            node.next = temp;
        }
        else
        {
            temp2 = temp.next;
            node.next = temp.next;
        }
        node.prev = temp;
        temp.next = node;
        temp2.prev = node;
    }
    public void insertlast(int val)
    {
        Node node = new Node(val);
        Node last = Head;
        if(Head == null)
        {
            insertfirst(val);
            return;
        }
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;

    }


    private class Node
    {
        int val;
        Node next;
        Node prev;

        public Node(int val)
        {
            this.val = val;
        }
        public Node(int val,Node next, Node prev)
        {
            this.val = val;
            this.next = next;
            this.prev = prev;

        }
    }
}

