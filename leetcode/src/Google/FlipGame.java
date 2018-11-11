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
public class FlipGame {
    
    //O(2^n)
    public static List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<String>();
        char [] ch = s.toCharArray();
        for(int i = 1; i < ch.length; i++){
            if(ch[i] == '+' && ch[i - 1] == '+'){
                ch[i] = '-';
                ch[i - 1] = '-';
                result.add(new String(ch));
                ch[i] = '+';
                ch[i - 1] = '+';
            }
        }
        return result;
    }
    public static void main(String[]args){
        String s = "++--";
        System.out.println(generatePossibleNextMoves(s));
    }
}
