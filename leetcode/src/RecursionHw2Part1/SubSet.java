/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionHw2Part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nandini
 * We can have a recursion function to add visited subsets to the final results. 
 * Remember to make a deep copy when we need to add subset to the results.
 * Time : n * 2^n
 */
public class SubSet {
    
        static String[] generate_all_subsets(String s) {
            /*
            List<String>result = new ArrayList<String>();                    
            if(s.length() == 0){
                result.add("");
            }
            for(int index = 1; index < s.length(); index++){
                int oldLength = result.size();
                for(int j = 0; j < oldLength; j++){
                    result.add(s.charAt(index) +result.get(index));
                }
                result.add(Character.toString(s.charAt(index)));
            }
            String[] myArray = new String[result.size()];
            myArray = result.toArray(myArray);
            int index = 0;
            for(String str : myArray){
                myArray[index] = str;
                index++;
            }
            return myArray;*/
            List<String>result = new ArrayList<String>(); 
            generateSubsetUtil(result, s, 0, "");
            String[] myArray = new String[result.size()];
            myArray = result.toArray(myArray);
            int index = 0;
            for(String str : myArray){
                myArray[index] = str;
                index++;
            }
            return myArray;
        }
        static void generateSubsetUtil(List<String>allSubSets, String str, int position, String currentSubset){
            if(position == str.length()){
                allSubSets.add(currentSubset);
                return;
            }
            //not including s position
            generateSubsetUtil(allSubSets, str, position + 1, currentSubset);
            //including s position
            generateSubsetUtil(allSubSets, str, position + 1, currentSubset + str.charAt(position));
        }
        public static void main(String[]args){
            String str = "xy";
            System.out.println(Arrays.toString(generate_all_subsets(str)));
        }

    
}
