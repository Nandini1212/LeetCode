
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class NutsAndBolts {
    public static String[] solve(int [] nuts, int [] bolts) {
        if(nuts == null || bolts == null) {
            return null;
        } 
        if(nuts.length != bolts.length){
            return null;
        }
        matchPairs(nuts, bolts, 0, bolts.length - 1);
        String str[] = new String [nuts.length ];
       for(int index = 0; index < nuts.length; index++) {
           str[index] = nuts[index] + " " + bolts[index];
       }
       return str;
        
        
    }
    public static void matchPairs(int nuts[], int [] bolts, int low, int high) {
        if(low < high) {
            int partition = partition(nuts, low, high, bolts[high - 1]);
            partition(bolts, low, high, nuts[high]);
            matchPairs(nuts, bolts, low, partition - 1);
            matchPairs(nuts, bolts, partition + 1, high);
        }
    }
    public static int partition(int [] arr, int low, int high, int pivotValue){
        int left = low;
        int right = high;
        int temp;
        
        while(left <= right) {
            while(arr[left] < pivotValue) {
                left++;
                //System.out.println("left is :" + left);
            }
            while(arr[right] > pivotValue) {
                right--;
                //System.out.println("right is :" + right);
            }
            if(left <= right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                //System.out.println("arr[right] is :" + arr[right]);
                left++;
                right--;
            }
        }
        //System.out.println("final left : " + left);
        return left;

    }
    public static void main(String[] args) {
        int [] nuts = {1,3,5,6,2};
        int [] bolts = {2,5,1,3,6};
        String []solve = solve(nuts, bolts);
        System.out.println(Arrays.toString(solve));
    }
}
