// 02
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            // get key
            char[] cArray = str.toCharArray();
            Arrays.sort(cArray);
            String key = String.valueOf(cArray);
            // check whether key has already exist
            if (!map.containsKey(key)) {
                // map.containsKey(), map.put(key, value)
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

// 01
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> res = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0) {
            return new ArrayList<List<String>>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String keyStr = String.valueOf(cArray);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<String>());
            } 
            map.get(keyStr).add(s);
        }
        //res = map.values();
        return new ArrayList<List<String>>(map.values());
    }
    
    // private void getAnagram(List<String> strs, List<List<String>> res, List<String> temp) {
    //     if (strs == null || strs.size() == 0) {
    //         return;
    //     }
    //     String key = strs.get(0);
    //     temp.add(key);
    //     strs.remove(0);
    //     for (int i = 0; i < strs.size(); i++) {
    //         if(ana(key, strs.get(i))) {
    //             temp.add(strs.get(i));
    //             strs.remove(i);
    //         }
    //     }
    //     res.add(temp);
    //     getAnagram(strs, res, new ArrayList<>());
    // }
    // private boolean ana(String str1, String str2) {
    //     if(str1.length() != str2.length() || str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
    //         return false;
    //     }
    //     char[] str1Array = Arrays.sort(str1.toCharArray());
    //     char[] str2Array = Arrays.sort(str2.toCharArray());
    //     for (int i = 0; i < str1.length(); i++) {
    //         if (str1Array[i] != str2Array[i]) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}