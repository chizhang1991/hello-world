public class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        if(secret == null || guess == null || secret.length() == 0) {
            return "0A0B";
        }
        int[] nums = new int[10];
        int l = secret.length();
        for(int i = 0; i < l; i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bull++;
            }
            else {
                if(nums[secret.charAt(i) - '0']++ < 0) {
                    cow++;
                }
                if(nums[guess.charAt(i) - '0']-- > 0) {
                    cow++;
                }
            }
        }
        return bull + "A" + cow + "B";
    }
}