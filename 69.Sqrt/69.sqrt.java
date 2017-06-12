public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int lo = 1;
        int hi = Integer.MAX_VALUE;
        while (true) {
            int mid = lo + (hi - lo) / 2;
            if (mid > x / mid) {
                hi = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1)) {
                    return mid;
                }
                lo = mid  + 1;
            }
        }
    }
}

public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        // find the last number: num * num < x
        int lo = 0;
        int hi = x;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            // if (mid == x / mid) {
            //     return mid;
            // }
            // use x / mid not mid * mid -> exceeds integer limit
            if (mid < x / mid) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        // use x / hi to test
        if (hi <= x / hi) {
            return hi;
        }
        return lo;
    }
}