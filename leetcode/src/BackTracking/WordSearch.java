/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackTracking;

/*
Recursion. Check every char in the word from ind 0 to the last one. 
Base case/terminating case: if(ind==word.length()) ...
Recursion step:
check current index of the word and see if it is match to the char in the current position of the matrix, 
if no return false, 
if yes, recursively check all its neighbors with next character in the word.
Mark the current position as visited. If all the chars can find a match during this recursion
till the index reach the end of the word, return true, otherwise return false.
Tips:
Since it is word match, the matrix contains only alphabetic characters, 
so if the char in the current position is matched with the current index in the word, 
set the current char board[i][j]='*' and when it backtrack to current position, 
set it back to original value. board[i][j]=word.charAt(ind). 
Thus we can use this way to mark it as visited rather than use a 2-d boolean array and can save some space.
 */
public class WordSearch {
    public static boolean wordSearch(char[][]board, String word){
        if(board == null || board.length == 0 || board[0].length == 0){
            return false;
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean dfs(char[][]board, String word, int index, int i, int j){
        if(index == word.length()){
            return true;
        }
        if(i < 0 || i >= board.length){
            return false;
        }
        if(j < 0 || j >= board[0].length){
            return false;
        }
        if(board[i][j] == word.charAt(index)){
            board[i][j] = '#';
            if(dfs(board, word, index + 1, i + 1, j)
               || dfs(board, word, index + 1, i - 1, j)
               || dfs(board, word, index + 1, i, j + 1)
               || dfs(board, word, index + 1, i, j - 1)){
                return true;
            }
            board[i][j] = word.charAt(index);
        }
        return false;
    }
    public static void main(String[]args){
        char[][]board = {{'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        System.out.println(wordSearch(board, "ABCCED"));
    }
}
