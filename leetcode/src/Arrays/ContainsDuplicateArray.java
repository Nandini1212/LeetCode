/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nandini
 */
public class ContainsDuplicateArray {
    /* need to make some corrections outofbound exception
    public static boolean containsDuplicate(int[] nums) {
        int [] arr = new int[nums.length];
        for(int index = 0; index < nums.length; index++) {
        if(nums[Math.abs(nums[index])] > 0){
            nums[Math.abs(nums[index])] = -nums[Math.abs(nums[index])];
        } else {
            arr[index] = Math.abs(nums[index]);
        }
        }
        
        int value = 0;
for (int i = 0; i < arr.length; i++)
{
    value = arr[i]; // Build out the number as a string
    System.out.println(value);
}
        if(value == 1){
            return true;
        }
        return false;
    }*/
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public boolean containsDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) return false;
        
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>(); // Map each number to frequency  
        
        for(int i = 0; i < nums.length; i++){
            if(!hashmap.containsKey(nums[i])){
                hashmap.put(nums[i], 1);
            }
            else{
                hashmap.put(nums[i], (hashmap.get(nums[i])) + 1);
            }
        }
        
        Set<Integer> numbers = hashmap.keySet(); // Order all keys from the map into a set
        for(int num: numbers){
            if(hashmap.get(num) >= 2) return true;
        }
            
        return false;
        
    }
    public static void main(String[]args){
        int [] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
