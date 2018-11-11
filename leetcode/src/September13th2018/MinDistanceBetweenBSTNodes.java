/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September13th2018;

import java.util.Stack;

/**
 *
 * @author nandini
 * Time complexity : O(log n)
 * space complexity : O(n)
 */
class TreeNod {
     int val;
      TreeNod left;
      TreeNod right;
      TreeNod(int x) { val = x; }
  }
public class MinDistanceBetweenBSTNodes {
   
    public int minDiffInBST(TreeNode root) {
        int min = Integer.MAX_VALUE;
        TreeNode prev = null;
        Stack<TreeNode>stack = new Stack<TreeNode>();
        TreeNode currentNode = root;
        
        while(currentNode != null || (stack.isEmpty())){
            if(currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.pop();
                if(prev != null){
                    min = Math.min(min, currentNode.val - prev.val);
                }
                prev = currentNode;
                currentNode = currentNode.right;
            }
        }
        return min;
    }
}
