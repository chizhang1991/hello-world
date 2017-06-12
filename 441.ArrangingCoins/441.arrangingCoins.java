public class Solution {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt((double)n * 2 + 0.25) - 0.5);
    }
}