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
public class TrimBST {
    public TreeNo trimBST(TreeNo root, int L, int R) {
        if(root == null){
            return null;
        }
        if(root.val >= L && root.val <= R){
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
        }

        if(root.val < L){
            return trimBST(root.right, L, R);
        }
        if(root.val > R){
            return trimBST(root.left, L, R);
        }
        return root;
    }
}
