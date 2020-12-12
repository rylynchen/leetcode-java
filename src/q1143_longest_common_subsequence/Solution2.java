package q1143_longest_common_subsequence;

public class Solution2 {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        if (m < 1 || n < 1) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            char c1 = text1.charAt(i);
            for (int j = 0; j < n; j++) {
                char c2 = text2.charAt(j);
                if (i == 0 && j == 0) {
                    dp[i][j] = c1 == c2 ? 1 : 0;
                    continue;
                }
                if (i == 0) {
                    if (c1 == c2) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i][j - 1];
                    }
                } else if (j == 0) {
                    if (c1 == c2) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    if (c1 == c2) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        Solution2 s = new Solution2();
        System.out.println(s.longestCommonSubsequence(text1, text2));
    }
}
