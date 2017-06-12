/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1 || isBadVersion(1)) {
            return 1;
        }
        if(isBadVersion(n-1) == false) {
            return n;
        }
        int lo = 1;
        int hi = n;
        int mid = lo + (hi - lo) / 2;
        while(lo < hi-1) {
            if(isBadVersion(mid)) {
                if(isBadVersion(mid-1) == false) {
                    break;
                }
                hi = mid;
            }
            else {
                lo = mid;
            }
            mid = lo + (hi - lo) / 2;
        }
        return mid;
    }
}