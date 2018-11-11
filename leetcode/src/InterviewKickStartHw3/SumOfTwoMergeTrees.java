/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

import java.util.Stack;

/**
 *
 *     //sum of two merged tree
 */
class TreeN{
    int value;
    TreeN left;
    TreeN right;
    TreeN(int item){
        value = item;
        left = null;
        right = null;
    }
    
}
public class SumOfTwoMergeTrees {
    public static void inorderIterative(TreeN root){
        Stack<TreeN> stack = new Stack<TreeN>();
        TreeN current = root;
        while(current != null && !stack.isEmpty()){
            if(current != null){
                stack.push(root);
                current = current.left;
            } else {
                TreeN n = stack.pop();
                System.out.println(" " +root.value);
                current = n.right;
            }
            
        }
    }
    public static void inorderTraversal(TreeN root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.println(" "+root.value);
        inorderTraversal(root.right);
    }

    static TreeN mergeTrees(TreeN n1, TreeN n2) {
        
       if(n1 == null){
           return n2;
       }
       if(n2 == null){
           return n1;
       }
       n1.value += n2.value;
       n1.left = mergeTrees(n1.left, n2.left);
       n1.right = mergeTrees(n1.right, n2.right);
       return n1;

    }
    public static void main(String[]args){
        TreeN tree1 = new TreeN(2);
        tree1.left = new TreeN(1);
        tree1.right = new TreeN(3);

        
        TreeN tree2 = new TreeN(7);
        tree2.left = new TreeN(6);
        tree2.right = new TreeN(8);
        
        TreeN mergedTree = mergeTrees(tree1, tree2);
        inorderTraversal(mergedTree);
        
    }
    
}
