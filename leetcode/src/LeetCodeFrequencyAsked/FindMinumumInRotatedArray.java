/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

/**
 *
 * @author nandini
 * If we pick the middle element, we can compare the middle element with the leftmost (or rightmost) element. 
 * If the middle element is less than leftmost, the left half should be selected; 
 * if the middle element is greater than the leftmost (or rightmost), 
 * the right half should be selected. 
 * Using recursion or iteration, this problem can be solved in time log(n).
 */
public class FindMinumumInRotatedArray {
    public static int findMin(int[] nums){
        if(nums.length == 0 || nums == null){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int start = 0; 
        int end = nums.length - 1;
        while(start <= end){
            //check whether it is rotated array or not
            if(nums[start] <= nums[end]){
                System.out.println("start is : "+start +" "+"nums[start] is : "+nums[start]);
                return nums[start];
                
            }
            int  mid = start + end/2;
            System.out.println("mid is : "+ mid + " mid value is: "+nums[mid]);
            if(nums[mid] >= nums[start]){
                start = mid + 1;
            } else {
                end = mid;
                System.out.println("end is : "+end);
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    
}
