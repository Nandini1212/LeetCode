
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 * O(n log n) space : O(1)
 */
public class TwoSum {
    public static int[] twoSum(int [] nums, int k){
        int i = 0;
        int j = nums.length - 1;
        boolean found = false;
        ArrayList<Integer>list = new ArrayList<Integer>();
        Arrays.sort(nums);
        while(i <= j){
            int sum = nums[i] + nums[j];
            System.out.println(sum);
           if(sum < k) {
               i++;
           } else if(sum > k){
               j--;
           } else if(sum == k){
               list.add(nums[i]);
               list.add(nums[j]);
               i++;
               j--;
               found = true;
           }

        }
        if(found == false) {
            System.out.println("no found");
        }
        int [] result = new int[list.size()];
        int index = 0;
        while(index < list.size()) {
            result[index] = list.get(index);

            index++;
        }
        return result;

    }
    public static void main(String [] args) {
        int [] arr = {10,15,3,7};
        
        System.out.println(Arrays.toString(twoSum(arr, 17)));

}
}

/* unique pairs
public static int numberOfPairs(Integer[] array, int sum) {
    Set<Integer> set = new HashSet<>(Arrays.asList(array));

    // this set will keep track of the unique pairs.
    Set<String> uniquePairs = new HashSet<String>();

    for (int i : array) {
        int x = sum - i;
        if (set.contains(x)) {
            int[] y = new int[] { x, i };
            Arrays.sort(y);
            uniquePairs.add(Arrays.toString(y));
        }
    }

    //System.out.println(uniquePairs.size());
    return uniquePairs.size();
}
*/
