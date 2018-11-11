/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class ParttitionLabels {

    public static List<Integer> partitionLabels(String S) {
        // character's last index
        HashMap<Character, Integer> hmp = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            hmp.put(S.charAt(i), i);
            //System.out.println(hmp.put(S.charAt(i), i));
        }

        //second pass to make divisions
        List<Integer> lst = new ArrayList<>();
        int lastInd = 0;
        int firstInd = 0;
        for (int i = 0; i < S.length(); i++) {
            System.out.println("hmp : " + hmp.get(S.charAt(i)));
            lastInd = Math.max(lastInd, hmp.get(S.charAt(i)));
            System.out.println("last index :" + lastInd);
            if (i == lastInd) {
                lst.add(lastInd - firstInd + 1);
                firstInd = lastInd + 1;
            }
        }
        return lst;
    }
    public static void main(String[]args){
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
        
    }
}
