/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
its working code
 */
package Facebook;

/**
 *
 * @author nandini
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        if(n < 0){
            return null;
        }
        String result = "1";
        int i = 1;
        while(i < n){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for(int index = 1; index < result.length(); index++){
                if(result.charAt(index) == result.charAt(index - 1)){
                    
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(index - 1));
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
            i++;
        }

        return result; 
        
    }
    public static void main(String[]args){
        //int num = 1122;
        System.out.println(countAndSay(12));
    }
    
}
