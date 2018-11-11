/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCodeFrequencyAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nandini
 * The encoded form of strings is length + '#' +str + length + '#' + str.
If you say, there is a '#' in a str. Then it is counted for the length of that str
* but the added slash is not.
For "ab#cd", the encoded one should be "5#ab#cd".
* The decode function will read the length first, 
* then skip the slash between '5' and 'a', 
* starting from the next character and get the substring of that length which is 
* "ab#cd".
 */
public class EncodeAndDecodeString {
      // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        List<String>result = new LinkedList<>();
        int start = 0;
        int end = 0;
        while(end < s.length()){
            if(s.charAt(end) == '#'){
                int len = Integer.valueOf(s.substring(start, end));
                result.add(s.substring(end + 1, end + 1 + len));               
                start = end + 1 + len;
                end = start;
                
            }
            end++;
            
        }
    //System.out.println("res : " +Arrays.toString(result.toArray()));
        return result;
    }
    public static void main(String [] args){
        ArrayList<String> storage = new ArrayList<String>(Arrays.asList("4","5","6"));
        String t = "3#123";
        System.out.println("encode is: " + encode(storage));       
        List<String> map = new LinkedList<>();
        map.add(t);
        decode(t);
        String listString = "";
        for(String m : map){
            listString += m + "\t";
        }
        System.out.println(listString);
        
    }
}
