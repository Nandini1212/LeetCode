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
public class LeaftSimilarTrees {
    public boolean leafSimilar(TreeNodee root1, TreeNodee root2){
        Stack<TreeNodee> stack1 = new Stack<>();
        Stack<TreeNodee> stack2 = new Stack<>();
        while(!stack1.isEmpty() && stack2.isEmpty()){
            if(dfs(stack1) != dfs(stack2)){
                return false;
            }
        }
        return s1.empty() && s2.empty();
    }
    public static int dfs(Stack<TreeNodee> stack){
        
        while(true){
            TreeNodee node = stack.pop();
            if(node.left != null){
                stack.push(node.left);
            }
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left == null && node.right == null){
                return node.val;
            }
        }
    }
}
