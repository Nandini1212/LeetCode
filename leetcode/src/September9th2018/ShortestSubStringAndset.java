/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September9th2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author nandini
 * Find the smallest substring of the string containing all
 * the characters in the set
 * 
 * input : string : "abbcbcba"
 * set {'a','b','c'}
 * 
 * output : cba
 * 
 * iterate through the string.
 * if char at that index is in set and not visited that character, i will add that element to my list and string
 * and increment count by 1.
 * and check count and set size are equal or not.
 * if they are equal, i will return my string.
 *if they are not equal increment my index by 1.
 * if count is equal to set size - 1, then reset my index to index - count. 
 * and make the list empty, string empty, count = 0, and increment index by 1.
 */
public class ShortestSubStringAndset {
    // O(n^2)
    public static String lengthOfShortestSubstring(String s, HashSet<Character>set){
        int len = set.size() , count = 0 , start = 0 , minLen = Integer.MAX_VALUE;
	String result = "" ;
	HashMap<Character, Integer> map = new HashMap<> ();
        int c = 0;
        for (int i = 0 ; i < s.length() ; ++i) {
            char ch = s.charAt(i) ;
            if (set.contains(ch)) {
                if(map.containsKey(ch)){
                    c = map.get(ch) + 1;
                } else {
                    c = 1;
                }

                if (c == 1){
                    count++;
                }
		map.put(ch, c) ;
            }
            while (count == len) {					
                if (set.contains(s.charAt(start))) {
                    int index = map.get(s.charAt(start));				  
		  	if (index - 1 == 0) {					  		
                            count--;
		  	}
			map.put(s.charAt(start), index - 1) ;					 
                }							
		if (i - start + 1 < minLen) {
                    minLen = i - start + 1 ;
                    result = s.substring(start, i + 1) ;
                }	
                    start++;
            }
	}				
	return result;
    }
    //O(n)
    /*
    public static String lengthOfShortestSubstring(String str, HashSet<Character>set){
	
        int index = 0;
        String uniqueStr = "";
	ArrayList<Character> visited = new ArrayList<Character>();
        int compareCount = 0;
        while (index < str.length()) {
			
            if (set.contains(str.charAt(index)) && !visited.contains(str.charAt(index))) {
		visited.add(str.charAt(index));
                System.out.println("visited :" +visited);
		uniqueStr += str.charAt(index);
                System.out.println("unique :" + uniqueStr);
 		compareCount++;
                System.out.println("compare count :" + compareCount);
				
		if (compareCount == set.size()){ 
                    System.out.println("count unique :" +uniqueStr);
                    return uniqueStr;
                }
                        
                index++;
        	continue;
            }
            if (compareCount == (set.size() - 1)) {
                index = index - compareCount;
            }
            uniqueStr = "";
            visited = new ArrayList<Character>();
            System.out.println(visited);
            compareCount = 0;
            index++;
			
	}


        return null;
    }*/
    
    public String findMin (String s, HashSet<Character> set){
		int len = set.size() , count = 0 , tail = 0 , minLen = Integer.MAX_VALUE;
		String result = "" ;
		HashMap<Character, Integer> map = new HashMap<> ();
		for (int i = 0 ; i < s.length() ; ++i) {
			char ch = s.charAt(i) ;
			if (set.contains(ch)) {
				int c = map.containsKey(ch) ? map.get(ch) + 1 : 1 ;
				if (c == 1) count++;
				map.put(ch, c) ;
			}
			while (count == len) {					
				if (set.contains(s.charAt(tail))) {
				  	int v = map.get(s.charAt(tail));				  
				  	if (v - 1 == 0) {					  		
				  		count--;
				  	}
				  	map.put(s.charAt(tail), v - 1) ;					 
				}							
			 	if (i - tail + 1 < minLen) {
			  		minLen = i - tail + 1 ;
			  		result = s.substring(tail, i + 1) ;
			  	}	
				tail++;
			}
		}				
		return result;
}
        
       
    public static void main(String[]args){

            HashSet<Character> set = new HashSet<Character>();
            set.add('a');
            set.add('b');
            set.add('c');
            String s = "abbccaabdbc";
            System.out.println(lengthOfShortestSubstring(s, set));
    }
}
