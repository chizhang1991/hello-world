public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int max = 0;
        int dp[][] = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length + 1; i++) {
            for(int j = 0; j < matrix[0].length + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (matrix[i - 1][j - 1] == '0') {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                    }
                }
            }
        }
        // display(dp);
        return max * max;
    }
    // private void display(int[][] dp) {
    //     for (int i = 0; i < dp.length; i++) {
    //         for (int j = 0; j < dp[0].length; j++) {
    //             System.out.print(" " + dp[i][j]);
    //         }
    //         System.out.println();
    //     }
    // }
}