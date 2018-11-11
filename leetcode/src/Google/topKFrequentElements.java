/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class topKFrequentElements {
    public static List<Integer> topkFrequent(int[] nums, int k){
        List<Integer> finalList = new ArrayList<Integer>();
        int count = 0;
        for(int index = 0; index < nums.length; index++){
            finalList.add(nums[index]);
            count++;
        }
        for(int index = 0; index < finalList.size(); index++){
            System.out.println(finalList.get(index));
        }
        
        return finalList;
    }
    public static void main(String[] args){
        int [] num = {1,1,1,2,3,3,4,2};
        topkFrequent(num, 1);
    }
    
}
