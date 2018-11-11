/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September9th2018;

/**
 *
 * @author nandini
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

class Trie {
  
    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    private final TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Iterative implementation of insert into trie
     */
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            } 
            current = node;
        }
        //mark the current nodes endOfWord as true
        current.endOfWord = true;
        
    }
    
    public void search(String word) {
        
        // StringBuilder prefix = new StringBuilder();
        TrieNode current = root;
        int length = word.length();
        int prevMatch = 0;
        
        for(int i = 0; i < length; i++) {
            
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                break;
            }
            
            current = node;
            if(current.endOfWord) {
                prevMatch = i +1;    
            }    
        }
        
        
        System.out.println("Output : " + word.substring(0, prevMatch));
        
    }
    
    public static void main(String[] args) {
        
        Trie object = new Trie();
        object.insert("are");
        object.insert("area");
        object.insert("base");
        object.insert("cat");
        object.insert("cater");
        object.insert("children");
        object.insert("basement");
        object.insert("aloha");
        
        object.search("caterer");
        object.search("basemexy");
        object.search("child");
    }
}