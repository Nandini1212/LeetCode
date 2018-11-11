/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author nandini
 */
public class IsHappy {
    public static boolean isHappy(int n){
        while(n != 1 && n != 4){
            int sum = 0;
            while(n > 0){
                sum += Math.pow((n % 10), 2);
                n /= 10;
            }
            n = sum;
        }
        if(n == 1){
            return true;
        }
        return false;
    }
    public static void main(String[]args){
        System.out.println(isHappy(19));
    }
}
