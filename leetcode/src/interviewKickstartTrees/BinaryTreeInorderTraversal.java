/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewKickstartTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author nandini
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer>list = new ArrayList<Integer>();
        Stack<TreeNode>stack = new Stack<TreeNode>();
        
        TreeNode currentNode = root;
        if(currentNode == null){
            return list;
        }
        while(!stack.isEmpty() || currentNode != null){
            if(currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                TreeNode temp = stack.pop();
                list.add(temp.val);
                currentNode = temp.right;
                
            }
        }
        return list;
    }
}
