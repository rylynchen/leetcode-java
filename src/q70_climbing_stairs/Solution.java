package q70_climbing_stairs;

import java.util.HashMap;

/**
 * @Description:
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
