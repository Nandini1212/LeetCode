/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Some;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 * time : O(n)
 * Space : O(1)
 */
public class RandomPickIndex {
    private HashMap<Integer, List<Integer>> indexes = new HashMap<>();

    public RandomPickIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(!indexes.containsKey(num)){
                indexes.put(num, new ArrayList<Integer>());
            }
            indexes.get(num).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> indexes = this.indexes.get(target);
        int i = (int) (Math.random() * indexes.size());
        return indexes.get(i);
    }
}
