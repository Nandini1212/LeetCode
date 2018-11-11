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
public class IsSameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p != null && q == null) ||(p == null && q != null) ){
            return false;
        }
        if(p.value != q.value){
            return false;
        }
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
    public static void main(String[]args){
     TreeNode root= new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.right.left = root.left.right;
                
                TreeNode root1= new TreeNode(3);
		root1.left = new TreeNode(1);
		root1.right = new TreeNode(6);
		root1.left.right = new TreeNode(2);
		root1.right.left = root.left.right;

		System.out.println(isSameTree(root, root1));
		
    
    
}
}
