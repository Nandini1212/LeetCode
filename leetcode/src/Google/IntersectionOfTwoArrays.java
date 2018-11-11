/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author nandini
 */
public class IntersectionOfTwoArrays {

         public static int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], map.get(nums1[i])  + 1);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (map.containsKey(nums2[j]) && map.get(nums2[j]) > 0) {
                map.put(nums2[j], map.get(nums2[j]) - 1);
                if (!resultMap.containsKey(nums2[j])) {
                    resultMap.put(nums2[j], 1);
                } else {
                    resultMap.put(nums2[j], resultMap.get(nums2[j]) + 1);
                }
            }
        }

        int sum = 0;
        for (Integer e : resultMap.keySet()) {
            int count = resultMap.get(e);
            sum += count;
            for (int i = 0; i < count; i++) {
                list.add(e);
            }
        }
        int[] result = new int[sum];
        for (int i = 0; i < sum; i++) {
            result[i] = (int) list.get(i);
        }
        return result;
        
    }
  /*when we handle duplicates
        HashSet<Integer> map = new HashSet<Integer>();
        for(int index = 0; index < nums1.length; index++){
            map.add(nums1[index]);
        }
        HashSet<Integer> newMap = new HashSet<Integer>();

        for(int index = 0; index < nums2.length; index++){
            if(map.contains(nums2[index])){
                newMap.add(nums2[index]);
            }
        }
         int [] result = new int [newMap.size()];
         int index = 0;
         for(int m: newMap){
             result[index] = m;
             index++;
         }
         return result;*/
  
  
  
    
    public static void main(String[] args){
        int nums1[] = {1,2,2,1};
        int [] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    
}
