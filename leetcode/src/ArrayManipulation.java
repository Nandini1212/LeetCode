
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class ArrayManipulation {
    //O(m log m) m = queries.length 

    static long arrayManipulation(int n, int[][] queries) {
        int arr[] = new int[n];
        List<Integer> hSet = new ArrayList<Integer>();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0] - 1;
            int end = queries[i][1];
            arr[start] = arr[start] + queries[i][2];
            if (!hSet.contains(start)) {
                hSet.add(start);
            }
            if (end != arr.length) {
                arr[end] = arr[end] - queries[i][2];
                if (!hSet.contains(end)) {
                    hSet.add(end);
                }
            }

        }
        long max = 0;
        int temp = 0;
        long sum = 0;
        int a[] = new int[hSet.size()];
        for (int i = 0; i < hSet.size(); i++) {
            a[i] = hSet.get(i);
        }

        Arrays.sort(a); //size m = queries.length

        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            sum = sum + arr[temp];
            max = Math.max(sum, max);
        }
        return max;
    }

    static long arrayManipulations(int n, int[][] queries) {
        int arr[] = new int[n];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0] - 1;
            int end = queries[i][1];
            arr[start] = arr[start] + queries[i][2];
            if (end != arr.length) {
                arr[end] = arr[end] - queries[i][2];
            }
        }
        long max = 0;
        int temp = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
