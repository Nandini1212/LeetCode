/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class PathSum {
    public List<List<Integer>> pathSum(TreeNodee root, int sum) {
    
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        List<Integer> sub = new ArrayList<Integer>();
        
        helper(result, sub, root, sum);
        return result;
        
    }
    
    public static void helper(List<List<Integer>> result, List<Integer> sub, TreeNodee root, int sum){
        if(root == null){
            return;
        }
        sub.add(root.val);
        sum -= root.val;
               
        if(root.left == null && root.right == null ){
            if(sum == 0){
                result.add(new ArrayList<>(sub));
            }
        }
        if(root.left != null){
            helper(result, sub, root.left, sum);
        }
        if(root.right != null){
            helper(result, sub, root.right, sum);
        }
            sub.remove(sub.size() - 1);
        }
    } 

}
