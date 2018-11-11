/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author nandini
 * 
 * //O(n)
 */
public class Find132Pattern {

    public static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int min = Integer.MAX_VALUE;
        for (int num: nums) {
            if(num <= min){
                min = num;
            } else {
                while(!stack.isEmpty()){
                    if(stack.peek() >= num){
                        break;
                    }
                    stack.pop();
                    if(stack.pop() > num){
                        return true;
                    }
                }
                stack.push(num);
                stack.push(min);
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[] arr = {3,1,4,2};
        System.out.println(find132pattern(arr));
    }
}
