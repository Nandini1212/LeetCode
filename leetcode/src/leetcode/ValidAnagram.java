/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.HashMap;

/**
 *
 * @author nandini
 */
public class ValidAnagram {
  

static boolean areAnagram(String s, String t)
{
    int i;
    int count[] = new int[256];
    //int len1 = str1.length();
    //int len2 = str2.length();
    String replaceS = s.replace("\\s", "");
    int len1 = replaceS.length();
    String replacet = t.replace("\\s", "");      
    int len2 = replacet.length();
    
    if(len1 != len2)
        return false;
    
	for (i=0; i<len1; i++)
	{
		count[replaceS.charAt(i)]++;
		count[replacet.charAt(i)]--;
		
	}
	
	for (i=0; i<256; i++)
	{
		if(count[i] != 0)
		    return false;
	}
    
    return true;
	
}

public static void main (String[] args)
{
    String str1 = "geeks forgeeks";
    String str2 = "forgeeks geeks";
	
	System.out.println( areAnagram(str1, str2) );
}


}


