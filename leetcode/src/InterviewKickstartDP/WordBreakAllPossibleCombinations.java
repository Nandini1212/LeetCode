/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewKickstartDP;

/**
 *
 * @author nandini
 */
public class WordBreakAllPossibleCombinations {
    public static void wordBreak(String[]dict, String str, String out){
        if(str.length() == 0){
            System.out.println(out);
        }
        for(int i = 1; i <= str.length(); i++){
            String prefix = str.substring(0, i);
            if(dict.contains(prefix)){
                
            }
        }
    }
}
