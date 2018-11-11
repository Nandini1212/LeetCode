
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class FirstNonRepeatingChar {
    /*
    public static int firstUniqChar(String s) {
        int [] count = new int[256];
        for(int index = 0; index < s.length(); index++) {
            count[s.charAt(index) - 'a']++;
            System.out.println(s.charAt(index));           
        }
        for(int index = 0; index < s.length(); index++) {
            if(count[s.charAt(index)] == 1) {
                return i;
            }
        }
        return -1;
    }*/
    
        public static char firstUniqChar(String s) {
    if (s.length() == 0) {
        System.out.println("Fail");
        System.exit(0);
    } else {
        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> hm : m.entrySet()) {
            if (hm.getValue() == 1) {
                return hm.getKey();
            }
        }
    }
    return 0;
}


    
    public static void main(String [] args) {
        String s = "lovelo";
        System.out.println(firstUniqChar(s));
    }
    
}
