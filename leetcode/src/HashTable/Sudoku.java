/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import java.util.HashSet;

/**
 *
 * @author nandini
 */
public class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0 ) {
             return  false ;
        }
        HashSet <Integer> set = new HashSet<> ();
         for ( int i = 0; i < 9; i++ ) {
            set.clear();
            for ( int j = 0; j < 9; j++ ) {
                 if (board[i][j] != '.' && !set.add(board[i][j] - '0' )) {
                     return  false ;
                }
            }
        }
        for ( int j = 0; j < 9; j++ ) {
            set.clear();
            for ( int i = 0; i < 9; i++ ) {
                 if (board[i][j] != '.' && !set.add(board[i][j] - '0' )) {
                     return  false ;
                }
            }
        }
        for ( int i = 1; i < 9; i += 3 ) {
             for ( int j = 1; j < 9; j += 3 ) {
                set.clear();
                for ( int k = -1; k <= 1; k++ ) {
                     for ( int l = -1; l <= 1; l++ ) {
                         if (board[i + k][j + l] != '.' && !set.add(board[i + k][j + l] - '0' )) {
                             return  false ;
                        }
                    }
                }
            }
        }
        return  true ;
    }
}
