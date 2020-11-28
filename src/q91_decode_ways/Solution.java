package q91_decode_ways;

/**
 * 解码方法
 * <p>
 * Solution: 动态规划，f(n) = f(n-1) + 1(最后2个数字在1-26内)|0
 * <p>
 * Time:,Space:
 *
 * @Link: https://leetcode-cn.com/problems/decode-ways/
 * @Author: liuchen created at 14:16 28/11/2020
 */
public class Solution {

    public int numDecodings(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) != '0') {
                dp[i] = dp[i - 1];
            }
            String subS = s.substring(i - 1, i + 1);
            if (Integer.parseInt(subS) >= 10 && Integer.parseInt(subS) <= 26) {
                if (i == 1) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        String str = "12";
        Solution s = new Solution();
        System.out.println(s.numDecodings(str));
    }
}