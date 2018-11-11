/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionHw2Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * for every iteration if we take one element as root
 * for example we have 3
 * first 1 is a root element then remaining are 3 - 1 (n - 1) remaining two elements
 * then first 1 is a root element then remaining are 2 - 1
 * then first 1 is a root element then remaining are 1 - 1
 */
public class HowManyBsts {
    public static long how_many_BSTs(int n) {
        if(n <= 1){
            return 1;
        } else {
        int count  = 0;
        long left , right;
        for(int index = 1; index <= n; index++){
            left = how_many_BSTs(index - 1); //less than n
            right = how_many_BSTs(n - index);// greater than n
            count += left * right;
        }
        
        return (count);
        }
    }

    public static void main(String [] args) {
        int n = 3;
        System.out.println(how_many_BSTs(n));
    }

    
}
