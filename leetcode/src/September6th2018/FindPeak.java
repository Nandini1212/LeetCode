/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

/**
 *We can scan the array and find any element that is greater can its 
 * previous and next. 
 * The first and last element are handled separately.
 * @author nandini
 */
public class FindPeak {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i=1; i<=nums.length-2; i++){
            int prev = nums[i-1];
            int curr = nums[i];
            int next = nums[i+1];
 
            if(curr > prev && curr > next && curr > max){
                index = i;
                max = curr;
            }
        }
 
        if(nums[nums.length-1] > max){
            return nums.length-1;
        }
 
        return index;
    }
}
