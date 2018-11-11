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
public class PopulatingNextRightPointersInEachNode {
    //O(n) - time
    //O(1) - space
    public void connect(TreeLinkNode root){
        if(root == null){
            return;
        }
        TreeLinkNode current = root;
        TreeLinkNode nextLeftMost = null;
        
        while(current.left != null){
            //this for start of next level
            nextLeftMost = current.left;
            while(current != null){
                current.left.next = current.right;
                if(current.next == null){
                    current.right.next = null;
                }
                current.right.next = current.next.left;
                current = current.next;
            }
            current = nextLeftMost;
        }
    }
    
    //O(n) - time
    //O(1) - space
    
    public static void connect(TreeLinkNode root){
        if(root == null){
            return;
        }
        while(root.left != null){
            root.left.next = root.right;
            if(root.next != null){
                root.right.next = root.next.left;
            }
            connect(root.left);
            connect(root.right);
        }
    }
}
