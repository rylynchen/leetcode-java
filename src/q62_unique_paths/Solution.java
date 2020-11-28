package q62_unique_paths;

/**
 * 不同路径
 * <p>
 * Solution1:动态规划, f(i,j) = f(i,j-1) + f(i-1,j)
 * Solution2:Solution1基础上，空间O(n),仅保存上一行信息
 * <p>
 * Time:O(mn),Space:O(mn)/O(n)
 *
 * @Link: https://leetcode-cn.com/problems/unique-paths/
 * @Author: liuchen created at 20:29 25/11/2020
 */
public class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        Solution s = new Solution();
        System.out.println(s.uniquePaths(m, n));
    }
}
