/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 * if there is a loop
 * hash
 * if(hash(root(left)){ //already exists
 * newNode.left = map.get(root.left); // and interest that value 
 * }
 * else {
 * newNode.left = cloneTree(root.left);// if it is not exist 
 * }
 * 
 * if(hash(root(left)){ //already exists
 * newNode.left = map.get(root.left); // and interest that value 
 * }
 * else {
 * newNode.left = cloneTree(root.left);// if it is not exist 
 * }
 * 
 * 
 * create a hash table
 * i will add root to newnode in the hashtable
 * put hashtable(root, newnode)
 * 
 * 
 */
public class CloneTree {
    public TreeNode cloneTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode newNode = new TreeNode(root.value);//will assign root's val to the newNode's value
        newNode.left = cloneTree(root.left);
        newNode.right = cloneTree(root.right);
        return newNode;
    }
}
