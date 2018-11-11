/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

import java.util.HashMap;

/**
 *
 * @author nandini
 * The subarray sum reminds me the range sum problem. 
 * Preprocess the input array such that you get the range sum in constant time.
sum[i] means the sum from 0 to i inclusively
the sum from i to j is sum[j] - sum[i - 1] 
* except that from 0 to j is sum[j].
j-i is equal to the length of subarray of original array. 
* we want to find the max(j - i) for any sum[j]
* we need to find if there is a previous sum[i] 
* such that sum[j] - sum[i] = k 
* Instead of scanning from 0 to j -1 to find such i, 
* we use hashmap to do the job in constant time.
However, there might be duplicate value of of sum[i] 
* we should avoid overriding its index as we want the max j - i, 
* so we want to keep i as left as possible.
 */
public class MaxSubArrayLength {
    public static int maxSubArrayLen(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        if(nums == null || nums.length == 0){
            return 0;
        }
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            
            if(!map.containsKey(sum - k)){
                map.put(nums[i], i);
            } 
            if(map.containsKey(nums[i] - k)){
                max = Math.max(max, i - map.get(nums[i] - k));
            }
        }
        return max;
    }
    public static void main(String [] args){
        int [] nums = {-2,-1,2,1};
        System.out.println(maxSubArrayLen(nums, 1));
    }
    
}
