package q51_n_queens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * N皇后
 * <p>
 * Solution: 回溯+剪枝
 * <p>
 * Time: , Space:
 *
 * @Link: https://leetcode-cn.com/problems/n-queens/
 * @Author: liuchen created at 14:55 5/12/2020
 */
public class Solution {
    public List<List<String>> solveNQueens(int n) {
        // 非法参数
        if (n <= 0) {
            return Collections.emptyList();
        }
        // 初始化棋盘
        char[][] chess = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = '.';
            }
        }
        List<List<String>> lists = new ArrayList<>();
        solve(chess, 0, lists);
        return lists;
    }

    private void solve(char[][] chess, int row, List<List<String>> lists) {
        if (row == chess.length) {
            lists.add(construct(chess));
            return;
        }
        for (int col = 0; col < chess.length; col++) {
            if (valid(chess, row, col)) {
                chess[row][col] = 'Q';
                solve(chess, row + 1, lists);
                chess[row][col] = '.';
            }
        }
    }

    private boolean valid(char[][] chess, int row, int col) {
        // 判断之前走过的行，在这列是否有Q
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }
        // 判断右上角是否有Q
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        // 判断左上角是否有Q
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> construct(char[][] chess) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < chess.length; i++) {
            path.add(new String(chess[i]));
        }
        return path;
    }

    public static void main(String[] args) {
        int n = 8;
        Solution s = new Solution();
        System.out.println(s.solveNQueens(n));
    }
}
