/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author nandini
 */
public class isNStraightHand {
 public static boolean isNStraightHand(int[]hand, int w){
     TreeMap<Integer, Integer> map = new TreeMap<>();
     for(int i = 0; i < hand.length; i++){
         if(map.containsKey(hand[i])){
             map.replace(hand[i], map.get(hand[i]) + 1);
         } else {
             map.put(hand[i], 1);
         }
     }
     
     while(map.size() > 0){
         int first = map.firstKey();
         for(int i = first; i < first + w; i++){
             if(!map.containsKey(i)){
                 return false;
             }
             int c = map.get(i);
             if(c == 1){
                 map.remove(i);
             } else {
                 map.replace(i, c - 1);
             }
             
             
         }
     }
     return true;
 }   
 public static void main(String[]args){
     int[] hand = {1,2,3,6,2,3,4,7,8};

     int w = 3;
     System.out.println(isNStraightHand(hand, w));
 }
}
