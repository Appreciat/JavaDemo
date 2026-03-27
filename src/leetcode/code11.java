package leetcode;

public class code11 {
    class Solution {
        public int maxArea(int[] height) {
            int n = height.length;
            int maxArea = 0;

            for(int i = 0;i < n;i++){
                for(int j = i + 1;j < n;j++){
                    int width = j - i;
                    int heigt = Math.min(height[i],height[j]);
                    maxArea = Math.max(maxArea,heigt * width);
                }
            }
            return maxArea;
        }
    }

    public static void main(String[] args) {
        Solution solution = new code11().new Solution();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
