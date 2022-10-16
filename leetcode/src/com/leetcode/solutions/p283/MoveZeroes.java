package p283;

import java.util.Arrays;

/**
 * @author mengyuantan
 * @date 2022/10/16 21:20
 */
public class MoveZeroes {

    static class Solution {
        public static void moveZeroes(int[] nums) {
            int latestIndex = 0;
            boolean containZero = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0 && !containZero) {
                    containZero = true;
                    latestIndex = i;
                }

                if (containZero && nums[i] != 0) {
                    nums[latestIndex] = nums[i];
                    latestIndex++;
                }
            }

            if (containZero) {
                for (int i = latestIndex; i < nums.length; i++) {
                    nums[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] {0, 1, 0, 3, 12};
        Solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
