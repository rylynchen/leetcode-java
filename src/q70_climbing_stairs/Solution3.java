package q70_climbing_stairs;

/**
 * @Description:
 * @Author: liuchen created at 15:34 2020-10-22
 */
public class Solution3 {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        Solution3 s = new Solution3();
        System.out.println(s.climbStairs(n));
    }
}
