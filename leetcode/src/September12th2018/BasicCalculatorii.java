/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September12th2018;

import java.util.Stack;

/**
 *
 * @author nandini
 */
public class BasicCalculatorii {
    public static int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        Stack<Integer> st = new Stack();
        char sign = '+';
        int val = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                val = val*10 + (c -'0');
                System.out.println(val);
            }
            if((!Character.isDigit(c) && c != ' ') || i == s.length() - 1){
                if(sign == '+'){
                    st.push(val);
                    
                }
                if(sign == '-'){
                    st.push(-val);
                }
                if(sign == '*'){
                    st.push(st.pop()*val);
                    
                }
                if(sign == '/'){
                    st.push(st.pop()/val);
                }
                sign = c;
                val = 0;
            }
        }
        
        int res = 0;
        for(Integer i: st){
            res += i;
        }
        return res;
    }
    public static void main(String[]args){
        String s = "3+2*2";
        System.out.println(calculate(s));
    }
}
