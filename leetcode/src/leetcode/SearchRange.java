/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.



http://www.learn4master.com/algorithms/binary-search/leetcode-search-for-a-range-java
 */
package leetcode;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
//upper and lower bound of a target element
public class SearchRange {
    
    public static int[] searchRange(int[] nums, int target) {
        int upper = upperOrLower(nums,target,true);
        int lower =upperOrLower(nums, target,false);
        return new int[]{lower, upper};
    }
    
        public static int upperOrLower(int[] nums, int target, boolean upper){
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        int mid;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(nums[mid] == target){
                res = mid;
                if(upper){
                    left = mid + 1;
                }else right = mid - 1;
            }
            else if(nums[mid] > target) right = mid -1;
            else left = mid + 1;
        }
        return res;
    }
    
    public static void main(String [] args) {
    int [] arr = {1,2,2,2,7,8,9};
    int [] fina = searchRange(arr, 2);
    
    
   System.out.println(Arrays.toString(fina));


    
}

    
}
