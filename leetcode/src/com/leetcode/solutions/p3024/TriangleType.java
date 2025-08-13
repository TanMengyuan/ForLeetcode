package p3024;

import java.util.Arrays;

/**
 * @author mengyuantan
 * @date 2025/7/11 16:18
 */
public class TriangleType {

    static class Solution {
        public static String triangleType(int[] nums) {
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            }

            if (nums[0] >= nums[1] + nums[2] || nums[1] >= nums[0] + nums[2] || nums[2] >= nums[0] + nums[1]) {
                return "none";
            }

            if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) {
                return "isosceles";
            }

            return "scalene";
        }
    }
}
