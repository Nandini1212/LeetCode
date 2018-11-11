/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class GetPermutation {

    public static String getPermutation(int n, int k) {
        int[] fact = new int[n + 1];
        int sum = 1;
        List<Integer> num = new ArrayList<Integer>();
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            sum = i * sum;
            fact[i] = sum;
            num.add(i);
        }

        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int index = k / fact[n - i];
            sb.append(String.valueOf(num.get(index)));
            num.remove(index);
            k -= index * fact[n - i];
        }
        return sb.toString();
    }
    public static void main(String[]args){
        System.out.println(getPermutation(4, 9));
    }
}
