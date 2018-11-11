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
public class ConvertBSTToGreaterTree {
    public  TreeNodee convertBST(TreeNodee root){
        dfs(root, val);
        return root;
    }
    public int dfs(TreeNodee root, int val){
        if(root == null){
            return val;
        }
        int right = dfs(root.right, val);
        int left = dfs(root.left, root.val + right);
        root.val = root.val + right;
        return left;
    }
    
}
