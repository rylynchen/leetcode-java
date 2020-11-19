package q455_assign_cookies;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * 分发饼干
 * <p>
 * Solution:
 * <p>
 * Time:, Space:
 *
 * @Link: https://leetcode-cn.com/problems/assign-cookies/description/
 * @Author: liuchen created at 11:03 14/11/2020
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length <= 0 || s.length <= 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>(s.length);
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i : s) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            set.add(i);
        }
        int n = 0;
        for (int i : g) {
            for (Integer j : set) {
                if (j >= i && map.get(j) > 0) {
                    map.put(j, map.get(j) - 1);
                    ++n;
                    break;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1, 2};
        int[] s = new int[]{1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.findContentChildren(g, s));
    }
}
