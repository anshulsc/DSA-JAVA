package com.company.bst;

public class Main {
    public static void main(String[] args) {
        bst list = new bst();

        list.createNode(23);
        list.insert(19);
        list.insert(20);
        list.insert(43);
        list.insert(4);

        int mim = list.findMin();
        System.out.println(mim);

        list.delete(4);
        mim = list.findMin();
        boolean ans = list.search(43);
        System.out.println(mim);

//        AVL tree = new AVL();
//        tree.insert(10);
//        tree.insert(20);
//        tree.insert(30);
//        tree.insert(40);
//        tree.insert(50);
//        tree.insert(25);




    }
}




