/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WindowProblem;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author nandini
 * http://www.learn4master.com/interview-questions/leetcode/leetcode-sliding-window-maximum
 */
public class SlidingWindowMaximum {
    
    //priority queue : O(nlogk), O(k)
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int[] res = new int[nums.length + 1 - k];
        for(int i = 0; i < nums.length; i++){

            if(i >= k){
                pq.remove(nums[i - k]);
            }//slow

            pq.offer(nums[i]);

            if(i + 1 >= k){
                res[i + 1 - k] = pq.peek();
            }
        }
        return res;
    }
    
    //O(n)
    public int[] maxSlidingWindows(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        LinkedList<Integer> deque = new LinkedList<Integer>();
        int[] res = new int[nums.length + 1 - k];
        for(int i = 0; i < nums.length; i++){
            if(!deque.isEmpty() && deque.peekFirst() == i - k){
                deque.poll();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.removeLast();
            }

            deque.offerLast(i);

            if((i + 1) >= k){
                res[i + 1 - k] = nums[deque.peek()];
            }
        }
        return res;
    }
    //O(nlogk)
    public int[] maxSlidingWindowss(int[] nums, int k) {
    int len = nums.length;
    int[] result = new int[len - k + 1];
    if(nums.length == 0) return new int[0];
    Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>(){
        @Override
        public int compare(Integer i1, Integer i2){
            return Integer.compare(i2, i1);
        }
    });
    
    for(int i = 0; i < k; i ++){
        queue.add(nums[i]);
    }
    result[0] = queue.peek();
    for(int i = k; i < len; i ++){
        queue.remove(nums[i - k]);
        queue.add(nums[i]);
        result[i - k + 1] = queue.peek();
    }
   
    return result;
}
}
