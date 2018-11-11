/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September11th;

import java.util.ArrayList;
import java.util.List;

/**
 this is the similar method in industry. 
 * In industry, most of shorten url service is by database, 
 * one auto increasing long number as primary key.
 * whenever a long url need to be shorten, append to the database, 
 * and return the primary key number. 
 * (the database is very easy to distribute to multiple machine like HBase, 
 * or even you can use the raw file system to store data and improve performance by shard and replica).
Note, it's meaningless to promise the same long url to be shorten as the same short url. 
* if you do the promise and use something like hash to check existing, the benefit is must less than the cost.
Note: if you want the shorted url contains '0-9a-zA-Z' instead of '0-9', 
* then you need to use 62 number system, not 10 number system(decimal) to convert the primary key number. 
* like 123->'123' in decimal, 123->'1Z' in 62 number system (or '0001Z' for align).
 */
public class EncodeAndDecodeTinyURL {
    List<String> list = new ArrayList<String>();
    
    public String encode(String longUrl){
        list.add(longUrl);
        return String.valueOf(list.size() - 1);        
    }
    
    public String decode(String shortUrl){
        int index = Integer.valueOf(shortUrl);
        if(index < list.size()){
            return list.get(index);
        }
        return "";
    }
    public static void main(String[] args){
        EncodeAndDecodeTinyURL url = new EncodeAndDecodeTinyURL();
        String longUrl = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = "http://tinyurl.com/4e9iAk";
        System.out.println(url.encode(longUrl));
      //  url.decode(shortUrl);
    }
}
