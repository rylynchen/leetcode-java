package q49_chou_shu_lcof;

/**
 * 丑数
 * <p>
 * Solution: 动态规划，n=min(i*2, j*3, k*5), 由次结合第一位是1，逐个往下生成到第n位
 * <p>
 * Time: O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/chou-shu-lcof/
 * @Author: liuchen created at 19:39 2020-11-01
 */
public class Solution {
    public int nthUglyNumber(int n) {
        int a = 0, b = 0, c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if(dp[i] == n2) a++;
            if(dp[i] == n3) b++;
            if(dp[i] == n5) c++;
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int n = 10;
        Solution s = new Solution();
        System.out.println(s.nthUglyNumber(n));
    }
}
