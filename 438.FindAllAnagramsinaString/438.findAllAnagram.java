public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        if(s == null || s.length() < p.length()) {
            return res;
        }
        int delta = p.length();
        int hiLim = s.length() - delta;
        //HashSet<Character> test = new HashSet<Character>();
        int[] test = new int[26];
        for(int i = 0; i < delta; i++) {
            test[p.charAt(i) - 'a']++;
        }
        for(int i = 0; i <= hiLim; i++) {
            if(isAnagram(s.substring(i, i+delta), test, delta) == true) {
                res.add(i);
            }
        }
        return res;
    }
    public boolean isAnagram(String s, int[] test, int l) {
        int[] nums = new int[26];
        for(int i = 0; i < l; i++) {
            nums[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(nums[i] != test[i]) {
                return false;
            }
        }
        return true;
    }
}