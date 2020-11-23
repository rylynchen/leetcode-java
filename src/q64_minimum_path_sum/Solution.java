package q64_minimum_path_sum;

/**
 * 最小路径和
 * Solution:
 * [i][j]的最短路径=min([i-1][j], [i][j-1]) + [i][j]
 * 特别：[0][j]的最短路径只能是[0][j-1]+[0][j],[i][0]的最短路径只能是[i-1][0]+[i][0]
 * <p>
 * Time:O(mn), Space: O(1)
 *
 * @Link: https://leetcode-cn.com/problems/minimum-path-sum/
 * @Author: liuchen created at 19:55 23/11/2020
 */
public class Solution {

    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                } else if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                } else {
                    grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Solution s = new Solution();
        System.out.println(s.minPathSum(grid));
    }
}