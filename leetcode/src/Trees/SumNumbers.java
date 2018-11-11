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
public class SumNumbers {
    public int sumNumbers(TreeNodee root){
        return dfs(root, 0);
    }
    public int dfs(TreeNodee root, int prev){
        if(root == null){ 
            return 0;
        }
        int sum = prev * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return dfs(root.left, sum) + dfs(root.right, sum);
    }
}
