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
 * https://soulmachine.gitbooks.io/algorithm-essentials/java/linear-list/array/next-permutation.html
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        nextPermutations(nums,0,nums.length);
    }
     private static boolean nextPermutations(int[] nums, int begin, int end) {
    int p = end - 1;
        while (p > 0 && nums[p - 1] >= nums[p]){
            --p;
        }

        // If not found, which means current sequence is already the largest
        // permutation, then rearrange to the first permutation and return false
        if(p == -1) {
            reverse(nums, begin, end);
            return false;
        }

        // From right to left, find the first digit which is greater
        // than the partition number, call it changeNumber
        int c = end - 1;
        while (c > 0 && nums[c] <= nums[p]) {
            --c;
        }

        // Swap the partitionNumber and changeNumber
        swap(nums, p, c);
        // Reverse all the digits on the right of partitionNumber
        reverse(nums, p+1, end);
        System.out.println(Arrays.toString(nums));
        return true;
    }
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    private static void reverse(int[] nums, int begin, int end) {
        end--;
        while (begin < end) {
            swap(nums, begin++, end--);
        }
    }
    public static void main(String[]args){
        int [] nums = {1,2,3};
        nextPermutation(nums);
    }
}
