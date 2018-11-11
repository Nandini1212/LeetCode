/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

import java.util.Arrays;

/**
 *
 * @author nandini
 * time complexity : O(n^2 + nlogn)
 * 
 * iterate through an array. 
 * take two pointers left and right. 
 * my left point will start from 0 and right pointer starts from index - 1.
 * if my left pointer lessthan right go through the loop and take the sum of
 * left and right pointer values should greater than current value then we will increment the count by right - left.
 * then decrement the rightpointer value.
 * if not increment the leftPointer by 1.
 * return count.
 */
public class TriangleNumber {
    public static int triangleNumber(int [] nums){
        if(nums.length == 0 || nums == null){
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int left = 0;
            int right = i - 1;
            System.out.println(right);
            while(left < right){
                if(nums[left] + nums[right] > nums[i]){
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        int [] nums = {2,2,3,4};
        System.out.println(triangleNumber(nums));
    }
}
