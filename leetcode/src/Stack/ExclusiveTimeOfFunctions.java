/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author nandini
 */
public class ExclusiveTimeOfFunctions {

    //time limit exceed
    public static int[] exclusiveTime(int n, List< String> logs) {
        Stack< Integer> stack = new Stack<>();
        int[] res = new int[n];
        String[] s = logs.get(0).split(":");
        stack.push(Integer.parseInt(s[0]));
        int i = 1;
        int time = Integer.parseInt(s[2]);
        while (i < logs.size()) {
            s = logs.get(i).split(":");
            while (time < Integer.parseInt(s[2])) {
                res[stack.peek()]++;
                time++;
            }
            if (s[1].equals("start")) {
                stack.push(Integer.parseInt(s[0]));
            } else {
                res[stack.peek()]++;
                time++;
                stack.pop();
            }
            i++;
        }
        return res;
    }

    public int[] exclusiveTimes(int n, List<String> logs) {
        // separate time to several intervals, add interval to their function
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        int pre = 0;
        // pre means the start of the interval
        for (String log : logs) {
            String[] arr = log.split(":");
            if (arr[1].equals("start")) {
                if (!st.isEmpty()) {
                    result[st.peek()] += Integer.parseInt(arr[2]) - pre;
                }
                // arr[2] is the start of next interval, doesn't belong to current interval.
                st.push(Integer.parseInt(arr[0]));
                pre = Integer.parseInt(arr[2]);
            } else {
                result[st.pop()] += Integer.parseInt(arr[2]) - pre + 1;
                // arr[2] is end of current interval, belong to current interval. That's why we have +1 here
                pre = Integer.parseInt(arr[2]) + 1;
                // pre means the start of next interval, so we need to +1
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List< String> logs = new ArrayList<String>();
        logs.add("0:start:0");
        logs.add("1:start:2");
        logs.add("1:end:5");
        logs.add("0:end:6");
        int n = 2;
        System.out.println(Arrays.toString(exclusiveTime(n, logs)));
    }
}
