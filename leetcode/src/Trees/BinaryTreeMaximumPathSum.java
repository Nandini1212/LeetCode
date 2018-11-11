/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author nandini
 */
public class BinaryTreeMaximumPathSum {
    private static int max = Integer.MIN_VALUE;
    public static int helper(TreeNodee root){
        if(root == null){
            return 0;
        }
        int leftHeight = Math.max(0, helper(root.left));
        int rightHeight = Math.max(0, helper(root.right));
        
        int sum = leftHeight + rightHeight + root.value;
        max = Math.max(max, sum);
        return Math.max(leftHeight, rightHeight) + root.value;       
    }
    
    public int maxPathSum(TreeNodee root){
        if(root == null){
            return 0;
        }
        helper(root);
        return max;
    }
}
