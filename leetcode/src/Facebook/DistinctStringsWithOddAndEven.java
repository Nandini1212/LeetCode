/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facebook;

import java.util.HashSet;

/*
generate an encoded string for every input string. 
The encoded has counts of even and odd positioned characters 
separated by a separator. Two strings are considered distinct 
if their encoded strings are same else not. 
Once we have a way to encode string, the problem reduces to counting
distinct encoded strings. This is a typical problem of hashing. 
We create hash set and one by one store encodings of strings.
If an encoding already exists, we ignore string.
Else we store encoding in hash and increment count of distinct strings.
 */
public class DistinctStringsWithOddAndEven {
    public static String encodedString(char[] str){
        int [] hashEven = new int [26];
        int [] hashOdd = new int [26];
        
        for(int i = 0; i < str.length; i++){
            char c = str[i]; 
            if ( (i % 2) != 0){ // If index of current character is odd 
                hashOdd[c-'a']++;
            }
            else{
                hashEven[c-'a']++;
            }
        }
        String encoded = "";
        for(int i = 0; i < 26; i++){
            encoded += hashEven[i];
            encoded += ('-');
            encoded += hashOdd[i];
            encoded += ('-');
        }
        return encoded;
    }
    
    public static int countDistinct(String [] input, int n){
        HashSet<String> set = new HashSet<>();
        int countDistinct = 0;
        for(int i = 0; i < n; i++){
            if(!set.contains(encodedString(input[i].toCharArray()))){
                set.add(encodedString(input[i].toCharArray()));
                countDistinct++;
            }
        }
        return countDistinct;
    }
    public static void main(String[] args) { 
        String input[] = {"abcd", "acbd", "adcb", "cdba", 
                "bcda", "badc"}; 
        int n = input.length; 
  
        System.out.println(countDistinct(input, n)); 
    }
}
