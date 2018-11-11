/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rst = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0) {
            return rst;
        }
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            System.out.println("array is: " + new String(arr));
            String str = new String(arr);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<String>());
                System.out.println("str is : " +str );
            }
            map.get(str).add(strs[i]);
            System.out.println("map.get str is : " +map.get(str)
            + " "+"str[index]" + " "+strs[i] +" "+ " index is" + i);
        }
        /*
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {//SLOW
            Collections.sort(entry.getValue());
            rst.add(entry.getValue());
        }
        */
        for(String key: map.keySet()){//FASTER
            System.out.println("key is:" + key +" "+"map is: "+ map.keySet());
            Collections.sort(map.get(key));
            rst.add(map.get(key));
            System.out.println("result is: "+rst +" "+"map key is "+ map.get(key));
        }

        return rst;
    }
    public static void main(String[]args){
        String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(str));
    }
}
