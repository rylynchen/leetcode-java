package q37_sudoku_solver;

/**
 * 解数独
 * <p>
 * Solution:
 * 先根据board 初始化 行/列/块 中已使用的数字
 * 遍历board，对每个空位，循环尝试1~9, 每次尝试都验证 行/列/块 是否有重复数字，有则失败
 * <p>
 * Time:O(n), Space: O(n)
 *
 * @Link: https://leetcode-cn.com/problems/sudoku-solver/
 * @Author: liuchen created at 16:51 5/12/2020
 */
public class Solution {
    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] boxes = new boolean[9][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = Integer.parseInt(String.valueOf(board[i][j]));
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[j / 3 + (i / 3) * 3][num] = true;
            }
        }
        solve(board, rows, cols, boxes, 0, 0);
    }

    private boolean solve(char[][] board, boolean[][] rows, boolean[][] cols, boolean[][] boxes, int row, int col) {
        // 最后一列
        if (col == board[0].length) {
            col = 0;
            row++;
            // 最后一行&最后一列
            if (row == board.length) {
                return true;
            }
        }
        // 遇到已填写的，进行下一列
        if (board[row][col] != '.') {
            return solve(board, rows, cols, boxes, row, col + 1);
        }
        for (int num = 1; num <= 9; num++) {
            if (rows[row][num] || cols[col][num] || boxes[col / 3 + (row / 3) * 3][num]) {
                continue;
            }
            rows[row][num] = true;
            cols[col][num] = true;
            boxes[col / 3 + (row / 3) * 3][num] = true;
            board[row][col] = (char) ('0' + num);
            if (solve(board, rows, cols, boxes, row, col + 1)) {
                return true;
            }
            board[row][col] = '.';
            rows[row][num] = false;
            cols[col][num] = false;
            boxes[col / 3 + (row / 3) * 3][num] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        Solution s = new Solution();
        s.solveSudoku(board);
    }
}
