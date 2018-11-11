/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewKickstartTrees;

/**
 *
 * @author nandini
 */
class Node {
    int value;
    Node left;
    Node right;
    
    //creating a node
    public Node(int value){
        value = value;
        left = null;
        right = null;
    }
}

public class Tree {
    
    //recursive solution
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.value + " ");
            inOrder(root.right);
        }
    }
    
    //iterative Solution
    public void inOrderIterative(Node root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = 
    }
    
}

