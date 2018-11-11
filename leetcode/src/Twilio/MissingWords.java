/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Twilio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class MissingWords {
    public static List<String> missingWords(String s, String t) {
    // Write your code here
        List<String> list = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        String [] str = s.split(" ");
         for(int i = 0; i < str.length; i++){
             if(!t.contains(str[i])){
                 list.add(str[i]);
             }
         }
         return list;
          
    }
    
    
    
    public static List<String> missingWordss(String s, String t) {
        HashMap <String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<String>();
        String[] arr = s.split(" ");
        String[] tarr = t.split(" ");
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], 1);
        }
        for(int i = 0; i < tarr.length; i++){
            if(map.containsKey(tarr[i])){
                map.remove(tarr[i]);
            }
            
        }
        
         for (HashMap.Entry<String, Integer> entry : map.entrySet()){
                list.add(entry.getKey());
            }
         return list;
    }
    
    public static void main(String[]args){
        String one = "I am using hackerrank to improve programming";
        String two = "am hackerrank to improve";
        System.out.println(missingWords(one, two));
    }
}
