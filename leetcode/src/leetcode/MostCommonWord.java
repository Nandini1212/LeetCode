/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String [] banned){
     String[] para = paragraph.toLowerCase().split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        int maxNum = 1;
        for(int i=0;i<para.length;i++){
            if(para[i].endsWith("!")||para[i].endsWith("?")||para[i].endsWith("'")||para[i].endsWith(",")||para[i].endsWith(";")||para[i].endsWith(".")){
                para[i] = para[i].substring(0,para[i].length()-1);
            }
            if(map.containsKey(para[i])){
                int temp = map.get(para[i]) + 1;
                map.put(para[i],temp);
                maxNum = Math.max(maxNum,temp);
            }else{
                if(notBanned(banned,para[i]))
                    map.put(para[i],1);
            }
        }
        System.out.println(Arrays.toString(para));
        System.out.println(maxNum);
        Set<String> set = map.keySet();
        String maxNumStr = "";
        for(String str:set){
            if(map.get(str) == maxNum){
                maxNumStr = str;
                break;
            }
        }
        return maxNumStr;
    }
    public static boolean notBanned(String[] banned,String str){
        for(String ban:banned){
            if(ban.equals(str))
                return false;
        }
        return true;

      
    }
    
    public static void main(String[]args){
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String [] ban = {"hit"};
        System.out.println(mostCommonWord(paragraph, ban));
      
    }
    
}
