/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September12th2018;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class LongestIUniValPath {
    int max;
    public int longestUnivaluePath(TreeNode root){
        max = 0;
        longestPath(root);
        return max;
    }
    public int longestPath(TreeNode root){
        if(root == null){
            return 0;
        }
        //get max length from left and right
        int maxLeft = longestPath(root.left);
        int maxRight = longestPath(root.right);
        //calculate the max length so far
        
        int maxLeftSoFar = 0;
        int maxRightSoFar = 0;
        
        //compare root node with child node. 
        // if they are equal extend the max length by 1.
        if(root.left != null && root.left.val == root.val){
            maxLeftSoFar = maxLeft + 1;
        }
        if(root.right != null && root.right.val == root.val){
            maxRightSoFar = maxRight + 1;
        }
        //update the max with the sum of left and right lenght
        max = Math.max(max,maxLeftSoFar + maxRightSoFar);
        return Math.max(maxLeftSoFar, maxRightSoFar);
    }
    public static void main(String[]args){
        LongestIUniValPath path = new LongestIUniValPath();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);

        root.right.right = new TreeNode(5);
        System.out.println(path.longestUnivaluePath(root));
    }
}
