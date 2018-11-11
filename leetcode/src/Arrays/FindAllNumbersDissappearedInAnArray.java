/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class FindAllNumbersDissappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i])- 1;
            if(nums[val] > 0){
                nums[val] = -nums[val];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i + 1);
            }
        }
        return list;
    }
    public static void main(String[]args){
        int[]arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
