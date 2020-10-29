package q299_bulls_and_cows;

import java.util.HashMap;

/**
 * @Description:
 * @Author: liuchen created at 16:39 2020-10-24
 */
class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;
        int b = 0;
        int i = 0;
        int j = 0;
        HashMap<String, Boolean> chars = new HashMap<>(secret.length());
        while (i < secret.length() && j < guess.length()) {
            if (secret.charAt(i) == guess.charAt(j)) {
                a++;
                chars.put(String.valueOf(secret.charAt(i)), true);
            } else {
                chars.put(String.valueOf(secret.charAt(i)), false);
            }
            i++;
            j++;
        }
        for (int k = 0; k < guess.length(); k++) {
            if (!chars.containsKey(String.valueOf(guess.charAt(k)))) {
                continue;
            }
            if (!chars.get(String.valueOf(guess.charAt(k)))) {
                chars.put(String.valueOf(guess.charAt(k)), true);
                b++;
            }
        }
        return a + "A" + b + "B";
    }

    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";
        Solution s = new Solution();
        System.out.println(s.getHint(secret, guess));
    }
}