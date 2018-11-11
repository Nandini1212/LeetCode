/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class FizzBuzz {
    public static List<String>fizzBuzz(int n) {
        List<String>arr = new ArrayList<String>();        
        if (n == 0) {
            return null;
        }
        int index = 1;
        while(index <= n) {
            if(index % 3 == 0 || index % 5 == 0) {
                if(index % 3 == 0 && index % 5 == 0) {
                arr.add("FizzBuzz");
                }else if(index % 3 == 0) {
                arr.add("Fizz");
                } else if(index % 5 == 0) {
                arr.add("Buzz");
                } 
            }
            else {
                arr.add("" + index);
            }
            index++;
        }
        return arr;
    }
    public static void main(String [] args){
        int n = 6;
        List<String> arr = fizzBuzz(n);
        System.out.println(arr);
    }
    
}
