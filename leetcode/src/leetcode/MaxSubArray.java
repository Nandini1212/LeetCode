/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int index = 1; index < nums.length; index++) {
            sum = Math.max(sum+ nums[index], nums[index]);
            max = Math.max(max,sum);
        }
        return max;
    }
    public static int hashMapSubArray(int [] nums){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            map.put(nums[i], 1);
        }
        for(HashMap.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                return m.getKey();
            }
        }
        return -1;
    }
    static int minUniqueSum(int[] arr) {
    HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();

        int sum=0;
        Arrays.sort(arr);
        hp.put(arr[0], 1);
        for(int i=1; i<arr.length; i++){
            if(hp.containsKey(arr[i])){

                hp.put(arr[i] + 1, hp.get(arr[i]) + 1);             
            }
            else{
                hp.put(arr[i], 1);
            }
        }

        for(HashMap.Entry m:hp.entrySet()){
            sum = sum + (int)m.getKey();
        }
        return sum;
}
    public static void main(String [] args) {
        int[] arr = {3,2,1,2,7};
        System.out.println("max sum:" +maxSubArray(arr));
                System.out.println("min unique1 :"+ hashMapSubArray(arr));

        System.out.println("min unique :"+ minUniqueSum(arr));
    }
    
}
