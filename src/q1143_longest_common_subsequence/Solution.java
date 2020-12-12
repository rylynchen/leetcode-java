package q1143_longest_common_subsequence;

/**
 * 最长公共子序列
 * <p>
 * Solution: 动态规划,转化为2维数组,f(i,j)表示[i,j]位置的最大公共子序列, 方程f(i,j) =
 * text1[i] == text[j] : f(i-1,j-1) + 1
 * text1[i] != text[j] : Max( f(i-1,j), f(i,j-1) )
 * <p>
 * Time:O(n^2), Space:O(n^2)
 *
 * @Link: https://leetcode-cn.com/problems/longest-common-subsequence/
 * @Author: liuchen created at 17:45 20/11/2020
 */
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char c1 = text1.charAt(i);
                char c2 = text2.charAt(j);
                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        Solution s = new Solution();
        System.out.println(s.longestCommonSubsequence(text1, text2));
    }
}
