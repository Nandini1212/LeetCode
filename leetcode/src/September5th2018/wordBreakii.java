/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September5th2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 * The key for the map can just be the current start search position of the string. 
 * And you don't need to create a substring everytime.
 */
public class wordBreakii {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict, new HashMap<>());
    }

    List<String> dfs(String s, List<String> wordDict, HashMap<String, List<String>> map) {
      if (map.containsKey(s)) {
        return map.get(s);
      }

      ArrayList<String> result = new ArrayList<>();
      if (s.length() == 0) {
        result.add("");
        return result;
      }

      for (String word : wordDict) {
        if (s.startsWith(word)) {
          List<String> subList = dfs(s.substring(word.length()), wordDict, map);
          for (String sub : subList) {
            result.add(word + (sub.length() == 0 ? "" : " ") + sub);
          }
        }
      }
      map.put(s, result);
      return result;
    }
    public static void main(String [] args){
        String [] arr = {"cat", "cats", "and", "sand", "dog"};
        String s = "catsanddog";
        
        //System.out.println(wordBreak(arr));
    }
}
