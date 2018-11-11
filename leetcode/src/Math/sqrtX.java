/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author nandini
 */
public class sqrtX {
    //O(logn)
    public static int mySqrt(int num){
        if(num <= 1){
            return num;
        }
        int low = 1;
        int high = num;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid > num / mid){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
    public static int mySqrts(int num){
        long x = num;
        while(x * x > num){
            x = (x + num / x) / 2;
            System.out.println(x);
        }
        return (int)x;
    }
    public static void main(String[]args){
        System.out.println(mySqrts(16));
    }
}
