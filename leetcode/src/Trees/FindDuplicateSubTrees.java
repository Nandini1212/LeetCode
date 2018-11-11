/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class FindDuplicateSubTrees {
    public List<TreeNodee> findDuplicateSubtrees(TreeNodee root) {
        HashMap<String, Integer> set = new HashMap<>();
        List<TreeNodee> res = new ArrayList<>();
        helper(root, set, res);
        return res;
    }

    public static String helper(TreeNodee root, HashMap<String, Integer> map, List<TreeNodee>result){
        if(root == null){
            return "";
        }
        String str = "(" + helper(root.left, map, result) + root.val + helper(root.right, map, result) + ")";
        if(map.getOrDefault(str, 0) == 1){
            result.add(root);
        }
        map.put(str, map.getOrDefault(str, 0) + 1);
        return str;
    }
}
