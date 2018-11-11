/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

/**
 *
 * @author nandini
 * O(n) Time O(1) Space
 */
public class ShortesUnsortedContinuousSubArray {
    public static int findUnsortedSubarray(int[] A) {
        int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
    for (int i=1;i<n;i++) {
      max = Math.max(max, A[i]);
      min = Math.min(min, A[n-1-i]);

      if (A[i] < max) end = i;
      if (A[n-1-i] > min) beg = n-1-i; 
    }
    return end - beg + 1;
    }
    public static void main(String[]args){
        int [] arr = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(arr));
    }
}
