// bottom up
public class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0 || s.equals("0")) {
            return 0;
        }
        // dp[i] number of decodings from 1 to i;
        int[] dp = new int[s.length() + 1];
        int n = s.length();
        dp[n] = 1;
        dp[n-1] = s.charAt(n-1) == '0' ? 0: 1;
        
        for(int i = n-2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            } else {
                if (Integer.parseInt(s.substring(i, i+2)) <= 26) {
                    dp[i] = dp[i + 1] + dp[i + 2];
                } else {
                    dp[i] = dp[i + 1];
                }
            }
        }
        return dp[0];
    }
}

// up to bottom
public class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        // dp, if the code is invalid, return 0;
        // state dp[x], decode ways of substring(0 - x);
        int[] dp = new int[s.length() + 1];
        char[] sArray = s.toCharArray();
        // initialize
        dp[0] = 1;
        dp[1] = sArray[0] != '0' ? 1 : 0;
        for (int i = 2; i <= s.length(); i++) {
            // sArray[i - 1];
            if (sArray[i - 1] != '0') {
                dp[i] = dp[i - 1];
            }
            int twodigit = (sArray[i - 2] - '0') * 10 + (sArray[i - 1] - '0');
            if (twodigit >= 10 && twodigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        
        return dp[s.length()];
    }
}