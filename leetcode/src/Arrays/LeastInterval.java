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
 * 
 * O(n) 
 * Space : O(1)
 */
public class LeastInterval {
    public static int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();//char array is better, I just want to make this answer easier to read.
        /*
        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }*/
        
        for(int i = 0; i < tasks.length; i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i], map.get(tasks[i]) + 1);
            } else {
                map.put(tasks[i], 1);
            }
        }
        
        int max = 0;//Most frequent task.
        for (int val : map.values()) {
            max = Math.max(val, max);
            System.out.println("val :" + val +", " + "max :" + max);
        }
        
        int p = 0;//how many tasks that has the same frequency as the top frequent task.(include itself)
        for (int val : map.values()) {
            if (val == max) {
                p++;
                System.out.println("p :" + p);
            }
        }
            
        int total = (max - 1) * (n + 1) + p;//Totally intervals to fill out all empty space.
        
        if (total < tasks.length) {
            return tasks.length; //After I fill out all empty space, there are still some tasks that I have not use them.
        } else {
            return total; //Task is not enough, I used some idles.
        }
    }
    public static void main(String[]args){
        char [] arr = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(arr, 2));
    }
}
