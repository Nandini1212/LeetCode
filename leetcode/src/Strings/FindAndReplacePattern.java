/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 * 
 * abb -> 011

abc -> 012
deq -> 012
mee -> 011  
aqq -> 011 
dkd -> 010
ccc -> 000
 */
public class FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[]words, String pattern){
        int[]patternPosition = getPosition(pattern);
        List<String> list = new ArrayList<>();
        for(String word : words){
            if(Arrays.equals(getPosition(word), patternPosition)){
                list.add(word);
            }
        }
        return list;
    }
    // positions of each word
    public static int[]getPosition(String word){
        HashMap<Character, Integer> map = new HashMap<>();
        int[]positions = new int[word.length()];
        char[]ch = word.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(map.get(ch[i]) == null){
                map.put(ch[i], i);
            }
            positions[i] = map.get(ch[i]);
        }
        return positions;
    }
    public static void main(String[]args){
        String [] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(words, pattern));
    }
}
