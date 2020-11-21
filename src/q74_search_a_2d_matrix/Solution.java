package q74_search_a_2d_matrix;

/**
 * 搜索二维矩阵
 * <p>
 * Solution: 先循环行判断是否在当前行，然后行内用二分查找
 * <p>
 * Time:O(logN), Space:O(1)
 *
 * @Link: https://leetcode-cn.com/problems/search-a-2d-matrix/
 * @Author: liuchen created at 17:32 21/11/2020
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int w = matrix[0].length;
        int h = matrix.length;
        if (target < matrix[0][0] || target > matrix[h - 1][w - 1]) {
            return false;
        }
        for (int i = 0; i < h; i++) {
            if (target > matrix[i][w - 1]) {
                continue;
            }
            int left = 0;
            int right = w - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 13;
        Solution s = new Solution();
        System.out.println(s.searchMatrix(matrix, target));
    }
}
