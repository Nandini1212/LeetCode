/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.HashMap;

/**
 *
 * @author nandini
 */

//O(n^n) expotential
public class FlipGameii {
    public static boolean canWin(String s){
        if(s.length() == 0 || s == null){
            return false;
        }
        char [] ch = s.toCharArray();
        return helper(ch);
    }
    public static boolean helper (char [] ch) {
        
        for(int i = 0; i < ch.length - 1; i++){
            if(ch[i] == '+' && ch[i + 1] == '+'){
                ch[i] = '-';
                ch[i + 1] = '-';
                
                boolean isWin = helper(ch);
                ch[i] = '+';
                ch[i + 1] = '+';
                if(!isWin){
                    return true;
                }
                
            }
            
        }
        return false;
    }
    public static boolean canWins(String s){
        if(s.length() == 0 || s == null){
            return false;
        }
        HashMap<String, Boolean>map = new HashMap<>();
        char [] ch = s.toCharArray();
        return canWinHelper(ch, map);
    }
    public static boolean canWinHelper(char [] ch, HashMap<String, Boolean>map){
        Boolean result = map.get(new String(ch));
        if(result != null){
            return result;
        }
        boolean canMove = false;
        int firstMoveIndex = -1;
        for(int i = 0; i < ch.length - 1; i++){
            if(ch[i] == '+' && ch[i + 1] == '+'){
                canMove = true;
                firstMoveIndex = i;
                break;
            }
        }
        if(!canMove){
            map.put(new String(ch), false);
            return false;
        }
        for(int i = firstMoveIndex; i < ch.length - 1; i++){
            if(ch[i] == '+' && ch[i + 1] == '+'){
                ch[i] = '-';
                ch[i + 1] = '-';
                
                boolean canWin = canWinHelper(ch, map);
                
                ch[i] = '+';
                ch[i + 1] = '+';
                if(!canWin){
                    map.put(new String(ch), true);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        String s = "++--";
        System.out.println(canWins(s));
    }
}
