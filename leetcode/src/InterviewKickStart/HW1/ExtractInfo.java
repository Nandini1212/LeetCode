/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickStart.HW1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nandini
 */
public class ExtractInfo {
    public static String[] solve(String[] arr) {
            Arrays.sort(arr);
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            HashMap<String, String> mapForValue = new HashMap<String, String>();
            
            for(int index = 0; index < arr.length; index++) {
                 String splits[] = arr[index].split(" ");
                 String key = splits[0];
                 String value = splits[1];
                
               if(map.containsKey(key)) {
                   map.put(key, map.get(key) + 1);
                   
               }  else {
                   map.put(key, 1);
               }
               if(mapForValue.containsKey(key)) {
                    String value1 = mapForValue.get(key);
                    String value2 = value;
                    if(value1.compareTo(value2) < 0) {
                        mapForValue.put(key, value2);
                    } else {
                        mapForValue.put(key, value1);
                    }                  
               } else {
                   mapForValue.put(key, value);
               }
            }
            String answer[] = new String[map.size()];
        int pointer = 0;
        for (String key : map.keySet()) {
            answer[pointer++] = key + ":" + map.get(key) + "," + mapForValue.get(key);
        }
       // System.out.println(Arrays.toString(answer));
        return answer;
    }



    public static void main(String [] args){
        String [] arr = { "key1 abcd", "key2 zzz", "key1 hello", "key3 world", "key1 hello"};
        System.out.println("Before Printing");
        System.out.println("===========================================================");
        System.out.println(Arrays.toString(arr));
        System.out.println("===========================================================");
        System.out.println("after Printing");
        
        System.out.println(Arrays.toString(solve(arr)));
        

    }
}               
        

    
    

