package q11_container_with_most_water;

/**
 * @Description:
 * @Author: liuchen created at 15:11 2020-10-22
 */
public class Solution {
    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while (i < j) {
            area = Math.max(area, (j-i) * Math.min(height[i],  height[j]));
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        Solution s = new Solution();
        System.out.println(s.maxArea(height));
    }
}
