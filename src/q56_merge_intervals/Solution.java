package q56_merge_intervals;

import java.util.Arrays;

/**
 * 合并区间
 * <p>
 * Solution:
 * 先对数组以左节点ASC排序，
 * 然后遍历数组，判断 左>前一个右
 * 是则无交集
 * 否则有交集，更新前一个元素的右节点=MAX(pre.right, cur.right)
 * <p>
 * Time:O(nlogn), Space:O(1)
 *
 * @Link: https://leetcode-cn.com/problems/merge-intervals/
 * @Author: liuchen created at 16:04 12/12/2020
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        Solution s = new Solution();
        s.merge(intervals);
    }
}
