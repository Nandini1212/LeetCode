/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author nandini
 */
public class SingleNumber {
    
    /* xor method
    public static int singleNumber(int [] nums) {
    int result = nums[0];
    for(int i = 0; i < nums.length; i++) {
    result = result ^ nums[i];
    }
    return result;
    }
    */
    public static int singleNumber(int [] nums) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for(int index = 0; index < nums.length; index++) {
            if(set.containsKey(nums[index])) {
                set.remove(nums[index]);
            } else {
                set.put(nums[index], index);
            }
        }
        for(HashMap.Entry<Integer, Integer> m : set.entrySet()) {
            return m.getKey();
        }
        return 0;
    }
    public static void main(String [] args) {
        int [] arr = {4,1,2,1,2,5,4};
        System.out.println(singleNumber(arr));
    }
    
}
