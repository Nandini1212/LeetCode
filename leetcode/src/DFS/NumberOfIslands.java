/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;

/**
 *
 * @author nandini
 */
public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
         int ret = 0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == '1') {
                   dfs(grid, i, j);
                    ret++; 
                }
                
            }
        }
        return ret;
    }
    public static void dfs(char[][]grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
    }
    public static void main(String[]args){
        char [][] ch = {{'1','1','1','1','0'},{'1','1','0','1','0'},
        {'1','1','0','0','0'}, {'0','0','0','0','0'}};
        System.out.println(numIslands(ch));
    }
    
        
}
