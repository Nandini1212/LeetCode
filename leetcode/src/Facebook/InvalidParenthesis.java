/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nandini
 */
public class InvalidParenthesis {
    
    //this is for only one
    public static String remove(String s, char[] p){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(p[0] == s.charAt(i)){
                count++;
            }
            if(p[1] == s.charAt(i)){
                count--;
            }
            if(count < 0){
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
                count = 0;
            }
        }
        return s;
    }
    public static String removeInvalidParentheses(String s) {
        String remove = remove(s, new char[] {'(', ')'});
        String temp = remove(new StringBuilder(remove).reverse().toString(), new char[] {')', '('});
        return new StringBuilder(temp).reverse().toString();
        
    }
    
    
    
    public static List<String> removeInvalidParenthesess(String s) {
    List<String> ans = new ArrayList<>();
    remove(s, ans, 0, 0, new char[]{'(', ')'});
    return ans;
}

public static void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {
    for (int stack = 0, i = last_i; i < s.length(); ++i) {
        if (s.charAt(i) == par[0]){
            stack++;
        }
        if (s.charAt(i) == par[1]){
            stack--;
        }
        if (stack >= 0){
            continue;
        }
        for (int j = last_j; j <= i; ++j)
            if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1])){
                remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
            }
                
        return;
    }
    String reversed = new StringBuilder(s).reverse().toString();
    System.out.println("revesed :" + reversed);
    if (par[0] == '(') // finished left to right
        remove(reversed, ans, 0, 0, new char[]{')', '('});
    else // finished right to left
        ans.add(reversed);
}
    public static void main(String[]args){
        String s = "()())()";
        System.out.println(removeInvalidParenthesess(s));
    }
}
