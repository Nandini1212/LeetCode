/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 * taking two pointers start and end,
 * initially both pointers point to 0th index.
 * if end pointer + 1 < length of an array and value of next value - current value = 1
 * that means they both are in samerange. then increment endpointer by 1. 
 * if this is not the case 
 * check both end and start pointers point to the same value, add that value to the result list.
 * else add the start and end pointers value to the result set and update the start and end pointer
 * s
 * time complexity : O(n)
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int [] nums){
        List<String>list = new ArrayList<>();
        int start = 0;
        int end = 0;
        while(start < nums.length){
            if(end + 1 < nums.length && nums[end + 1] == nums[end] + 1){
                end++;
            } else {
                if(start == end){
                    list.add(Integer.toString(nums[start]));
                } else {
                    list.add(nums[start] +"->"+nums[end]);
                }
                start = end + 1;
                end = start;
            }
        }
        return list;
    }
    public static void main(String[]args){
        int [] nums = {0,1,2,4,5,7}; 
        System.out.println(summaryRanges(nums));
    }
}
