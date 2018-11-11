/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.Arrays;

/**
 *
 * @author nandini
 */
public class isIsomorphic {
    public static boolean isIsomorphic(String sString, String tString) {
        char[] s = sString.toCharArray();
        char[] t = tString.toCharArray();
        
        if(s.length != t.length){
            return false;
        }
        char[]storeS = new char[256];
        System.out.println("s :" + Arrays.toString(storeS));
        char[]storeT = new char[256];
        System.out.println("t :" + Arrays.toString(storeT));
        for(int i = 0; i < s.length; i++){
            if(storeS[s[i]] == 0 && storeT[t[i]] == 0){
                storeS[s[i]] = t[i];
                storeT[t[i]] = s[i];
            } else {
                if(storeS[s[i]] != t[i] || storeT[t[i]] != s[i]){
                    return false;
                }
            }
        }
    return true;
    }
    public static void main(String[]args){
        System.out.println(isIsomorphic("egg", "add"));
    }
}
