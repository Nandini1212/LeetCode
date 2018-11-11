/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStartHw3;

/**
 *
 * @author nandini
 */
class TNode {
    int value;
    TNode left;
    TNode right;
    TNode(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class CountUniValSubtrees {
    public static boolean dfs(TNode root, int[]count){
        if(root == null){
            return true;
        }
        boolean left = dfs(root.left, count);
        boolean right = dfs(root.right, count);
        if(!left || !right){
            return false;
        }
        if(root.left != null && root.value != root.left.value){
            return false;
        }
        if(root.right != null && root.value != root.right.value){
            return false;
        }
        count[0]++;
        return true;
    }
    
    public static int countUnivalSubtrees(TNode root) {
        int [] count = new int[1];
        dfs(root, count);
        return count[0];
    }
    
    public static void main(String [] args){
        TNode tree = new TNode(1);
        tree.left = new TNode(1);
        tree.left.right = new TNode(3);

        
        
        
       System.out.println(countUnivalSubtrees(tree));
        
    }
    
}
