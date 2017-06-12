public class Solution {
    private int il;
    private int jl;
    public int numIslands(char[][] grid) {
        int num = 0;
        il = grid.length;
        if(il == 0) {
            return 0;
        }
        jl = grid[0].length;
        for(int i = 0; i < il; i++) {
            for(int j = 0; j < jl; j++) {
                if(grid[i][j] == '1') {
                    drown(grid, i, j);
                    num++;
                }
            }
        }
        return num;
    }
    private void drown(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >=il || j >= jl || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        drown(grid, i-1, j);
        drown(grid, i+1, j);
        drown(grid, i, j-1);
        drown(grid, i, j+1);
    }
}