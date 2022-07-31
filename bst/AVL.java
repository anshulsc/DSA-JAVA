package com.company.bst;

public class AVL {

    Node root;

    public void insert(int data){

        root = insertNode(root,data);
    }

    public  static int height(Node node){
        if(node == null){
            return 0;
        }
        return node.height;
    }

    public int max(int a , int b){
        return a>b? a:b;
    }

    private Node insertNode(Node root, int data) {

        if(root == null){
            return new Node(data);
        }
        if(data < root.key ){
            root.left = insertNode(root.left,data);
        }
        if(data > root.key ){
            root.right = insertNode(root.right,data);
        }

        root.height = max(height(root.left),height(root.right)) + 1;

        int balance = balanceFactor(root);

        if(balance>1 && data < root.left.key){

            return rightRotate(root);
        }
        if(balance > 1 && data > root.left.key){
            return leftRightRotate(root);
        }

        if(balance < -1 && data > root.right.key){

            return leftRotate(root);
        }
        if(balance <- 1 && data < root.left.key){
            return rightLeftRotate(root);
        }


        return root;
    }

    private Node rightRotate(Node node ) {
        Node child = node.left;
        Node rchild = child.right;



        node.left = rchild;
        child.right = node;

        child.height = max(height(child.left),height(child.right)) + 1;
        node.height =max(height(node.left),height(node.right)) + 1;
        return child;
    }

    public Node leftRightRotate(Node node){
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }
    public Node rightLeftRotate(Node node){
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }

    private Node leftRotate(Node node) {
        Node child = node.right;
        Node rchild = child.left;



        node.right = rchild;
        child.left = node;

        child.height = max(height(child.left),height(child.right)) + 1;
        node.height =max(height(node.left),height(node.right)) + 1;
        return child;
    }

    private int balanceFactor(Node root) {
        if(root == null){
            return 0;
        }
        return (height(root.left) - height(root.right));
    }

/** Balancing AVL tree
 * **/



    public class Node{
        int key,height;
        Node left, right;

        public Node( int data){
            this.key = data;
            height = 1;
        }
    }
}
