/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.TreeSet;

/**
 *
 * @author nandini
 */
public class ContainsDuplicatesiii {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k < 1 || t < 0){
            return false;
        }
        TreeSet<Long> tree = new TreeSet<Long>();
        for(int i = 0; i < nums.length; i++){
            Long floor = tree.floor((long)nums[i] + t);
            Long ceiling = tree.ceiling((long)nums[i] -t);
            if(floor != null && floor >= nums[i] || (ceiling != null &&
                    ceiling <= nums[i])){
                return true;
            }
            tree.add((long)nums[i]);
            if(i >= k){
                tree.remove((long) nums[i - k]);
            }
        }
        return false;
    }
   public static void main(String[]args){
        int [] arr = {1,2,3,1};
        System.out.println(containsNearbyAlmostDuplicate(arr, 3, 0));
    }
}
