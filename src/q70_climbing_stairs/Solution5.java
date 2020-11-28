package q70_climbing_stairs;

/**
 * 爬楼梯
 * <p>
 * Solution:动态规划 dp[n] = dp[n-1] + dp[n-2]
 * <p>
 * Time:O(n),Space:O(1)
 *
 * @Link: https://leetcode-cn.com/problems/climbing-stairs/description/
 * @Author: liuchen created at 15:34 2020-10-22
 */
public class Solution5 {

    public int climbStairs(int n) {
        if (n < 1) {
            return 0;
        }
        if (n < 3) {
            return n;
        }
        int preOne = 2;
        int preTwo = 1;
        for (int i = 3; i < n; i++) {
            int tmp = preOne;
            preOne += preTwo;
            preTwo = tmp;
        }
        return preOne + preTwo;
    }

    public static void main(String[] args) {
        int n = 4;
        Solution5 s = new Solution5();
        System.out.println(s.climbStairs(n));
    }
}
