package q62_unique_paths;

import java.util.Arrays;

/**
 * 不同路径
 * <p>
 * Solution:动态规划, f(i,j) = f(i,j-1) + f(i-1,j)
 * <p>
 * Time:O(n),Space:O(n)
 *
 * @Link: https://leetcode-cn.com/problems/unique-paths/
 * @Author: liuchen created at 20:29 25/11/2020
 */
public class Solution2 {

    public int uniquePaths(int m, int n) {
        int[] line = new int[n];
        Arrays.fill(line, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                line[j] += line[j - 1];// 等于 f(i,j) = f(i-1,j) + f(i, j-1)
            }
        }
        return line[n - 1];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        Solution2 s = new Solution2();
        System.out.println(s.uniquePaths(m, n));
    }
}
