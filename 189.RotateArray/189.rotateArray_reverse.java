public class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int r = k % l;
        reverse(nums, 0, l-1);
        reverse(nums, 0, r-1);
        reverse(nums, r, l-1);
    }
    private void reverse (int[] array, int m, int n) {
        int i = m;
        int j = n;
        while(i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}