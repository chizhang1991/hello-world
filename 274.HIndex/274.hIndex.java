public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        Arrays.sort(citations);
        // int l = citations.length;
        // int h = 0;
        // for (h = l; h > 0; h--) {
        //     if (citations[l - h] >= h && citations[l - h - 1] <= h) {
        //         return h;
        //     }
        // }
        // if (l == 1 && citations[0] > 0) {
        //     return 1;
        // } else {
        //     return 0;
        // }
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int curh = Math.min(citations[i], n - i);
            if (curh > h) {
                h = curh;
            }
        }
        return h;
    }
}