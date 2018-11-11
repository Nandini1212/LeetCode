/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nandini
 */
//Time complexity: O(|pairs| + |words1|)

//Space complexity: O(|pairs|)
public class SentenceSimilarity {
    
    public static boolean areSentencesSimilar(String [] words1, String [] words2,
            String [] [] pairs){
        if(words1.length != words2.length){
            return false;
        }
        HashMap<String, Set<String>> map = new HashMap<String, Set<String>>();
        for(String [] pair : pairs){
            
            if(!map.containsKey(pair[0])){
                map.put(pair[0], new HashSet<>());
            }
            if(!map.containsKey(pair[1])){
                map.put(pair[1], new HashSet<>());
            }
            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        for(int index = 0; index < words1.length; index++){
            if(words1[index].equals(words2[index])){
                continue;
            }
            if(!map.containsKey(words1[index])){
                return false;
            }
            if(!map.get(words1[index]).contains(words2[index])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String [] words1 = {"great", "acting", "skills"};
        String [] words2 = {"fine", "drama", "talent"};
        String [] [] pair = {{"great", "good"}, {"fine", "good"}, {"acting","drama"}, {"skills","talent"}};
        System.out.println(areSentencesSimilar(words1, words2, pair));
    }
}
