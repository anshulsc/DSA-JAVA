package com.company.linkedlist;

public class ll {

    private int size;
    private Node Head;
    private Node Tail;

    public ll()
    {
        this.size = 0;
    }

    public void insertfirst(int val)
    {
        Node node = new Node(val);
        node.next = Head;
        Head = node;
        if(Tail == null)
        {
            Tail = Head;
        }
        size++;
    }
    public void insertlast(int val)
    {
        if(Tail == null)
        {
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        Tail.next = node;
        Tail = node;
        size ++;

    }
    public void addll( Node l1 , Node l2)
    {

    }
    public void insert(int val, int ind)
    {
        Node temp = Head;
        for(int i  = 1 ; i < ind ; i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;
    }

    /** Used helper function to pass a node into recursion so that it can have a track of the
     * position where the pointer is at that particular instance of time, and you could also do this
     * by another method if you want where you would have to return the node type,but it'll make it
     * more hectic only*/
    public void inseertrec(int val ,int index)
    {

        helper(val , index , Head);
    }
    public void helper(int val , int index , Node node)
    {
        if(index == 0)
        {
            insertfirst(val);
            return;
        }
        if(index == 1)
        {
            Node temp = new Node(val);
            temp.next = node.next;
            node.next = temp;
            size++;
            return;
        }
        helper(val,index-1,node.next);
    }
    public void display()
    {
        Node temp = Head;

        while(temp != null)
        {
            System.out.print(temp.value + " -> " );
            temp = temp.next;
        }
        System.out.print("End");
    }
    public void delete(int ind)
    {
        Node temp1 = Head;
        Node temp2 = Head.next;
        if(ind == 0)
        {
            deletefirst();
        }
        for(int i = 1; i<ind ; i++)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = temp2.next;

        if(Head == null)
        {
            Tail = null;
        }
        if(ind != 0)
        {
            size--;
        }
    }
    public void deleteTail()
        {
            if(size <= 1)
            {
                deletefirst();
            }

            Node temp = get(size - 2);
            Tail = temp;
            temp.next = null;
            size --;
        }
    public Node get(int index)
    {
        Node node = Head;
        for(int i = 0; i< index ; i++)
        {
            node = node.next;
        }
        return node;
    }

    public void deletelast()
    {
        Node temp = Head;
        for(int i = 1; i<size-1 ; i++)
        {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }
    public void deletefirst()
    {
        Node temp = Head.next;
        Head = temp;
        if(Head == null)
        {
            Tail = null;
        }
        size--;
    }

    public void size()
    {
        System.out.println("Size of Linked List is " + size);
    }
    public class Node {
        int value;
        Node next;

        public Node(int val)
        {
            this.value = val;
        }
        public Node(int val , Node node)
        {
            this.value = val;
            this.next = node;
        }

    }
}


