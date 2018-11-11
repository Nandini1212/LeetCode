/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.HashMap;

/**
 *
 * @author nandini
 * 
 * wrote a helper function to check whether the word is in my hashmap or not
 * if it is not in my hashmap I simply return that word. or i append that word to another string
 * and check again if that string is in my hashmap. if it is already there get that string or put that
 * string, word in hashmap and return that string.
 * 
 * //if two word lengths are not equal return false.
 * now i iterate pairs and find pairs and check whether two strings are equal or not
 * if they are not equal put them in hash map.
 * 
 * //iterate through one of the words array
 * and check words array of ith index value is equal or not to another words array
 * of same index. and check equal or not of find words of words1 , words2. 
 * if all of these conditions failed return false.
 * other than that return true.
 * 
 * Time complexity : O(n)
 * space complexity : O(n)
 */
public class SimilaritySentenceii {
    public static String find(String word, HashMap<String, String> map){
        if(!map.containsKey(word)){
            return word;
        }
        String s = word;
        while(map.containsKey(s)){
            s = map.get(s);
        }
        map.put(word, s);
        return s;
    }
    public static boolean areSentencesSimilarTwo(String[] words1, String [] words2, String [][]pair){
        if(words1.length != words2.length){
            return false;
        }
        HashMap<String, String> map = new HashMap<String, String>();
        for(String [] pairs : pair){
            String parent0 = find(pairs[0], map);
            String parent1 = find(pairs[1], map);
            if(!parent0.equals(parent1)){
                map.put(parent0, parent1);
            }
        }
        for(int i = 0; i < words1.length; i++){
            if(!words1[i].equals(words2[i]) 
                    && !find(words1[i], map).equals(find(words2[i], map))){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[]args){
        String [] words1 = {"great", "acting", "skills"};
        String [] words2 = {"fine", "drama", "talent"};
        String [] [] pair = {{"great", "good"}, {"fine", "good"}, {"acting","drama"}, {"skills","talent"}};
        System.out.println(areSentencesSimilarTwo(words1, words2, pair));
    }
}
