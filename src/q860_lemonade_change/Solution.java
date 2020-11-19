package q860_lemonade_change;

/**
 * 柠檬水找零
 * <p>
 * Solution: <贪心算法>10找零需要5，20找零需要5+10或5+5+5,所以做5和10计数器，收钱时判断是否满足，以及变更计数器
 * <p>
 * Time: O(n), Space: O(1)
 *
 * @Link: https://leetcode-cn.com/problems/lemonade-change/description/
 * @Author: liuchen created at 10:21 14/11/2020
 */
public class Solution {

    public boolean lemonadeChange(int[] bills) {
        int fiveNum = 0;
        int tenNum = 0;
        if (bills.length <= 0) {
            return true;
        }
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fiveNum++;
            } else if (bills[i] == 10) {
                if (fiveNum > 0) {
                    fiveNum--;
                    tenNum++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (fiveNum > 0 && tenNum > 0) {
                    tenNum--;
                    fiveNum--;
                } else if (fiveNum >= 3) {
                    fiveNum -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = new int[]{5, 5, 10, 10, 20};
        Solution s = new Solution();
        System.out.println(s.lemonadeChange(bills));
    }
}
