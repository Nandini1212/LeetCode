/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * @author nandini
 * Since it's not a regular binary tree, 
 * but a binary search tree, and taking in account that parent 1 and 2 are not ancestors 
 * (meaning that the parents are located in two different subtrees),
 * having 2 parents breaks the property of a binary search tree. 
 * So, we can just check if the child's value satisfies the property or not. 
In the code below, I assume that in the BST, left child's value must be less,
* and the right child's value must be greater or equal to the value of the parent.
 * 
 */
public class CorruptedBST {
    public static void fix(TreeNode root, int min, int max, TreeNode parent){
        if(root == null){
            return;
        }
        if(root.value > min && root.value <= max){
            fix(root.left, min, root.value, root);
            fix(root.right, root.value, max, root);
        } else {
            if(parent.left.value == root.value){
                parent.left = null;
            } else if(parent.right.value == root.value){
                parent.right = null;
            }
        }
    }
    public static void print(TreeNode root){
        if(root == null){
            return;
        }
        print(root.left);
        System.out.println(root.value + "\t");
        print(root.right);
    }
    public static void main(String[]args){
    TreeNode root= new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.right.left = root.left.right;

		
		print(root);
		fix(root, Integer.MIN_VALUE, Integer.MAX_VALUE, null);
		System.out.println();
		print(root);
    
}
}
