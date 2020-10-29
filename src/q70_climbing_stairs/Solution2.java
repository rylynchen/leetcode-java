package q70_climbing_stairs;

/**
 * @Description:
 * @Author: liuchen created at 15:34 2020-10-22
 */
public class Solution2 {

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int preTwo = 1;
        int preOne = 2;
        for (int i = 3; i < n; i++) {
            int tmp = preOne;
            preOne = preOne + preTwo;
            preTwo = tmp;
        }
        return preOne + preTwo;
    }

    public static void main(String[] args) {
        int n = 4;
        Solution2 s = new Solution2();
        System.out.println(s.climbStairs(n));
    }
}
