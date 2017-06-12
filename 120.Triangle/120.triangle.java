public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // dp, bottom up
        if (triangle == null || triangle.size() == 0) {
            return Integer.MAX_VALUE;
        }
        // state f[x][y] min path value from [x][y] to bottom
        int size = triangle.size();
        int[][] dp = new int[size][size];
        // initialize
        for (int i = 0; i < size; i++) {
            dp[size - 1][i] = triangle.get(size - 1).get(i);
        }
        // bottom up
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        // answer
        return dp[0][0];
    }
}