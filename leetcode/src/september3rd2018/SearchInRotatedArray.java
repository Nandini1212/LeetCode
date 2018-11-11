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
public class SearchInRotatedArray {
    /*iterative 
    public static int search(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            } 
            if(nums[mid] >= nums[start]){
                if(nums[start] <= target && target < nums[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(nums[mid] < target && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }*/
    //recursive
    public static int search(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        return binarySearch(nums, start, end, target);
    }
    public static int binarySearch(int [] nums, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[start] <= nums[mid]){
            if(nums[start] <= target && nums[mid] >target){
                return binarySearch(nums, start, mid - 1, target);
            } else {
                return binarySearch(nums, mid + 1, end, target);
            }
        } else {
            if(nums[mid] < target && nums[end] >= target){
                return binarySearch(nums, mid + 1, end, target);
            } else {
                return binarySearch(nums, start, mid - 1, target);
            }
        }


    }
    
    public static void main(String[]args){
        int [] nums = {4,5,6,7,0,1,2};
        int target = 7;
        System.out.println(search(nums, target));
    }
}


 