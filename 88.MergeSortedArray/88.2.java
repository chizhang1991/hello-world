public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int curIdx = m + n - 1;
        m--; n--;
        while (m >= 0 || n >= 0) {
            if (m < 0) {
                nums1[curIdx--] = nums2[n--];
            } else if (n < 0) {
                nums1[curIdx--] = nums1[m--];
            } else {
                if (nums1[m] > nums2[n]) {
                    nums1[curIdx--] = nums1[m--];
                } else {
                    nums1[curIdx--] = nums2[n--];
                }
            }
        }
    }
}