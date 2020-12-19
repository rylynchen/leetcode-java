package q91_decode_ways;

public class Solution2 {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                dp[i] = dp[i - 1];
            }
            String str = s.substring(i - 1, i + 1);
            if (Integer.parseInt(str) >= 10 && Integer.parseInt(str) <= 26) {
                if (i == 1) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[s.length() - 1];
    }

    public static void main(String[] args) {
        String str = "12";
        Solution2 s = new Solution2();
        System.out.println(s.numDecodings(str));
    }
}