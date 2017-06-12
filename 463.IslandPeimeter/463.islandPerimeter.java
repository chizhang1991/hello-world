public class Solution {
    public int islandPerimeter(int[][] grid) {
        int neighbour = 0;
        int sum = 0;
        int il = grid.length;
        int jl = grid[0].length;
        for(int i = 0; i < il; i++) {
            for(int j = 0; j < jl; j++) {
                neighbour = 0;
                if(grid[i][j] == 1) {
                    if(i > 0 && grid[i-1][j] == 1) {
                        neighbour++;
                    }
                    if(i < il-1 && grid[i+1][j] == 1) {
                        neighbour++;
                    }
                    if(j > 0 && grid[i][j-1] == 1) {
                        neighbour++;
                    }
                    if(j < jl-1 && grid[i][j+1] == 1) {
                        neighbour++;
                    }
                    sum += (4-neighbour);
                }
            }
        }
        return sum;
    }
}