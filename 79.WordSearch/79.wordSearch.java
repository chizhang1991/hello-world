public class Solution {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0) {
            return true;
        }
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        int col = board.length;
        int row = board[0].length;
        boolean[][] isVisited = new boolean[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (find(board, isVisited, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean find(char[][] board, boolean[][] isVisited, String word, int colp, int rowp, int pointer) {
        // check whether this word has all checked -> 1st
        // case: ['a'], "a"
        if (pointer == word.length()) {
            return true;
        }
        // check if dfs path come to the bound
        if (colp < 0 || colp >= board.length || rowp < 0 || rowp >= board[0].length) {
            return false;
        }
        // check if the grid has used
        if (isVisited[colp][rowp] || board[colp][rowp] != word.charAt(pointer)) {
            return false;
        }
        isVisited[colp][rowp] = true;
        if (find(board, isVisited, word, colp - 1, rowp, pointer + 1)) {
            return true;
        }
        if (find(board, isVisited, word, colp + 1, rowp, pointer + 1)) {
            return true;
        }
        if (find(board, isVisited, word, colp, rowp - 1, pointer + 1)) {
            return true;
        }
        if (find(board, isVisited, word, colp, rowp + 1, pointer + 1)) {
            return true;
        }
        isVisited[colp][rowp] = false;
        return false;
    }
}