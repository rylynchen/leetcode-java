package q77_combinations;

import java.util.*;

/**
 * 组合
 * <p>
 * Solution:
 * <p>
 * Time:O(n^k), Space:O(n)
 *
 * @Link: https://leetcode-cn.com/problems/combinations/
 * @Author: liuchen created at 23:13 7/11/2020
 */
public class Solution {
    private List<List<Integer>> lists;
    private Deque<Integer> path;

    public List<List<Integer>> combine(int n, int k) {
        lists = new ArrayList<>();
        if (k <= 0 || n < k) {
            return lists;
        }
        path = new ArrayDeque<>();
        dfs(n, k, 1);
        return lists;
    }

    private void dfs(int n, int k, int begin) {
        // 终止条件：path长度等于k
        if (path.size() == k) {
            lists.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n; i++) {
            path.addLast(i);
            System.out.println("before :" + path);
            dfs(n, k, i + 1);
            System.out.println("after :" + path);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        Solution s = new Solution();
        for (List<Integer> list : s.combine(n, k)) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
