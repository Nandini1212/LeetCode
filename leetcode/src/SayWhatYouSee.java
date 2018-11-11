
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nandini
 */
public class SayWhatYouSee {
    public static String countAndSay(String arr){
        int count = 1;
        List<Integer>list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        String result = "";
        for(int i = 1; i < arr.length(); i++){
            if(arr.charAt(i) == arr.charAt(i - 1)){
                count++;
                sb.append(count);
                sb.append(arr.charAt(i));
                
            }else {
                count = 1;
                sb.append(count);
                sb.append(arr.charAt(i - 1));
            }            
        }
        sb.append(count);
        sb.append(arr.charAt(arr.length() - 1));
        result = sb.toString();
        return result;
    }
    public static void main(String[]args){
        System.out.println(countAndSay("12"));
        System.out.println(countAndSay("21"));
    }
}
