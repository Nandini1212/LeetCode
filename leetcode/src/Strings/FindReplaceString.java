/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class FindReplaceString {
   
    
    public static String findReplaceStrings(String S, int[] indexes, String[] sources, String[] targets) {
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        if(indexes == null || indexes.length == 0){
            return S;
        }
        for(int i = 0; i < indexes.length; i++){
            map.put(indexes[i], i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        for(int i  = S.length() - 1; i >= 0; i--){
            if(map.containsKey(i)){
                int index = map.get(i);
                if(S.substring(i).startsWith(sources[index])){
                    sb.replace(i, i + sources[index].length(), targets[index]);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[]args){
        String s = "abcd";
        int[]index = {0,2};
        String [] sources = {"a", "cd"};
        String[]targets = {"eeee", "ffff"};
        System.out.println(findReplaceStrings(s, index, sources, targets));
    }
}
