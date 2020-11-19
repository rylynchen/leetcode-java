package q455_assign_cookies;

import java.util.Arrays;

/**
 * 分发饼干
 * <p>
 * Solution: <贪心算法>先分别对G,S排序，然后双指针思路往下走，满足S[j]>=G[i]时计数器+1
 * <p>
 * Time: O(n), Space: O(1)
 *
 * @Link: https://leetcode-cn.com/problems/assign-cookies/description/
 * @Author: liuchen created at 11:03 14/11/2020
 */
public class Solution2 {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length <= 0 || s.length <= 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int i = 0;
        int j = 0;
        while (i != g.length && j != s.length) {
            if (s[j] >= g[i]) {
                ++result;
                ++i;
            }
            ++j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1, 2};
        int[] s = new int[]{1, 2, 3};
        Solution2 solution = new Solution2();
        System.out.println(solution.findContentChildren(g, s));
    }
}
