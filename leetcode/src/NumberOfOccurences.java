
import java.util.Arrays;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class NumberOfOccurences {

    public static void numberOfOccurences(String[] arr) {
         
        int count = 0;
        for(String arrs : arr){
            String [] splitarr = arrs.split(" ");
            String first = splitarr[1];
            for (int i = 1; i < splitarr.length; i++){
                String file = splitarr[i];
                for(int j = 0; j < file.length(); j++){
                    if(file.charAt(j) == file.charAt(j + 1)){
                        count++;
                        System.out.println(j);
                    }
                }
        }
        
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        

    }
    }

    public static void main(String[] args) {
        String [ ] arr = {"raj ch", "tutti ch", "sur cr"};
        numberOfOccurences(arr);
    }
    
}
