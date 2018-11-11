
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*We iterate through the input array exactly once, 
/keeping track of the running sum mod k of the elements in the process. 
If we find that a running sum value at index j has been previously seen before 
in some earlier index i in the array,
then we know that the sub-array (i,j] contains a desired sum.
Time : O(n)
space: O(k)

package LeetCodeFrequencyAsked;

/**
 *
 * @author nandini
 * The twist is simply that instead of inserting total_sum value for the subarrays [0,0], [0,1], [0,2],... you insert total_sum%k. 
 * SO, by checking in your map if you have already added the value (actual_total_sum%k) - target_sum you are asking,
 * "Is there a pair of indices [0,x] being equal to (actual_total_sum%k) - target_sum" 
 * if yes, that means that the subarray [x+1, actual_index] is equal to a multiple of target_sum. 
 * And for the last part of the problem, you must make sure the subarray has length > 2 
 * well that's quite easy you just have to check that actual_index-(x+1) >= 1 
 * which is the same as actual_index-x > 1 as written in the solution.


 */
public class ContinuosSubArraySum {
    public static boolean checkSubArraySum(int[]nums, int k){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            System.out.println("sum is: "+sum);
            if(k != 0){
                sum %= k;
                System.out.println("mod is : " + sum);
            }
            Integer prev = map.get(sum);
            System.out.println("map.get is - prev: " + map.get(sum) + " prev is :"+prev);
            if(prev != null){
                if(i - prev > 1){
                    System.out.println("i - prev is: " + prev);
                    return true;
                }
            } else {
                map.put(sum, i);
                System.out.println("map.get is : " + map.put(sum, i) + " i is :"+i);
            }
        }
        return false;
    }
    public static void main(String[]args){
        int [] nums = {0,0};
        System.out.println(checkSubArraySum(nums, 0));
    }
}
