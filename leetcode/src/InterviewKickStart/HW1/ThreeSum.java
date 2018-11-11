/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author nandini
 */
public class ThreeSum {
        static String[] findZeroSum(int[] arr) {
            //sort the elements in an array
            Arrays.sort(arr);
            List<Integer>triplet = new ArrayList<Integer>();
            List<Integer> result = new ArrayList<>();
            if(arr.length < 3) {
                String[] res = result.toArray(new String[0]);
                return res;
            }
            
            
            for(int index = 0; index < arr.length - 1; index++) {
                
                if(index > 0 && arr[index] == arr[index - 1]) {
                    continue;
                }
                int end = arr.length - 1;
                int start = index + 1;
                int target = arr[index];

                while(start < end) {
                    if(arr[start] == arr[start + 1]) {
                        start++;
                    }
                    if(arr[end] == arr[end - 1]) {
                        end--;
                    }
                    
                    int sum = arr[start] + arr[end];
                    if(target + sum == 0) {
                        triplet.add(arr[index]);
                        triplet.add(arr[start]);
                        triplet.add(arr[end]);
                        result.addAll(triplet);
                    
                        System.out.println(arr[index] + "  " + arr[start] + " " + arr[end]);
                    } else if(sum + target > sum) {
                        end--;
                    } else {
                        start++;
                    }
                    
                }
                
            }
           String [] all = new String[result.size()];
        int index = 0;
        for(index = 0; index < result.size(); index++) {
            //Integer listEle = result.get(index);
            all[index] = result.get(index).toString();
        }
        return all;
        
        }
        public static void main(String args[]){
            int[] nums = {-2, 2, 0 -2, 2};
     
        System.out.println(Arrays.toString(findZeroSum(nums)));
        }

    
}
