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
public class PerfectSquare {
    //O(sqrt n)
    public static boolean isPerfect(int num){
        int i = 1;
        while(num > 0){
            num -= i;
            i += 2;
        }
        return num == 0;
    }
    public static boolean isPerfects(int num){
        if(num <= 1){
            return true;
        }
        long start = 0;
        long end = num;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long product = mid * mid;
            if(product == num){
                return true;
            } else if(product < num){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
        }
        return false;
    }
    
    public static void main(String[]args){
        System.out.println(isPerfects(16));
    }
}
