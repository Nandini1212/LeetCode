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
public class topKthLargest {
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

    //we cant do pass by value because integers are immutable
    //worst case - heigt + k - O(logn + k)
    //space - log n
   public void inOrder(Node root, int k){
        if(root != null){
            inOrder(root.right, k);
            System.out.println(root.value + " "+ k);
            inOrder(root.left, k);
        }
    }
    
}
