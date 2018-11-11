/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**http://www.cnblogs.com/grandyang/p/9201323.html
 *The above solution has been optimized, but we have a more awkward approach. 
 * This solution is grouped according to the first character of each word. 
 * The group holds a pair pair, which consists of the current letter and the next position. 
 * Then, when traversing the string S, according to the currently traversed letter,
 * the group corresponding to the letter is processed. 
 * If the next position of a pair in the group is equal to the length of the word, \
 *the word has been verified. It is a subsequence, and the result is incremented by one; otherwise,
 * the letter of the next position is extracted, 
 * and then the new pair formed by incrementing the next position in the pair is added to the group 
 * corresponding to the previously extracted letter. Is it already forced to read here, 
 * it does not matter, the blogger will give chestnuts to explain, take the example in the title:

S = "abcde"

Words = ["a", "bb", "acd", "ace"]

So first we put the words in the words array into the corresponding groups according to their initials, and get:

a -> {0, 1}, {2, 1}, {3, 1}

b -> {1, 1}

Here, the first number of each pair is the position of the word in words, 
* and the second number is the position of the next letter. 
* For example, {0, 1} means that "a" is 0 in the words array and the next position is 1 (because the current position is the first letter). 
* {2, 1} means "acd" is 2 in the words array and the next position is 1. 
* {3, 1} means "ace" is 3 in the words array and the next position is 1. 
* {1, 1} means "bb" is 1 in the words array and the next position is 1.

Ok, let's traverse the string S. The first letter encountered is 'a'.

Then a in our group corresponds to three pairs, 
* which are extracted and operated separately.
* First, {0, 1} is processed. At this time, 
* we find that the next position is 1, and the length of the word "a" is the same, 
* indicating that it is a subsequence, and the result res is incremented by 1. 
* Then process {2, 1}, and take the letter of position 1 in 'acd' as 'c', 
* then add the new pair {2, 2} after incrementing the next position to the group corresponding to c. 
* Then process {3, 1}, and take the letter of position 1 in 'ace' as 'c', 
* then add the new pair {3, 2} after incrementing the next position to the group corresponding to c. Then the group at this time is:

b -> {1, 1}

c -> {2, 2}, {3, 2}

Ok, continue to traverse the string S, the second encountered letter is 'b'.

Then b in our group corresponds to a pair, handle {1, 1}, 
* and take the letter of the position 1 in "bb" as 'b', 
* then the new pair {1 after the next position is incremented by 1. 2}
* Add the group corresponding to b. Then the group at this time is:

b -> {1, 2}

c -> {2, 2}, {3, 2}

Ok, continue to traverse the string S, the third encountered letter is 'c'.

Then c in our group corresponds to two pairs, 
* extract them and operate them separately. First deal with {2, 2}, 
* and take the letter of position 2 in 'ace' as 'e', ​​
* then add the new pair {2, 3} after incrementing the next position to the group corresponding to e.
* Then process {3, 2}, and take the letter of position 2 in 'acd' as 'd', 
* then add the new pair {3, 3} after incrementing the next position to the group corresponding to d. Then the group at this time is:

b -> {1, 2}

d -> {3, 3}

e -> {2, 3}

Ok, continue to traverse the string S, the fourth encountered letter is 'd'.

Then d in our group corresponds to a pair, processing {3, 3},
* at this time we find that the next position is 3, and the length of the word "acd" is the same, 
* indicating that it is a subsequence, and the result res is incremented by 1. Then the group at this time is:

b -> {1, 2}

e -> {2, 3}

Ok, continue to traverse the string S, the fifth encountered letter is 'e'.

Then e in our group corresponds to a pair, processing {2, 3},
* then we find that the next position is 3, and the length of the word "ace" is the same, 
* indicating that it is a subsequence, and the result res is incremented by 1. Then the group at this time is:

b -> {1, 2}

At this point S has been traversed, there is no b, indicating that "bb" is not a subsequence, 
* this make sense, return the result res, see the code as follows:


 * @author nandini
 */
public class NumberOfMatchingSubSquences {

     public static int numMatchingSubseq(String S, String[] words) {
        Map<Character, Deque<String>> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.putIfAbsent(c, new LinkedList<String>());
        }
        for (String word : words) {
            map.get(word.charAt(0)).addLast(word);
        }

        int count = 0;
        for (char c : S.toCharArray()) {
            Deque<String> queue = map.get(c);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.removeFirst();
                if (word.length() == 1) {
                    count++;
                } else {
                    map.get(word.charAt(1)).addLast(word.substring(1));
                }
            }
        }
        return count;
    }
     public static void main(String[]args){
         String s = "abcde";
         String []words = {"a", "bb", "acd", "ace"};
         System.out.println(numMatchingSubseq(s, words));
     }
}
