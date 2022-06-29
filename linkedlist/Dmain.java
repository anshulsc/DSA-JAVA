package com.company.linkedlist;

public class Dmain
{
    public static void main(String[] args)
    {
        dll list = new dll();
        list.insertlast(69);
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);
        list.insertlast(67);
        list.insert(3,687);
//        list.insertlast(67);
//        list.insertfirst(4);
        list.display();
    }
}
