public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return null;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i1 = 0;
        int i2 = 0;
        int t = 0;
        while(i1 < l1 && i2 < l2) {
            if(nums1[i1] == nums2[i2]) {
                nums2[t++] = nums1[i1];
                i1++;
                i2++;
            }
            else if(nums1[i1] < nums2[i2]) {
                i1++;
            }
            else {
                i2++;
            }
        }
        int[] res = new int[t];
        for(int i = 0; i < t; i++) {
            res[i] = nums2[i];
        }
        return res;
    }
}