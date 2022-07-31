package com.company.bst;

public class bst {
    Node root;
    public bst(){
        root = null;
    }
   public void createNode( int data){
        if(root == null) {
            root = new Node(data);
        }
        else insert(data);
    }
    public int findMin(){
        Node temp = root;
        while(temp.left != null){

            temp = temp.left;

        }
        return temp.data;
    }

    public void insert( int data){
       Node node;
        node = insertKey(data,root);
    }

    private Node insertKey(int data,Node temp) {
        if (temp == null){
            temp = new Node(data);
        }
       if(temp.data == data){
           return temp;
       }
       else if(data < temp.data){
           temp.left = insertKey(data,temp.left);
       }
       else if(data > temp.data) {
           temp.right = insertKey(data, temp.right);
       }
        return temp;
    }

    public boolean search(int data){
       return searchKey(data,root);
    }

    private boolean searchKey(int data, Node root) {
        boolean ans = false;
        if(root == null){
            return ans;
        }
        if(root.data == data){
            ans =  true;
        }
        if(data < root.data){
            ans = searchKey(data,root.left);
        }
        if(data > root.data){
            ans = searchKey(data,root.right);
        }

        return ans;
    }

    public void delete(int data){

        root = deleteNode(root,data);
    }

    private Node deleteNode(Node root, int data) {
        if(root == null){
            return root;
        }
        if(data < root.data){
            root.left = deleteNode(root.left,data);
            return root;
        }
        if(data > root.data) {
            root.right = deleteNode(root.right, data);
            return root;
        }

        if( root.left == null){
            Node temp = root.right;
            return temp;
        }
        else if(root.right == null){
            Node temp = root.left;
            return temp;
        }
        else{
            Node sucParent = root.right;
            Node suc = sucParent.left;
             while(suc.left != null){
                sucParent = sucParent.left;
                suc = suc.left;
            }
            if(suc.right == null) {
                return suc;
            }
            else{
                sucParent.left = suc.right;
                return suc;
            }
        }
    }

    public class Node{
      int data;
      Node left,right;

       public Node(int data){
          this.data = data;
          this.left = null;
          this.right = null;
      }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
