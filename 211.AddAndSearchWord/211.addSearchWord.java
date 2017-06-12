class TrieNode {
    public boolean isWord;
    public TrieNode[] children;
    
    public TrieNode() {
        isWord = false;
        children = new TrieNode[26];
    }
}

public class WordDictionary {
    private TrieNode root;
    
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        cur.isWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        TrieNode cur = root;
        return dfs(word.toCharArray(), root, 0);
    }
    private boolean dfs(char[] wordArray, TrieNode root, int start) {
        if (root == null) {
            return false;
        }
        if (start == wordArray.length) {
            return root.isWord;
        }
        char c = wordArray[start];
        if (c == '.') {
            for (int i = 0; i < 26; i++) {
                if (root.children[i] != null) {
                    if (dfs(wordArray, root.children[i], start + 1)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return dfs(wordArray, root.children[c - 'a'], start + 1);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */