public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> res = new LinkedList<String>(); //compile time should be LinkedList, List do not have peek method
        // test when digits is null or contains no number
        if(digits == null || digits.length() == 0) {
            return res;
        }
        res.add("");
        // remove from the head, add from the tail
        for(int i = 0; i < digits.length(); i++) {
            int x = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length() == i) {
                String t = res.remove();
                for(char s: mapping[x].toCharArray()) {
                    res.add(t+s);
                }
            }
        }
        return res;
    }
}