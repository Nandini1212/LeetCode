/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class twoSum {

   public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            for (int inner = 1; inner < nums.length; inner++) {
                if(target < nums[i] && target < nums[inner]) {
                   sum = nums[i] + nums[inner];
                   if(sum == target) {
                       return sum;
                   }
                
                }
                
            }
            
        }
        
    }
   
   public int[] twoSums(int[] numbers, int target) {
    int[] result = new int[2];
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i + 1;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i + 1);
    }
    return result;
}
   
   public int[] twoSu(int[] nums, int target){
	int[] result = {0,0}; //initialized ther result
	HashMap<Integer, Integer> map = new HashMap<>();
	/*
	 * for every entry in the array, store the (target-num) into the map with the index of the num
	 * When the (target- num)appears in the array, we can return the values at that moment itself
	 */
	for(int i=0; i<nums.length; i++){
		if(map.containsKey(nums[i])){
			result[0] = map.get(nums[i]);
			result[1] = map.get(i);
			return result;
		}else{
			map.put(target-nums[i], i);
		}
	}
	return result;
}
   
   
   public int[] twoSumss(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++)
        {
           if(map.containsKey(target - nums[i])) {
               return new int[] {map.get(target - nums[i]), i};
           }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
