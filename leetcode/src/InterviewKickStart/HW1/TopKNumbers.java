/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

import static java.lang.reflect.Array.get;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author nandini
 */
public class TopKNumbers {
    /*1) Sort the elements in descending order in O(nLogn)
2) Print the first k numbers of the sorted array O(k).
Time complexity: O(nlogn)
*/
    public static int[] topK(int[] arr, int k) {
        Arrays.sort(arr);
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int index = 0; index < arr.length; index++){
            //int size = set.size();            
            set.add(arr[index]);               
               if(set.size() > k){
                    System.out.println(set.size());
                    set.pollFirst();
                }
        
        }
        
        int ans [] = new int[set.size()];
        int ptr = 0;
        for(int x : set) {
            ans[ptr++] = x;
        }
        return ans;
    }
    public static void main(String args[]) {
        int [] arr= {5,6,1,4,1,8,2,4,1,7,9,3,2,1};
        int [] res = topK(arr,2);
        System.out.println(Arrays.toString(res));
        
        
    }
    
    
}
