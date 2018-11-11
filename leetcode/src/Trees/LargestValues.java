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
public class LargestValues {
     public List<Integer> largestValues(TreeNodee root) {
        List<Integer> list = new ArrayList<Integer>();
        
        helper(root, list, 0);
        return list;
    }
    public void helper(TreeNodee root, List<Integer> list, int level){
        if(root == null){
            return;
        }
        if(level == list.size()){
            list.add(root.val);
        } else {
            list.set(level, Math.max(list.get(level), root.val));
        }
        helper(root.left, list, level + 1);
        helper(root.right, list, level + 1);
    }
}
