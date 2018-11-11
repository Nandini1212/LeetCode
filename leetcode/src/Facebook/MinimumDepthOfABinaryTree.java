/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

/**
 *
 * we calculate ldepth (minimum left subtree depth) and 
 * rdepth (minimum right subtree depth) for a node. 
 * Then, if ldepth is zero but rdepth is not, 
 * that means current node is not a leaf node,
 * so return 1 + rdepth.
 * If both rdepth and ldepth are zeros 
 * then still 'if' condition works as we return 1+0 for current leaf node.

Similar logic for 'else if' branch. 
* In 'return' statement as both 'if' conditions has been failed 
* we return 1 (current node) + minimum value of recursive calls to both left and right branch.
 */
class treeN{
    int value;
    treeN left;
    treeN right;
    treeN(int item){
        left = null;
        right = null;
        value = item;
    }
}
public class MinimumDepthOfABinaryTree {
    public static int minDepth(treeN root){
        if(root == null){
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(leftDepth == 0){
            return 1 + rightDepth;
        } else if(rightDepth == 0){
            return 1 + leftDepth;
        }
        return 1 + Math.min(leftDepth, leftDepth);
    }
    public static void main(String [] args){
        treeN root = new treeN(3);
        root.left = new treeN(9);
        root.right = new treeN(20);
        root.right.left = new treeN(15);
        root.right.right = new treeN(7);
   
        System.out.println(minDepth(root));

    }
    
}
