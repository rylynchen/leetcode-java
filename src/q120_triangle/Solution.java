package q120_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * 三角形最小路径和
 * <p>
 * Solution: 动态规划，f(i,j) = min(f(i-1,j-1), f(i-1,j)) + f(i,j)
 * <p>
 * Time:O(n), Space:O(n)
 *
 * @Link: https://leetcode-cn.com/problems/triangle/description/
 * @Author: liuchen created at 16:43 27/11/2020
 */
public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() <= 0 || triangle.get(0).size() <= 0) {
            return 0;
        }
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        dp[0][0] = triangle.get(0).get(0);
        if (triangle.size() == 1) {
            return dp[0][0];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    // 本行第一位
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == triangle.get(i).size() - 1) {
                    // 本行最后一位
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
                }
                // 最后一行，与min进行比较
                if (i == triangle.size() - 1) {
                    min = Math.min(min, dp[i][j]);
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> line1 = new ArrayList<>();
        line1.add(2);
        List<Integer> line2 = new ArrayList<>();
        line2.add(3);
        line2.add(4);
        List<Integer> line3 = new ArrayList<>();
        line3.add(6);
        line3.add(5);
        line3.add(7);
        List<Integer> line4 = new ArrayList<>();
        line4.add(4);
        line4.add(1);
        line4.add(8);
        line4.add(3);
        triangle.add(line1);
        triangle.add(line2);
        triangle.add(line3);
        triangle.add(line4);
        Solution s = new Solution();
        System.out.println(s.minimumTotal(triangle));
    }
}
