/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nandini
 */
public class SubDomainVisits {
    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap();
        for (String cd : cpdomains) {
            int i = cd.indexOf(' ');
            int n = Integer.valueOf(cd.substring(0, i));
            String s = cd.substring(i + 1);
            for (i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '.') {
                    String d = s.substring(i + 1);
                    map.put(d, map.getOrDefault(d, 0) + n);                   
                }
            }
            map.put(s, map.getOrDefault(s, 0) + n);
        }

        List<String> res = new ArrayList();
        for (String d : map.keySet()){
            res.add(map.get(d) + " " + d);
            System.out.println("d map : " + map.get(d));
        }
        return res;
    }
    public static void main(String[]args){
        String[]arr = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        String[]arr1 = {"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(arr1));
    }
            
}
