package leetcode;

import java.util.HashMap;

public class anagram {


static void isAnagram(String s1, String s2) {
    int lengthOfS1 = s1.length();
    int lengthOfS2 = s2.length();
    
    String replaceSpacesofS1 = s1.replace("\\s","").toLowerCase();
    String replaceSpacesofS2 = s2.replace("\\s","").toLowerCase();
    
    String toLowerCaseS1 = s1.toLowerCase();
    String toLowerCaseS2 = s2.toLowerCase();
    
    
    
    boolean flag = true;
    
    if(replaceSpacesofS1.length() != replaceSpacesofS2.length()) {
        flag = false;       
    }
    
    else {
    
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int index = 0; index < replaceSpacesofS1.length(); index++) {
            int count = 0;
            char characterAtString = replaceSpacesofS1.charAt(index);
            if(map.containsKey(characterAtString)) {
                count = map.get(characterAtString);
            }
            
            map.put(characterAtString, ++count);
            
        }
        
        for(int index = 0; index < replaceSpacesofS2.length(); index++) {
           char characterAtString2= replaceSpacesofS2.charAt(index);
           int count = 0;
           if(map.containsKey(characterAtString2)) {
               count = map.get(characterAtString2);
           }
           
           map.put(characterAtString2, --count);
        }
        
        for(int value: map.values()) {
            if(value != 0) {
                flag = false; 
            }
                       
        }    
        
        if(flag) {
            System.out.println(s1+" and "+ s2 +" are anagrams");
        }
        else {
            System.out.println(s1+" and "+ s2 +" are not anagrams"); 
        }
    }
        
   
    
}

public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "mother inlaw";
        String s2 = "hitler woman";
        isAnagram(s1, s2);
    }
    

}