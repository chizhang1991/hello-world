public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int k = n - 1;
        for (int j = m + n - 1; j >= 0; j--) {
            if (i < 0) {
                nums1[j] = nums2[k--];
            }
            else if (k < 0) {
                nums1[j] = nums1[i--];
            }
            else if (nums1[i] > nums2[k]) {
                nums1[j] = nums1[i--];
            }
            else {
                nums1[j] = nums2[k--];
            }
        }  
    }
}

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int im = 0;
        int in = 0;
        for (int i = 0; i < m + n; i++) {
            if (in == n) {
                temp[i] = nums1[im++];
            }
            else if(im == m) {
                temp[i] = nums2[in++];
            }
            else if (nums1[im] < nums2[in]){
                temp[i] = nums1[im++];
            }
            else {
                temp[i] = nums2[in++];
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
}