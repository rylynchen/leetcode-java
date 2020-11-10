package q941_valid_mountain_array;

/**
 * 有效的山脉数组
 * <p>
 * Time: O(n), Space: O(1)
 *
 * @Link: https://leetcode-cn.com/problems/valid-mountain-array/
 * @Author: liuchen created at 13:33 2020-11-03
 */
public class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        boolean up = true;
        int upSize = 0;
        for (int i = 0; i < A.length; i++) {
            if (up) {
                if (i > 0 && A[i] < A[i - 1]) {
                    up = false;
                } else {
                    upSize++;
                }
            } else {
                if (A[i] >= A[i - 1]) {
                    return false;
                }
            }
        }
        return !up && upSize > 1;
    }

    public static void main(String[] args) {
//        int[] a = new int[] {3,5,5};
//        int[] a = new int[] {2,1};
        int[] a = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Solution s = new Solution();
        System.out.println(s.validMountainArray(a));
    }
}
