/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class MinimumIndexList {
        public static String[] findRestaurant(String[] list1, String[] list2) {
            int list1Length = list1.length;
            int list2Length = list2.length;
            int sum = 0;
            List <String> result = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            HashMap<String, Integer> has = new HashMap<String, Integer>();
            for(int index = 0; index < list1Length; index++) {
                has.put(list1[index], index);
            }
            
            for(int index = 0; index < list2Length; index++) {
                if(has.containsKey(list2[index])) {
                    sum = index + has.get(list2[index]);
                    System.out.println("sum is : "+ has.get(list2[index]));
                    if(sum < min) {
                        result = new ArrayList<>();
                        result.add(list2[index]);
                        min = sum;
                    } else if(sum == min) {
                    result.add(list2[index]);
                   
                    }
                }
            }
            //print result
            String [] resultOfcommon = new String[result.size()];
            for(int index = 0; index < resultOfcommon.length; index++) {
                resultOfcommon[index] = result.get(index);
            }
            return resultOfcommon;
        
        }
        public static void main(String[] args) {
            String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
            String [] list2 = {"KFC", "Shogun", "Burger King"};
            String [] arr = findRestaurant(list1, list2);
            System.out.println(Arrays.toString(arr));
        }

    
}
