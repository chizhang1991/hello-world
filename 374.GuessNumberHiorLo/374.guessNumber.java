/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n) == 0) {
            return n;
        }
        int hi = n;
        int lo = 1;
        int g = lo + (hi - lo) / 2;
        while (lo < hi) {
            int t = guess(g);
            if(t == 0) {
                return g;
            }
            else if(t == -1) {
                hi = g;
            }
            else {
                lo = g;
            }
            g = lo + (hi - lo) / 2;
        }
        return g;
    }
}