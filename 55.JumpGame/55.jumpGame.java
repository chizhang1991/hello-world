// slow
public class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        boolean[] jumpTo = new boolean[nums.length];
        Arrays.fill(jumpTo, false);
        jumpTo[0] = true;
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (jumpTo[j] == false) {
                    continue;
                }
                if (nums[j] >= i - j) {
                    jumpTo[i] = true;
                }
            }
        }
        
        return jumpTo[nums.length - 1];
    }
}

// Greedy- fast
public class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int farest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (farest < i) {
                return false;
            }
            farest = Math.max(nums[i] + i, farest);
        }
        if (farest >= nums.length - 1) {
            return true;
        }
        return false;
    }
}