package q70_climbing_stairs;

/**
 * @Description:
 * @Author: liuchen created at 15:34 2020-10-22
 */
public class Solution4 {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int preTwo = 1;
        int preOne = 2;
        for(int i = 3; i<n; i++) {
            int tmp = preTwo;
            preTwo = preOne;
            preOne = tmp + preOne;
        }
        return preOne + preTwo;
    }

    public static void main(String[] args) {
        int n = 3;
        Solution4 s = new Solution4();
        System.out.println(s.climbStairs(n));
    }
}
