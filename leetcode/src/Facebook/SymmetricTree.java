/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 * The idea is to write a recursive function isMirror() that takes two trees as argument and 
 * returns true 
 * if trees are mirror and 
 * false if trees are not mirror. 
 * The isMirror() function recursively checks two roots and subtrees under the root.
 */
class Node 
{
    int key;
    Node left, right;
  
    Node(int item) 
    {
        key = item;
        left = right = null;
    }
}
public class SymmetricTree {
    
    // returns true if trees with roots as root1 and root2 are mirror
    boolean isMirror(Node node1, Node node2) 
    {
        // if both trees are empty, then they are mirror image
        if (node1 == null && node2 == null)
            return true;
  
        // For two trees to be mirror images, the following three
        // conditions must be true
        // 1 - Their root node's key must be same
        // 2 - left subtree of left tree and right subtree
        //      of right tree have to be mirror images
        // 3 - right subtree of left tree and left subtree
        //      of right tree have to be mirror images
        if (node1 != null && node2 != null && node1.key == node2.key)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));
  
        // if neither of the above conditions is true then
        // root1 and root2 are mirror images
        return false;
    }
  
    // returns true if the tree is symmetric i.e
    // mirror image of itself
    boolean isSymmetric(Node root) 
    {
        // check if tree is mirror of itself
        return isMirror(root, root);
    }
    
}
