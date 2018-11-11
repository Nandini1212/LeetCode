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
class treN{
    int value;
    treN left;
    treN right;
    treN(int item){
        left = null;
        right = null;
        value = item;
    }
}

public class IsBalancedBinaryTree {
    public static int getHeight(treN root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left == -1 || right == -1){
            return -1;
        }   
        if(Math.abs(left - right) > 1){
            return -1;
        }
        return 1 + Math.max(left, right);
    }
    public static boolean isBalanced(treN root){
        if(root == null){
            return true;
        }
        if(getHeight(root) == -1){
            return false;
        }
        return true;
    }
    public static void main(String [] args){
        treN root = new treN(3);
        root.left = new treN(9);
        root.right = new treN(20);
        root.right.left = new treN(15);
        root.right.right = new treN(7);
   
        System.out.println(isBalanced(root));

    }
}

