public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int l = nums1.length;
        for(int i = 0; i < l; i++) {
            hs.add(nums1[i]);
        }
        l = nums2.length;
        int[] temp = new int[l];
        int t = 0;
        for(int i = 0; i < l; i++) {
            if(hs.contains(nums2[i])) {
                temp[t++] = nums2[i];
                hs.remove(nums2[i]);
            }
        }
        int[] res = new int[t];
        for(int i = 0; i < t; i++) {
            res[i] = temp[i];
        }
        return res;
    }
}