package q547_friend_circles;

import java.util.Arrays;

/**
 * 朋友圈
 * <p>
 * Solution: 并查集
 *
 * @Link: https://leetcode-cn.com/problems/friend-circles/
 * @Author: liuchen created at 23:44 3/12/2020
 */
public class Solution {

    private int[] parent;

    public int findCircleNum(int[][] M) {
        parent = new int[M.length];
        Arrays.fill(parent, -1);
        for (int i = 0; i < M.length; i++) {
            for (int j = i + 1; j < M.length; j++) {
                if (M[i][j] == 1) {
                    union(i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1) {
                count++;
            }
        }
        return count;
    }

    private void union(int x, int y) {
        int xset = find(x);
        int yset = find(y);
        if (xset != yset) {
            parent[xset] = yset;
        }
    }

    private int find(int x) {
        if (parent[x] < 0) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public static void main(String[] args) {
        int[][] m = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        Solution s = new Solution();
        System.out.println(s.findCircleNum(m));
    }
}
