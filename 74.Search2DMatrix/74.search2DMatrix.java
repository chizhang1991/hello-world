public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // search in which row
        // search inside the row
        // find the last row that the first item in row  < target
        int top = 0;
        int bottom = matrix.length - 1;
        while (top + 1 < bottom) {
            int mid = top + (bottom - top) / 2;
            if (matrix[mid][0] < target) {
                top = mid;
            } else {
                bottom = mid;
            }
        }
        int row = 0;
        // decide which row is to find
        // test bottom first, because want to find the first one that is smaller than ... 
        // bottom is always larger than top
        if (matrix[bottom][0] <= target) {
            row = bottom;
        } else {
            row = top;
        }
        // target maybe in the row row
        int left = 0;
        int right = matrix[0].length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (matrix[row][left] != target && matrix[row][right] != target) {
            return false;
        } 
        return true;
    }
}

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // treat as an array
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = col * row - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / col][mid % col] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (matrix[left / col][left % col] != target && matrix[right / col][right % col] != target) {
            return false;
        }
        return true;
    }
}