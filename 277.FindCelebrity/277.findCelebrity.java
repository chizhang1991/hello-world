// two pointers
class Solution {
	public int findCelebrity(int n) {
		int left = 0;
		int right = n - 1;
		// find the one that might be celebrity
		while (left < right) {
			if (know(left, right)) {
				left++;
			} else {
				right--;
			}
		}
		// left might be celebrity, verify it
		for (int i = 0; i < n; i++) {
			if (know(left, i) || !know(i, left)) {
				return -1;
			}
		}
		return left;
	}
}