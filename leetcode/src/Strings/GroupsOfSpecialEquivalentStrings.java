/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author nandini
 * Time complexity: O(n)

Space complexity: O(n)
 */
public class GroupsOfSpecialEquivalentStrings {
    public static int numSpecialEquivGroups(String[] A){
        HashSet<String>set = new HashSet<String>();
        for(String str : A){
            int[]odd = new int[26];
            int[]even = new int[26];
            for(int j = 0; j < str.length(); j++){
                if(j % 2 == 1){
                    odd[str.charAt(j) - 'a']++;
                } else {
                    even[str.charAt(j) - 'a']++;
                }
            }
            String result = Arrays.toString(odd) + Arrays.toString(even);
            set.add(result);
        }
        return set.size();
        
    }
    public static void main(String[]args){
        String [] a = {"a","b","c","a","c","c"};
        String [] b = {"aa","bb","ab","ba"};
        String [] c = {"abc","acb","bac","bca","cab","cba"};
        System.out.println(numSpecialEquivGroups(a));
        System.out.println(numSpecialEquivGroups(b));
        System.out.println(numSpecialEquivGroups(c));
    }
}
