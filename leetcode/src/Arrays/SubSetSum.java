/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nandini
 * 
 * https://algorithms.tutorialhorizon.com/dynamic-programming-subset-sum-problem/
 */
public class SubSetSum {
    public static ArrayList<String> countSets(int [] A, int target) {
    ArrayList<String> subsets = new ArrayList<>();
    helper(A, target, 0, 0, subsets, "");
    // Printing the contents of subsets is straightforward    
    return subsets;
}

private static void helper(int[] A, int target, int sumSoFar, int i, ArrayList<String> subsets, String curr) {
    if(i == A.length) {
        if(sumSoFar == target) {
            subsets.add(curr);
        }
        return;
    }
    helper(A, target, sumSoFar, i+1, subsets, curr);
    helper(A, target, sumSoFar + A[i], i+1, subsets, curr + A[i]);
}
public static ArrayList<String> countSet(int [] A, int target) {
    ArrayList<String> subsets = new ArrayList<>();
    int []sol = new int[A.length];
    find(A, 0, 0, target, sol);
    // Printing the contents of subsets is straightforward    
    return subsets;
}


    public static void find(int[] A, int currSum, int index, int sum,
          int[] solution) {
        if (currSum == sum) {
          for (int i = 0; i < solution.length; i++) {
            if (solution[i] == 1) {
              System.out.print("  " + A[i]);
            }
          }

        } else if (index == A.length) {
          return;
        } else {
          solution[index] = 1;// select the element
          currSum += A[index];
          find(A, currSum, index + 1, sum, solution);
          currSum -= A[index];	
          solution[index] = 0;// do not select the element
          find(A, currSum, index + 1, sum, solution);
        }
        return;
      }
    
    public static void main(String[]args){
        int [] arr = {2,4,6,10};
        System.out.println(countSets(arr, 16));
        System.out.println(countSet(arr, 16));
    }
}
