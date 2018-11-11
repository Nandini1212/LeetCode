/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class subarrayMinandThenFindMAxinThatList {
    public static int subArrayMinMax(int [] nums, int k){
        List<Integer>list = new ArrayList<Integer>();
        int min = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
                System.out.println(map.put(nums[i], map.get(nums[i]) + 1));
            } else {
                map.put(nums[i], 1);
                System.out.println(map.put(nums[i], 1));
            }
            if(map.size() > 2){
                System.out.println(map.size());
                min = Math.min(min, Collections.min(map.Keys()));
                System.out.println(min);
            }
            list.add(min);
            //map.clear();
        }
        int max = Collections.max(list);
        return max;
    }
    public static void main(String[]args){
        int [] arr = {8,2,4};
        System.out.println(subArrayMinMax(arr, 2));
    }
}
