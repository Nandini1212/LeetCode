/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September11th;

import java.util.ArrayList;
import java.util.List;
/*
The string // denotes a line comment, which represents that it and rest of the characters to the right of it in the same line should be ignored.

The string /* denotes a block comment, which represents that all characters until the next (non-overlapping) 
occurrence of / should be ignored. (Here, occurrences happen in reading order: line by line from left to right.)
To be clear, the string // does not yet end the block comment, as the ending would be overlapping the beginning.

The first effective comment takes precedence over others: 
if the string // occurs in a block comment, it is ignored. Similarly, 
if the string /* occurs in a line or block comment, it is also ignored.

If a certain line of code is empty after removing comments, 
you must not output that line: each string in the answer list will be non-empty.

There will be no control characters, single quote, or double quote characters. 
For example, source = “string s = “/* Not a comment. *///(// is comment)”;” will not be a test case. 
//(Also, nothing else such as defines or macros will interfere with the comments.)

//It is guaranteed that every open block comment will eventually be closed, 
//so /* outside of a line or block comment always starts a new comment.

//Finally, implicit newline characters can be deleted by block comments. Please see the examples below for details.

//After removing the comments from the source code, return the source code in the same format.

public class RemoveComments {
    public static List<String> removeComments(String[] source) {
        List<String> list = new ArrayList<String>();
        
        if(source.length == 0 || source == null){
            return list;
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int tag = 0;
        int i = 0;
        
        while(index < source.length){
            i = 0;
            if(source[index].length() == 0){
                index++;
                continue;
            }
            if(source[index].length() == 1){
                if(tag == 0){
                    list.add(source[index++]);
                } else {
                    index++;
                }
                continue;
            }
            while(i < source[index].length() - 1){
                char c1 = source[index].charAt(i);
                char c2 = source[index].charAt(i + 1);
                if(c1 == '/' && c2 == '/' && tag == 0){
                    if(sb.length() != 0){
                        list.add(sb.toString());
                        sb = new StringBuilder();
                    }
                    index++;
                    break;
                } else if(c1 == '/' && c2 == '*' && tag == 0){
                    i = i + 1;
                    tag = 1;
                    if(i >= source[index].length() - 2){
                        index++;
                        break;
                    }
                } else if(c1 == '*' && c2 == '/' && tag == 1){
                    i = i + 1;
                    tag = 0;
                    if(i == source[index].length() - 1){
                        if(sb.length() != 0){
                            list.add(sb.toString());
                            sb = new StringBuilder();
                        }
                        index++;
                        break;
                    }
                } else {
                    if(tag == 0){
                        sb.append(c1);
                    }
                }
                i++;
                if(i == source[index].length() - 1){
                    if(tag == 0){
                        sb.append(source[index].charAt(i));
                        list.add(sb.toString());
                        sb = new StringBuilder();
                    }
                    index++;
                    break;
                }
            }
        }
        return list;
        
        
        
    }
    public static void main(String[]args){
        String [] prgm = { "/*Test program */", 
            "int main()", "{ ",
            "  // variable declaration ", 
            "int a, b, c;", "/* This is a test",
            "   multiline  ", "   comment for ", 
            "   testing */", "a = b + c;", "}"
        };      
        System.out.println(removeComments(prgm));
    }
}
