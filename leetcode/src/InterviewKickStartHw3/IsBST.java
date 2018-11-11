/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

/**
 *
 * @author nandini
 */
class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        value = value;
        left = null;
        right = null;
    }
}
public class IsBST {
    /*
    static boolean isBSTS(Node root){
        if(root == null){
            return true;
        }
        return isBST(root, null, null);
    }
    // if root value is lessthan root.left and root.value is 
    //greater than root.right we can say this is not a valid BST
    //in BST all the nodes in the left subtree is less than the
    //root node and all the nodes in the right subtree is greater
    //than the root node
    static boolean isBST(Node root, Integer max, Integer min) {
        if(root == null){
            return true;
        } 
        if(max != null && min >= root.value){
            return false;
        } 
        if(max != null && max <= root.value){
            return false;
        }
        return isBST(root.left, min, root.value) && isBST(root.right, root.value, max);
        
    } */
    //using in order traversal
    public boolean isValidBST(Node root) {
        return inorderTraverse(root);
    }
    //time complexity : O(n)
    //we can avoid of Auxiliary array. we can keep track of prev node
    //If the value of the currently visited node is less than the previous value, then tree is not BST. 
    Node prev = null;
    public boolean inorderTraverse(Node root) {
        if (root == null)
            return true;
        if (!inorderTraverse(root.left))
            return false;
        //allows only distict values node
        if (prev != null && root.value <= prev.value) {
          
                return false;
        }
        prev = root;
        if (!inorderTraverse(root.right))
            return false;
        return true;
    }
    public static void main(String[]args){
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        IsBST isBST = new IsBST();
        if(isBST.isValidBST(root)){
            System.out.println("is BST");
        } else {
            System.out.println("Not BST");
        }
        
    }
}
