package com.company.linkedlist;

public class Main
{
    public static void main(String[] args)
    {
        ll list = new ll();
        list.insertfirst(34);
        list.insertfirst(35);
        list.insertfirst(36);
        list.insertlast(45);
        list.insert(69,2);
        list.insert(69,4);
        list.inseertrec(100,6);
        list.display();
    }
}
