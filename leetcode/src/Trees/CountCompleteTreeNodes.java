/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import static java.lang.Math.pow;

/*
Steps to solve this problem:
1) get the height of left-most part
2) get the height of right-most part
3) when they are equal, the # of nodes = 2^h -1
4) when they are not equal, recursively get # of nodes from left&right sub-trees
 */
public class CountCompleteTreeNodes {
    public static int getLeftHeight(TreeNodee root){
        if(root == null){
            return 0;
        }
        int height = 0;
        while(root.left != null){
            height++;
            root = root.left;
        }
        return height;
    }
    
    public static int getRightHeight(TreeNodee root){
        if(root == null){
            return 0;
        }
        int height = 0;
        while(root.right != null){
            height++;
            root = root.right;
        }
        return height;
    }
    public int countNodes(TreeNodee root) {
        if(root == null){
            return -1;
        }
        
        int leftHeight = getLeftHeight(root) + 1;
        int rightHeight = getRightHeight(root) + 1;
        
        if(leftHeight == rightHeight){
            return (2 << (leftHeight - 1)) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
