/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

/**
 *
 * @author nandini
 * 
 */
class TreeNode {
    int value;
    TreeNode left, right;
    TreeNode(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class UpsideDownBT {
    public static TreeNode upSideDownBt(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode result = upSideDownBt(root.left);
        root.left.left = root.right;
        root.left.right = root;
        root.left = null;
        root.right = null;
        return result;
    }
    
}
