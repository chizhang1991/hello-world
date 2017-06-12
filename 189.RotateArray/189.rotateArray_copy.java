public class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[k];
        int n = nums.length;
        int j = k % n;
        int rotate = n - j;
        int left = n - j - 1;
        for (int i = 0; i < j; i++) {
            temp[i] = nums[rotate++];
        }
        for (int i = n-1; i > j-1; i--) {
            nums[i] = nums[left--];
        }
        for (int i = 0; i < j; i++) {
            nums[i] = temp[i];
        }
    }
}