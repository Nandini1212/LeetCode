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
public class SumOFLeftLeaves {
    public int sumOfLeftLeaves(TreeNodee root) {
        if(root == null){
            return 0;
        }
        Stack<TreeNodee>stack = new Stack<TreeNodee>();
        int result = 0;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNodee temp = stack.pop();
            if(temp.left != null){
                if(temp.left.left == null && temp.left.right == null){
                    result += temp.left.val;
                    
                } else {
                    stack.push(temp.left);
                }
            }
            if(temp.right != null){
                if(temp.right.left != null && temp.right.right != null){
                    stack.push(temp.right);
                } 
            }
        }
        return result;
    }

}
