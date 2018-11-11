/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package september3rd2018;

import java.util.Arrays;

/**
 *
 House Robber I, the houses are arranged in a line,
 * while here in House Robber II, the houses are arranged in a circle.
We number all the n houses from 1 to n. The observation is that we can break the circle into two lines,
* depending whether we consider house 1.
1) We consider house 1. Then we cannot consider house n. 
* This is a problem instance in House Robber I considering n - 1 houses: house 1, ..., house n - 1.
2) We do not consider house 1. Then we can consider house n. 
* This is a problem instance in House Robber I considering n - 1 houses: house 2, ..., house n.
Taking the maximum of the two problem instances in House Robber I gives us the desired result in House Robber II.
 */
public class HouseRobberii {
    public static int robAlongALine(int [] nums){
        int [] max = new int[nums.length];
        max[0] = nums[0];
        System.out.println("max[0] :" +max[0]);
        max[1] = Math.max(nums[0], nums[1]);
        System.out.println("max[1] :" +max[1]);
        for(int i = 2; i < nums.length; i++){
            max[i] = Math.max(max[i - 1], max[i - 2] + nums[i]);
            System.out.println("max i :" +max[i]);
        }
        return max[nums.length - 1];
    }
    public static int rob(int [] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int maxWithFirst = robAlongALine(
                Arrays.copyOfRange(nums, 0, nums.length - 1));
        System.out.println("max with first :" +maxWithFirst);
        int maxWithOutFirst = robAlongALine(
                Arrays.copyOfRange(nums, 1, nums.length));
        System.out.println("max without first :" +maxWithOutFirst);
        
        return Math.max(maxWithFirst, maxWithOutFirst);
    }
     public static void main(String[]args){
        int [] num = {1,3,1,3,100};
        System.out.println(rob(num));
    }
}
