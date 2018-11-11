/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September13th2018;

/**
 *
 * @author nandini
 * Time Complexity - O(h)， Space Complexity - O(1)
 */
public class InorderSuccessor {
    public TreeNode inOrderSuccessor(TreeNode root, TreeNode p){
        if(root == null || p == null){
            return null;
        }
        TreeNode successor = null;
        while(root != null){
            if(p.val < root.val){
                successor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return successor;
            
    }
}
    
