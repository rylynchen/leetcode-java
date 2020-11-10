package q46_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全排列
 * <p>
 * Solution:
 * <p>
 * Time:O(n*n!),Space:O(n!)
 *
 * @Link: https://leetcode-cn.com/problems/permutations/
 * @Author: liuchen created at 08:07 8/11/2020
 */
public class Solution {

    private List<List<Integer>> lists;
    private List<Integer> path;
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length < 1) {
            return lists;
        }
        lists = new ArrayList<>();
        path = new ArrayList<>();
        used = new boolean[nums.length];
        dfs(nums, 0);
        return lists;
    }

    private void dfs(int[] nums, int depth) {
        if (depth == nums.length) {
            lists.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                System.out.println("before: " + path);
                dfs(nums, depth + 1);
                System.out.println("after: " + path);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Solution s = new Solution();
        for (List<Integer> list : s.permute(nums)) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}
