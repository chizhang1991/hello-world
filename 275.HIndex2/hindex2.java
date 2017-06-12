public class Solution {
    public int hIndex(int[] citations) {
        int h = 0;
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int curH = Math.min(citations[i], n - i);
            if (curH > h) {
                h = curH;
            }
        }
        return h;
    }
}

// binary search
public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int lo = 0;
        int hi = n - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (citations[mid] >= n - mid) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return n - lo;
    }
}