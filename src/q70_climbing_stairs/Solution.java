package q70_climbing_stairs;

import java.util.HashMap;

/**
 * 爬楼梯
 *
 * Solution: 核心点，第n阶的方法表达式 f(n) = f(n-1) + f(n-2)
 *
 * Solution1: 动态规划, Time: O(n), Space: O(1)
 * Solution2: 递归, Time: O(2^n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/climbing-stairs/
 * @Author: liuchen created at 15:34 2020-10-22
 */
public class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (this.map.containsKey(n)) {
            return this.map.get(n);
        }
        if (n < 3) {
            return n;
        }
        int m = climbStairs(n - 1) + climbStairs(n - 2);
        this.map.put(n, m);
        return m;
    }

    public static void main(String[] args) {
        int n = 3;
        Solution s = new Solution();
        System.out.println(s.climbStairs(n));
    }
}
