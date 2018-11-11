/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

import java.util.HashMap;

/**
 * http://letstalkalgorithms.com/maximum-size-subarray-sum-equals-k-leetcode/
 * https://segmentfault.com/a/1190000005771068
 *
 *
 * We can use 2 points to mark the left and right boundaries of the sliding
 * window. When the sum is greater than the target, shift the left pointer; when
 * the sum is less than the target, shift the right pointer.
 */
public class MinimumSizeSubArraySum {

    /*
    public static int minSubArrayLen(int[] a, int s) {
        if (a == null || a.length == 0){
        return 0;
      }

      int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

      while (j < a.length) {
        sum += a[j];
        System.out.println("sum :" + sum);
        j++;

        while (sum >= s) {
          min = Math.min(min, j - i);
          sum -= a[i];
          i++;
        }
      }

      if(min == Integer.MAX_VALUE ){
          return 0;
     }
    return min;
    } */
    //O(nlogn)
    public static int minSubArrayLen(int s, int[] nums) {
		int[] sums = new int[nums.length + 1];
		for (int i = 1; i < sums.length; i++){
			sums[i] = sums[i - 1] + nums[i - 1];
                }
		int minLen = Integer.MAX_VALUE;
		for (int i = 0; i < sums.length; i++) {
			int end = binarySearch(i + 1, sums.length - 1, sums[i] + s, sums);
			if (end == sums.length)
				break;
			if (end - i < minLen)
				minLen = end - i;
		}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	}
 
	private static int binarySearch(int start, int end, int key, int[] nums) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] >= key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7,arr));
    }

}
