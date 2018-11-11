/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;

/**
The idea is to change 0 in the original array to -1. 
* Thus, if we find SUM[i, j] == 0 then we know there are even number
* of -1 and 1 between index i and j. 
* Also put the sum to index mapping to a HashMap to make search faster.
*/

public class ContiguousArray {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        map.put(0, -1);
        if(nums.length < 2){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                sum += 1;
            } else {
                sum += -1;
            }
            if(map.containsKey(sum)){
                if(i - map.get(sum) > max){
                    max = i - map.get(sum);
                }
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
    public static void main(String[]args){
        int[]num = {0,1,0};
        System.out.println(findMaxLength(num));
    }

}
