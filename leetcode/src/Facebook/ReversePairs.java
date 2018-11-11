/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.Arrays;

/**
 *
 * @author nandini
 * A more subtle approach is to use a special merge sort: 
 * for the entire array, we divide it into two parts a and b, 
 * first sorting a and b separately, and getting the inverse of each part of the internal conditions. 
 * Number. Then how do you calculate the number of eligible 
 * reverse pairs between a and b?
 * For each number num of a,
 * we verify in sequence from the head that each number is less than num / 2,
 * and if not, jump out, then the number of all verified numbers is 
 * smaller than num in b. The number of eligible. why? 1) 
 * Since the b part is ordered (already sorted when the subroutine is called), 
 * it can be verified sequentially, and if it does not meet the condition, 
 * it jumps out; 2) each part of the a part is smaller than the index in the original
 * array. The index of each element in the array in the original array.
 * After the result is obtained, the entire array is sorted 
 * by inplace_merge for subsequent use.
 * This ensures that the time complexity of the algorithm is O(nlogn) 
 * and the space complexity is O(1).
 * More than 80% of submissions were defeated in the test. 
 * It seems that the efficiency is also quite high.
 */
public class ReversePairs {
    public static int reversePairs(int[] nums) {
        
     return mergeSort(nums, 0, nums.length-1);
    }
    private static int mergeSort(int[] nums, int s, int e){
        if(s>=e) return 0; 
        int mid = s + (e-s)/2; 
        int cnt = mergeSort(nums, s, mid) + mergeSort(nums, mid+1, e); 
        for(int i = s, j = mid+1; i<=mid; i++){
            while(j<=e && nums[i]/2.0 > nums[j]) j++; 
            cnt += j-(mid+1); 
        }
        Arrays.sort(nums, s, e+1); 
        return cnt; 
    }
    public static void main(String [] args){
        int [] nums = {2,4,3,5,1};
        System.out.println(reversePairs(nums));
    }
}
