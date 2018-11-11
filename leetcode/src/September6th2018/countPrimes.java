/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September6th2018;

/**
 *
 * @author nandini
 * Total time= n + c12 * (square root of n)2 +  c2n = O (n) 
 */
public class countPrimes {
    public static int countPrimes(int n){
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
         }

        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]){
                continue;
            }
            for (int j = i * i; j < n; j += i) {
            isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[]args){
        System.out.println(countPrimes(10));
    }
    
}
