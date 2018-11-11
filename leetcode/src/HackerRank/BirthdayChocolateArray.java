/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class BirthdayChocolateArray {
    
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int start = 0;
        int sum = 0;
        for(int i = 0; i < s.size() - m + 1; i++){
           
            if(s.get(i) + s.get(i + 1) == d){
                count++;
            } else {
                start++;
            }
        }
        
        
        return count;
    }
    public static void main(String[]args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(birthday(list, 3, 2));
    }
}
