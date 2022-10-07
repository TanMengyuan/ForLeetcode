package p1920;

/**
 * @author mengyuantan
 * @date 2022/10/7 16:14
 */
public class BuildArray {

    static class Solution {
        public static int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                // emmm, so simple...
                ans[i] = nums[nums[i]];
            }

            return ans;
        }
    }
}
