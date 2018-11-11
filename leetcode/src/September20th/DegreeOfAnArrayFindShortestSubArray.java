/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nandini
 */
public class DegreeOfAnArrayFindShortestSubArray {
    public static int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> count = new HashMap<>();
            Map<Integer, Integer> left = new HashMap<>();
            Map<Integer, Integer> right = new HashMap<>();
            int maxCount = 0;

            for (int i = 0; i < nums.length; i++) {
                if(!count.containsKey(nums[i])){
                    count.put(nums[i], 0);
                    left.put(nums[i], i);
                }
                count.put(nums[i], count.get(nums[i]) + 1);
                right.put(nums[i], i);
                maxCount = Math.max(maxCount, count.get(nums[i]));
                
            }
            int minLength = Integer.MAX_VALUE;
            for (int num : count.keySet()) {
                if (count.get(num) == maxCount) {
                   minLength = Math.min(minLength, right.get(num) - left.get(num) + 1);
                }
            }
            return minLength;
    }
    public static void main(String[]args){
        int [] arr = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(arr));
    }
}
