/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.Stack;

/**
 *
 * @author nandini
 */
public class FlattenBinaryTree {
    public void flatten(TreeNodee root) {
        helper(root);
    }
    
    // flatten root and return the last node
    private TreeNodee helper(TreeNodee root) {
        if (root == null) {
            return null;
        }
        
        TreeNodee leftLast = helper(root.left);
        TreeNodee rightLast = helper(root.right);
        
        // connect leftLast to root.right
        if (leftLast != null) {
            leftLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        
        if (rightLast != null) {
            return rightLast;
        }
        
        if (leftLast != null) {
            return leftLast;
        }
        
        return root;
    }


// version 3: Non-Recursion
/**
 * Definition of TreeNodee:
 public class TreeNodee {
     public int val;
     public TreeNodee left, right;
     public TreeNodee(int val) {
         this.val = val;
         this.left = this.right = null;
     }
 }
 */
//divide and conquer
    
    
    public void flattenDived(TreeNodee root) {
        if (root == null) {
            return;
        }
        
        Stack<TreeNodee> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.empty()) {
            TreeNodee node = stack.pop();
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            
            // connect 
            node.left = null;
            if (stack.empty()) {
                node.right = null;
            } else {
                node.right = stack.peek();
            }
        }
    }
}
