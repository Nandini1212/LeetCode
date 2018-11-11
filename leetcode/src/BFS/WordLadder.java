/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author nandini
 */
public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet(wordList);
        
        if (beginWord == null || endWord == null 
         || beginWord.length() == 0 || endWord.length() == 0
         || beginWord.length() != endWord.length() || !words.contains(endWord)) {
             return 0 ;
         }
        
        Queue <String> q = new LinkedList<>();
        q.offer(beginWord);
        
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        
        int level = 0;
        
        while (!q.isEmpty()) {
            int qSize = q.size();
            level++;
            
            for (int i = 0; i < qSize; i++) {
                String current = q.poll();
                for (int j = 0; j < current.length(); j++) {
                    char[] stringChar = current.toCharArray();
        
                    for (char c = 'a'; c <= 'z'; c++) {
                        stringChar[j] = c;

                        String temp = new String(stringChar);
                        
                        if (endWord.equals(temp)) {
                            return level + 1;
                        }
                        
                        if (words.contains(temp) && !visited.contains(temp)) {
                            visited.add(temp);
                            q.offer(temp);
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    public static void main(String[]args){
        String start = "hit";
        String end = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
       // wordList.add("cog");

        System.out.println(ladderLength(start, end, wordList));
    }
}
