/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September11th;

import java.util.Arrays;

/*Time complexity: O(mn), where n is the number of elements in the matrix, 
and m is the number of elements of the island with the largest area.
Space complexity: O(1)

DFS: Depth-first search, depth-first search.

The area of ​​each area is realized by the DFS algorithm, 
where the recursive implementation is used, and the calculated land becomes 0;
Iterate through all the elements in the graph and record the current maximum area.
 
 */
public class MaxAreaIslandEasy {
    public static int maxAreaOfIsland(int [][]grid){
        int maxArea = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                System.out.println(Arrays.toString(grid[0]));
                if(grid[i][j] != 0){
                    maxArea = Math.max(maxArea, areaOfIslandDfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }
    public static int areaOfIslandDfs(int [][] grid, int x, int y){
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && 
                grid[x][y] == 1){
            grid[x][y] = 0;
            return 1 + areaOfIslandDfs(grid, x + 1, y) + areaOfIslandDfs(grid, x - 1, y)
                    +areaOfIslandDfs(grid, x, y + 1) + areaOfIslandDfs(grid, x, y - 1);
        }
        return 0;
    }
    public static void main(String[]args){
        int [][]grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0} 
            };
        System.out.println(maxAreaOfIsland(grid));
    }
}
