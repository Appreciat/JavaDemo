package leetcode;

import java.util.*;

public class code15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            Set<List<Integer>> result = new HashSet<List<Integer>>();
            for (int i = 0; i < nums.length - 2; i++) {
                int target = 0 - nums[i];
                Set<Integer> inSet = new HashSet<>();
                for (int j = i + 1; j < nums.length ; j++) {
                    if(inSet.contains(target - nums[j])) {
                       result.add(Arrays.asList(nums[i], target - nums[j], nums[j]));
                    } else {
                        inSet.add(nums[j]);
                    }
                }
            }

            return new ArrayList<>(result);
        }
    }

    public static void main(String[] args) {
        Solution solution = new code15().new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
