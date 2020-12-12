package q36_valid_sudoku;

/**
 * 有效的数独
 * <p>
 * Solution: 遍历一遍，同时记录 行/列/BOX 中已出现的数字，遇到重复则失败, 其中9x9里i,j定位box=j/3+(i/3)*3
 * <p>
 * Time:O(n),Space:O(n)
 *
 * @Link: https://leetcode-cn.com/problems/valid-sudoku/description/
 * @Author: liuchen created at 15:48 5/12/2020
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][10];
        int[][] cols = new int[9][10];
        int[][] boxes = new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // 空，跳过
                if (board[i][j] == '.') {
                    continue;
                }
                int num = Integer.parseInt(String.valueOf(board[i][j]));
                if (rows[i][num] == 1) {
                    return false;
                }
                if (cols[j][num] == 1) {
                    return false;
                }
                int boxIdx = j / 3 + (i / 3) * 3;
                if (boxes[boxIdx][num] == 1) {
                    return false;
                }
                rows[i][num] = 1;
                cols[j][num] = 1;
                boxes[boxIdx][num] = 1;
            }
        }
        return true;
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
        System.out.println(s.isValidSudoku(board));
    }
}
