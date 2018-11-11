/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author nandini
 * 
 * O(n)
 * O(1)
 */

class TreeLinkNode{
    TreeLinkNode next;
    TreeLinkNode left;
    TreeLinkNode right;
    int val;
    TreeLinkNode(int v){
        val = v;
        
    }
}
public class PopulatingNextRightPointersinEachNodeII {
     public void connect(TreeLinkNode root) {
        if(root == null)
            return;

        if(root.left != null) 
            root.left.next = root.right!=null ? root.right : findNext(root.next);
        
        if(root.right != null) 
           root.right.next = findNext(root.next);
        
        connect(root.right);
        connect(root.left);
    }
    
    public TreeLinkNode findNext(TreeLinkNode root){
        if(root == null){
            return null;
        }
        if(root.left != null){
            return root.left;
        }
        if(root.right != null){
            return root.right;
        }
        return findNext(root.next);
    }
}
