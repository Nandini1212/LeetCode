/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September20th;

/**
 *
 * @author nandini
 */
public class SumOfSubArrayMins {
    public static int sumSubarrayMins(int[] A) {
      int minSum = A[0];
      int newSum = minSum;
      int startIndex = 0;
      int endIndex = 0;
      int k = 1;
      int size = A.length;
      while (k < size) {
        for (int i = k; i < size; i++) {
        newSum += A[i];
        System.out.println(newSum);
            if (newSum < minSum) {
            minSum = newSum;
            startIndex = k - 1;
            endIndex = i;
            }
        }

    newSum = A[k];
    k++;
  }
  minSum = 0;
  for (int i = startIndex; i <= endIndex; i++) {
    minSum += A[i];
  }
  return minSum;
    }
    public static void main(String[]args){
        int[]arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}
