public class Solution {
    public void sortColors(int[] nums) {
        int tail = nums.length - 1;
        int head = 0;
        int size = nums.length;
        while (head < tail) {
            while (head < size && nums[head] != 2) {
                head++;
            }
            while (tail >= 0 && nums[tail] == 2) {
                tail--;
            }
            if (head >= tail) {
                break;
            } else {
                swap(nums, head, tail);
            }
        }
        head = 0;
        while (head < tail) {
            while (head < size && nums[head] == 0) {
                head++;
            }
            while (tail >= 0 && nums[tail] != 0) {
                tail--;
            }
            if (head >= tail) {
                break;
            } else {
                swap(nums, head, tail);
            }
        }
    }
    private void swap(int[] nums, int head, int tail) {
        int temp = nums[head];
        nums[head] = nums[tail];
        nums[tail] = temp;
    }
}