/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

/**
 *there are two choices if the value is positive, if the value is negative;
 * @author nandini
 */
public class ProductOfMaximuProductSubArray {
    public static int maxProduct(int [] nums){
        int currentMax = nums[0];
        int currentMin = nums[0];
        int ans = 0;
        int prevMax = nums[0];
        int prevMin = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(Math.max(prevMax * nums[i], prevMin * nums[i]), nums[i]);
            currentMin = Math.max(Math.max(prevMax * nums[i], prevMin * nums[i]), nums[i]);
            ans = Math.max(ans, currentMax);
            prevMax = currentMax;
            prevMin = currentMin;
            
        }
        return ans;
    }
    public static void main(String[]args){
        int [] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
