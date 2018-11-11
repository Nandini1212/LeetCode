/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class LongestSubSequence {
    public static int longestConsecutive(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])){
                continue;
            }
            if(m.containsKey(nums[i] - 1)){
                left = m.get(nums[i] - 1);
            } else {
                left = 0;
            }
            if (m.containsKey(nums[i])){
                continue;
            }
            if(m.containsKey(nums[i] + 1)){
                right = m.get(nums[i] + 1);
            } else {
                right = 0;
            }
            
            int sum = left + right + 1;
            m.put(nums[i], sum);
            res = Math.max(res, sum);
            m.put(nums[i] - left, sum);
            m.put(nums[i] + right, sum);
        }
        return res;
    }
    public static void main(String[]args){
        int[]nums =  {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }

}
