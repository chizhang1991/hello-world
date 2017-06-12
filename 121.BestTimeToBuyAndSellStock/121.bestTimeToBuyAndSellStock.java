public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int temp = 0;
        int theMax = 0;
        int day = prices.length;
        if(day == 0) {
            return 0;
        }
        int[] diff = new int[day-1];
        for (int i = 0; i < day-1; i++) {
            diff[i] = prices[i+1] - prices[i];
        }
        for (int i = 0; i < day-1; i++) {
            if (diff[i] > 0) { 
                max = diff[i];
                temp = max;
                for (int j = i; j < day-2; j++) {
                    temp += diff[j+1];
                    if(max < temp) {
                        max = temp;
                    }
                }
            }
            if (theMax < max) {
                theMax = max;
            }
        }
        return theMax;
    }
}

// prefix sum
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int l = prices.length;
        int[] twoDays = new int[l];
        int[] preSum = new int[l];
        int max = 0;
        
        twoDays[0] = 0;
        preSum[0] = 0;
        for (int i = 1; i < l; i++) {
            twoDays[i] = prices[i] - prices[i - 1];
            preSum[i] = preSum[i - 1] + twoDays[i];
        }
        
        // find the biggest preSum[i] - preSum[j], j < i && j is the smallest before i
        int smallest = 0;
        for (int i = 1; i < l; i++) {
            smallest = Math.min(smallest, preSum[i]);
            max = Math.max(max, preSum[i] - smallest);
        }
        return max;
    }
}

// just do minus
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // just do - , prices[i] - min{price before i}
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            max = Math.max(max, price - min);
            min = Math.min(min, price);
        }
        return max;
    }
}