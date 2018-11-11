/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 */
class TreeNode{
    int value;
    TreeNode left, right;
    TreeNode(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class LCAOfBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(root == p && root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null){
            return null;
        }
        TreeNode current = root;
        if(current.value > p.value && current.value < q.value){
            return current;
        } else if(current.value > p.value && current.value > q.value){
            return lowestCommonAncestor(current.left, p, q);
            
        } else if(current.value < p.value && current.value < q.value){
            return lowestCommonAncestor(current.right, p, q);
        }
        return root;
    }
}
