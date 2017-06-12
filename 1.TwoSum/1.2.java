// HashMap
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                break;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return res;
    }
}



// sorted array
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = nums.clone();
        int[] res = new int[2];
        Arrays.sort(temp);
        int left = 0;
        int right = temp.length - 1;
        int res_i = 0;
        while (left < right) {
            if (temp[left] + temp[right] == target) {
                break;
            }
            if (temp[left] + temp[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp[left] || nums[i] == temp[right]) {
                res[res_i++] = i;
            }
        }
        return res;
    }
}