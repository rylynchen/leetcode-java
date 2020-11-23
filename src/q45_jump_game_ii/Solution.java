package q45_jump_game_ii;

/**
 * 跳跃游戏 II
 * <p>
 * Time: O(n), Space: O(1)
 *
 * @Link: https://leetcode-cn.com/problems/jump-game-ii/
 * @Author: liuchen created at 12:44 22/11/2020
 */
public class Solution {
    public int jump(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int step = 1;
        int start = 1;
        int end = nums[0];
        while (end < nums.length - 1) {
            int tmp = end;
            for (; start <= tmp; start++) {
                end = Math.max(end, start + nums[start]);
            }
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        Solution s = new Solution();
        System.out.println(s.jump(nums));
    }
}
