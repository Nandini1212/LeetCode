/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 *
 * @author nandini
 */
public class FileAndText {
    public static void fileDetails(){
        HashMap<String, String> map = new HashMap<>();
        map.put("File1.txt", "world");
        map.put("file2.txt", "like");
        map.put("file3.txt", "hello");
        map.put("file4.txt", "what");
        map.put("file5.txt", "hello");
        map.put("file6.txt", "world");
        
        HashMap<String, String> result = new HashMap<>(); //like , filename
        

        String[] fileName = new String[map.size()];
        String[] textName = new String[map.size()];
        boolean[]flags = new boolean[map.size()];
        int index = 0;
        for(Entry<String, String> m : map.entrySet()){
            fileName[index]  = m.getKey() ;
            textName[index] = m.getValue();
            index++;                        
        }
        for(int i = 0; i < map.size(); i++){
            for(int j = i + 1 ; j < map.size(); j++){
                if(flags[i] == true){
                    break;
                }
                if(textName[i] == textName[j]){
                    
                    flags[i] = true;
                    flags[j] = true;
                    System.out.println(fileName[i] +" , " + fileName[j]);
                    break;
                    
                }  
            }
                if(flags[i] == false){ 
                    System.out.println(fileName[i]);
                
                
            }          
                      
        }
       
    }
        
        
     public static List<String> FileSets() {
         
         HashMap<String, String> filenameToContentMap = new HashMap<>();
        filenameToContentMap.put("File1.txt", "world");
        filenameToContentMap.put("file2.txt", "like");
        filenameToContentMap.put("file3.txt", "hello");
        filenameToContentMap.put("file4.txt", "what");
        filenameToContentMap.put("file5.txt", "hello");
        filenameToContentMap.put("file6.txt", "world");
         
	HashMap<String, List<String>> contentShaToFilename = new HashMap<>();
	
	// Prepare a map from hash to filename list
        for(Entry<String, String> pair : filenameToContentMap.entrySet()){
		String sha = Hashing.sha256().newHasher().hashString(pair.getValue(), StandardCharsets.UTF_8).toString();
		if (contentShaToFilename.containsKey(sha)) {
			contentShaToFilename.get(sha).getValue().put(pair.getKey());
		} else {
			List<String> fileList = new ArrayList<String>();
			fileList.add(sha);
			contentShaToFilename.put(sha, fileList);
		}
	}

	// Create a list of lines containing comma separated filenames
	List<String> fileSets = new ArrayList<String>();
        for(Entry<String, List<String>> pair : contentShaToFilename.entrySet()){
	
		fileSets.add((pair.getValue()));
                fileSets.add(",");
	}

	// return the list of filenames
	return fileSets;
}

    
    
    public static void main(String[]args){
        fileDetails();
    }
}
