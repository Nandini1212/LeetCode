/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;

/*We maintains a running sum and a HashMap to store the sum and indices.

If we find sum % k is in the HashMap and the index of it is at least two hops
away from the current index, we find such subarray.

The time complexity is O(n) and the space complexity is O(k),

 */
public class CheckSubArraySum {
    
    public static boolean checkSubarraySums(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(k != 0){
                sum %= k;
            }
            if(map.containsKey(sum)){
                if(i - map.get(sum) > 1){
                    return true;
                }
            } else {
                map.put(sum, i);
            }
            
        }
        return false;
    }
    
    public static void main(String[]args){
        int[]num = {23, 2, 4, 6, 7};
        System.out.println(checkSubarraySums(num, 6));
    }
}
