/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author nandini
 * just behaves like a stack. Whenever we encounter any file’s name,
 * we simply push it into the stack. when we come across ” . ” we do nothing. 
 * When we find “..” in our path, we simply pop the topmost element 
 * as we have to jump back to parent’s directory.
When we see multiple “////” we just ignore them as they are equivalent to one
* single “/”. After iterating through the whole string 
* the elements remaining in the stack is our simplified absolute path.
* We have to create another stack to reverse the elements stored 
* inside the original stack and then store the result inside a string.
 * 
 */
public class SimplifyPath {
    public static String simplifyPath(String path){
        Stack<String> st = new Stack<>();
        String [] p = path.split("/");
        for(String s : p){
            if(!st.isEmpty() && s.equals("..")){
                st.pop();
            } else if(!s.equals(".") && !s.equals("") && !s.equals("..")){
                st.push(s);
            }
        }
        List<String> list = new ArrayList(st);
        System.out.println("list is :" + list);
        return "/"+String.join("/",list);
    }
    public static void main(String[]args){
        String s = "/a/./b/../../c/";
        System.out.println(simplifyPath(s));
    }
    
}
