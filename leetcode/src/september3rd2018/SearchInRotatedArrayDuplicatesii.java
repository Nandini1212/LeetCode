/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

/**
 *
 * @author nandini
 */
public class SearchInRotatedArrayDuplicatesii {
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] > nums[start]){
                if(nums[start] <= target && nums[mid] > target){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if(nums[mid] < nums[start]){
                if(nums[mid] < target && nums[end] >= target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else {
                start++;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int [] nums = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(search(nums, target));
    }
}
