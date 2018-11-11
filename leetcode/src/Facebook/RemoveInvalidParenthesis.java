/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nandini
 * 
 * O(2^n)
 */
public class RemoveInvalidParenthesis {
     public static List<String> removeInvalidParentheses(String s) {
         int removeLeft = 0;
         int removeRight = 0;
         for(int i = 0; i < s.length(); i++){
             if(s.charAt(i) == '('){
                 removeLeft++;
             } else if(s.charAt(i) == ')'){
                 if(removeLeft != 0){
                     removeLeft--;
                 } else {
                     removeRight++;
                 }
             }
         }

         Set<String> result = new HashSet<>();
         dfs(s, 0, result, new StringBuilder(), removeLeft, removeRight, 0);
         return new ArrayList<String>(result);
     }
    public static void dfs(String s, int startIndex, Set<String>set, StringBuilder sb, int removeLeft,
                            int removeRight, int open){
        if(removeLeft < 0 || removeRight < 0 || open < 0){
            return;
        }
        if(startIndex == s.length()){
            if(removeLeft == 0 && removeRight == 0 && open == 0){
                set.add(sb.toString());
            }
            return;
        }
        char c = s.charAt(startIndex);
        int len = sb.length();
        if(c == '('){
            dfs(s, startIndex + 1, set, sb, removeLeft - 1, removeRight, open); // not use 
            dfs(s, startIndex + 1, set, sb.append(c), removeLeft, removeRight, open + 1);//use (
            
        } else if(c == ')'){
            dfs(s, startIndex + 1, set, sb, removeLeft, removeRight - 1, open); // not use )
            dfs(s, startIndex + 1, set, sb.append(c), removeLeft, removeRight, open - 1); //use )
        } else {
            dfs(s, startIndex + 1, set, sb.append(c), removeLeft, removeRight, open);
            
        }
        sb.setLength(len); // backtracking
    }
    public static void main(String []args){
        String s = "()())()";
        System.out.println(removeInvalidParentheses(s));
    }
}
