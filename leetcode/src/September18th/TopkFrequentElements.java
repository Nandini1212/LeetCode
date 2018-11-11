/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/*Time Complexity: O(N + k * logN) 
Space Complexity: O(N)
 */
public class TopkFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0 + 1));
        }
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(list, (o1, o2) -> map.get(o2) - map.get(o1));
        for(int i = 0; i < k; i++){
            result.add(list.get(i));
        }
        return result;
    }
    public List<Integer> topKFrequents(int[] nums, int k) {
       if (nums == null || k <= 0) return null;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        List<Integer> res = new LinkedList<>();
        while (pq.size() != 0) {
            res.add(0, pq.poll().getKey());
        }
        return res;

    }
}
