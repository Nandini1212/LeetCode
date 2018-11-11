/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author nandini time : O(logn)
 * space : O(1)
 */
public class PowerOfx {

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
        }
        double res = 1.0;
        while (n != 0) {
            if (Math.abs(n % 2) == 1) {
                res *= x;
            }
            x *= x;
            n /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 2));
    }
}
