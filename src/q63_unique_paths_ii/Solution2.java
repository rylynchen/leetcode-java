package q63_unique_paths_ii;

/**
 * 不同路径 II
 * <p>
 * Solution: 动态规划,类似q62,f(i,j) = f(i-1,j) + f(i,j-1),基础上 每次i,j坐标过滤下是否障碍物，是则f(i,j)=0
 * <p>
 * Time:O(mn), Space:O(mn)/O(n)
 *
 * @Link: https://leetcode-cn.com/problems/unique-paths-ii/
 * @Author: liuchen created at 09:29 28/11/2020
 */
public class Solution2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] line = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.println(i+","+j);
                if (obstacleGrid[i][j] == 1) {
                    line[j] = 0;
                    continue;
                }
                if (i == 0 && j == 0) {
                    line[j] = 1;
                    continue;
                }
                if (j > 0) {
                    line[j] += line[j - 1];
                }
            }
        }
        return line[n - 1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
//        int[][] obstacleGrid = {{0, 1}, {0, 0}};
        Solution2 s = new Solution2();
        System.out.println(s.uniquePathsWithObstacles(obstacleGrid));
    }
}