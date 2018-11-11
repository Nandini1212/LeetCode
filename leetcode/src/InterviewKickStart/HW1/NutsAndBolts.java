/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author nandini
 */
public class NutsAndBolts {
    private static int partition(int arr[], int low, int high, int pivot) {
        int i = low;
        int temp1, temp2;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // Move all elements smaller than pivot ahead in the array
                temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
            } else if (arr[j] == pivot) {
                // Move the matched element to the end
                // This is why we don't go to the last element in the iteration.
                temp1 = arr[j];
                arr[j] = arr[high];
                arr[high] = temp1;
                j--;
            }
        }
        // Swap the matched element from the last position to its correct place
        // i
        temp2 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp2;
        
        // Return the partition index of an array based on the pivot
        // element of other array.
        return i;
    }

    public static void matchPairs(int nuts[], int [] bolts, int low, int high) {
        if(low < high) {
            int partition = partition(nuts, low, high, bolts[new Random().nextInt(high - low + 1) + low]);
            partition(bolts, low, high, nuts[partition]);
            matchPairs(nuts, bolts, low, partition - 1);
            matchPairs(nuts, bolts, partition + 1, high);
        }
    }
    public static String[] solve(int [] nuts, int[] bolts) {
       matchPairs(nuts, bolts, 0, nuts.length - 1);
       String str[] = new String [nuts.length ];
       for(int index = 0; index < nuts.length; index++) {
           str[index] = nuts[index] + " " + bolts[index];
       }
       return str;
    }
    public static void main(String[] args) {
        int [] nuts = {1,3,5,6,2};
        int [] bolts = {2,5,1,3,6};
        String []solve = solve(nuts, bolts);
        System.out.println(Arrays.toString(solve));
    }

    
    
}
