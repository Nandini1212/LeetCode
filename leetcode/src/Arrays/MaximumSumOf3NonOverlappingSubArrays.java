/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**

 * First use the sliding window, save the sum under the window.

Then similar to the comparison problem in the left and right range, 
* we have a left array and a right array to store left to right, left[i], 
* to reach the maximum value of i. Right to left, right[i], reach the maximum value of i window 
and then rescan these windows, (representing the third position), 
* find the place where sum is the biggest.

 */
public class MaximumSumOf3NonOverlappingSubArrays {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int sum = 0;
        int len = nums.length - k + 1;
        int [] sums = new int[nums.length - k + 1];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(i >= k){
                sum -= nums[i - k];
            }
            if(i >= k - 1){
                sums[i - k + 1] = sum;
            }
        }
        int[] left = new int[nums.length - k + 1];
        int best = 0;
        for(int i = 0; i < len; i++){
            if(sums[i] > sums[best]){
                best = i;
            }
            left[i] = best;
        }
        
        int[] right = new int[len];
        best = len - 1;
        for(int i = len - 1; i >= 0; i--){
            if(sums[i] >= sums[best]){
                best = i;
            }
            right[i] = best;
        }
        
        int [] res = {0, k, 2*k};
        for(int i = k; i < len; i++){
            int lef = left[i - k];
            int righ = right[i + k];
            if(sums[i] + sums[lef] + sums[righ] > sums[res[0]] + sums[res[1]] + sums[res[2]]){
                res[0] = lef;
                res[1] = i;
                res[2] = righ;
            }
        }
        return res;
    }
}
