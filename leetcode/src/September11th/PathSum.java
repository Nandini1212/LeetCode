/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September11th;

/**
 *
 * @author nandini
 */
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return root.value == sum;
        }
        return hasPathSum(root.left, sum - root.value) 
                || hasPathSum(root.right, sum - root.value);
    }
    public static void main(String[]args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));
    }
}
