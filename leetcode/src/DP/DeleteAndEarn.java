/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class DeleteAndEarn {
    //Time O(nlogn) space O(1).
    public static int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int cur = 0;
        int prev = 0;
        int prev2 = 0;        
        int startIndex = 0;
        
        while(i < nums.length){
            cur = nums[i];
            startIndex = i - 1;
            while(i < nums.length - 1 && nums[i] == nums[i+1]) cur += nums[i++];  
            
            if(startIndex >= 0 && nums[i] > nums[startIndex] + 1) cur += prev;
            else cur = Math.max(cur + prev2, prev);            
            
            prev2 = prev;
            prev = cur;
            i++;
        }    
        return cur;        
    }
    //Time O(n) space O(n).
     public int deleteAndEarns(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] array = new int[10001];
        for (int i : nums) {
            array[i]++;
        }
        for (int i = 2 ; i < array.length; i++) {
            array[i] = Math.max(i * array[i] + array[i - 2], array[i - 1]);
        }
        return array[array.length - 1];
    }
    public static void main(String[]args){
        int[]nums = {3,4,2};
        System.out.println(deleteAndEarn(nums));
    }
}
