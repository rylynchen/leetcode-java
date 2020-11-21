package q74_search_a_2d_matrix;

/**
 * 搜索二维矩阵
 * <p>
 * Solution: 先循环行判断是否在当前行，然后行内用二分查找
 * <p>
 * Time:O(log(mn)), Space:O(1)
 *
 * @Link: https://leetcode-cn.com/problems/search-a-2d-matrix/
 * @Author: liuchen created at 17:32 21/11/2020
 */
public class Solution2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length < 1) {
            return false;
        }
        int h = matrix.length;
        int w = matrix[0].length;
        int left = 0, right = w * h - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = matrix[mid / w][mid % w];
            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 13;
        Solution2 s = new Solution2();
        System.out.println(s.searchMatrix(matrix, target));
    }
}
