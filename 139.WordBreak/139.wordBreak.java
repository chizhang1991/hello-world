public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();
        boolean[] dp = new boolean[size + 1];
        dp[0] = true;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] == false) {
                    continue;
                } else if (wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[size];
    }
    
}