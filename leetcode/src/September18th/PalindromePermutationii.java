/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September18th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nandini
 */
public class PalindromePermutationii {
    public static List<String>generatePalindromes(String s){
        int odd = 0;
        String mid = "";
        List<String> res = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            if(map.get(c) % 2 != 0){
                odd += 1;
            } else {
                odd += -1;
            }
        }
            
        if(odd > 1){
            return res;
        }
        for(Map.Entry<Character, Integer> m : map.entrySet()){
            char key = m.getKey();
            int val = m.getValue();
            if(val % 2 != 0){
                mid += key;
            }
            for(int i = 0; i < val / 2; i++){
               list.add(key);
            }
        }
        helper(list, mid, new boolean[list.size()], new StringBuilder(), res);
        return res;
    }

    
    public static void helper(List<Character> list, String s, boolean[] visited, StringBuilder sb, List<String> res){
        if(list.size() == sb.length()){
            res.add(sb.toString() + s + sb.reverse().toString());
            sb.reverse();
            return;
        }
        for(int i = 0; i < list.size(); i++){
            if(i > 0 && list.get(i) == list.get(i - 1) && !visited[i - 1]){
                continue;
            }
            visited[i] = true;
            sb.append(list.get(i));
            helper(list, s, visited, sb, res);
            sb.deleteCharAt(sb.length() - 1);
            visited[i] = false;
        }
    }
    public static void main(String[]args){
        String s = "aabb";
        System.out.println(generatePalindromes(s));
    }
}
