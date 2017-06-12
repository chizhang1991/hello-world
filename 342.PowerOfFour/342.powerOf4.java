public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 0) {
            return false;
        }
        if(num == 1) {
            return true;
        }
        if(num % 4 == 0) {
            return isPowerOfFour(num/4);
        }
        else {
            return false;
        }
    }
}
//--------------------------------
public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num < 1) {
            return false;
        }
        return (num & (num-1)) == 0 && (num-1) % 3 == 0;
    }
}