/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

import java.util.PriorityQueue;

/**
 *
 * @author nandini
 * time complexity : O(n logk)
 * Space complexity : O(k)
 */
public class KthLargestElement {
     public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        System.out.println(pq);
        for(int num : nums){
            pq.offer(num);
            System.out.println(pq.offer(num) + " " +num);
            if(pq.size() > k){
                System.out.println("size :" + pq.size() + " " + k);
                pq.poll();
                System.out.println("poll :" +pq.poll());
            }
        }
        return pq.peek();
     }
     public static void main(String[]args){
         int [] nums = {3,2,1,5,6};
         System.out.println(findKthLargest(nums, 2));
     }
    
}
