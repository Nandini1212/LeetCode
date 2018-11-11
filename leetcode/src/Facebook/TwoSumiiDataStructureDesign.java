/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class TwoSumiiDataStructureDesign {
        HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
        
    
    public void add(int number){

        if(elements.containsKey(number)){
            elements.put(number, elements.get(number) + 1);
        } else {
            elements.put(number, 1);
        }
        
    }
    public boolean find(int value){
        for(HashMap.Entry<Integer, Integer> entry :elements.entrySet()){
            int i = entry.getKey();
            int j = value - i;
            if((i == j && entry.getValue() > 1) || (i != j && elements.containsKey(j))){
                return true;
            
        }
            
        }
        return false;
    }
    public static void main(String[]args){
        TwoSumiiDataStructureDesign twoSum = new TwoSumiiDataStructureDesign();
        twoSum.add(5);
        twoSum.add(3);
        twoSum.add(1);
        twoSum.add(4);
        twoSum.add(7);
        twoSum.find(5);
        twoSum.find(6);
        

        System.out.println(twoSum.find(2));
        System.out.println(twoSum.find(4));
        System.out.println(twoSum.find(6));
        System.out.println(twoSum.find(1));
        
        
    }
    
}
