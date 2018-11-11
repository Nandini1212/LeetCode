/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.HashMap;

/**
 *
 * @author nandini
 * Complexity:
O(N) time, O(1) space
 */
public class TotalFruit {
    public static int totalFruit(int[] tree) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        int res = 0, i = 0;
        for (int j = 0; j < tree.length; ++j) {
            if(count.containsKey(tree[j])){
                count.put(tree[j], count.get(tree[j]) + 1);
            } else {
            count.put(tree[j], 1);
            }
            
            while (count.size() > 2) {
                count.put(tree[i], count.get(tree[i]) - 1);
                if (count.get(tree[i]) == 0){
                    count.remove(tree[i]);                
                }
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
    public static void main(String[]args){
        int[]arr = {4,1,1,1,3,1,7,5};
        System.out.println(totalFruit(arr));
    }
}
