/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macysPrep;


/**
 *
 * @author nandini
 */
class BinarySearchTree {
   
    class BinarySearchNode {
        BinarySearchNode left, right;
        int value;
        public BinarySearchNode(int val) {
            left = null;
            right = null;
            value = val;
        }
    }
    BinarySearchNode root;
    BinarySearchTree() {
        root = null;
    }
    
    void insert(int value) {
        root = insertValue(root, value);
    }
    
    BinarySearchNode insertValue(BinarySearchNode root, int value) {
        if(root == null) {
            root = new BinarySearchNode(value);
            return root;
        }
        if(value < root.value) {
            root.left = insertValue(root.left, value);
        } else if(value > root.value) {
            root.right = insertValue(root.right, value);
        } 
        return root;
    }
    void inorder() {
        inOrderTraversal(root);
    }
    public void inOrderTraversal(BinarySearchNode root) {
        if(root == null) {
            return;
        }
        if(root != null){
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
        }
    }
    
    public void preOrderTraversal(BinarySearchNode root) {
        if(root == null) {
            return;
        }
        preOrderTraversal(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    
    public void postOrderTraversal(BinarySearchNode root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        postOrderTraversal(root);
    }

    public static void main(String args[]) {
        BinarySearchTree bST = new BinarySearchTree();
        bST.insert(50);
        bST.insert(30);
        bST.insert(20);
        bST.insert(40);
        bST.insert(70);
        bST.insert(60);
        bST.insert(80);
        bST.inorder();
        //bST.postOrderTraversal(root);
        //bST.preOrderTraversal(root);
    }
    
    
    
    
    
}
