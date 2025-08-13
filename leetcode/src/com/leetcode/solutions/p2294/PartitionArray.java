package p2294;

import classes.AssetUtil;

import java.util.Arrays;

/**
 * @author mengyuantan
 * @date 2025/7/11 16:57
 */
public class PartitionArray {

    static class Solution {
        public static int partitionArray(int[] nums, int k) {
            Arrays.sort(nums);
            int result = 1;
            int minNum = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (minNum + k < nums[i]) {
                    result++;
                    minNum = nums[i];
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        AssetUtil.assertEqual(Solution.partitionArray(new int[] {3, 6, 1, 2, 5}, 2), 2);
        AssetUtil.assertEqual(Solution.partitionArray(new int[] {1, 2, 3}, 1), 2);
        AssetUtil.assertEqual(Solution.partitionArray(new int[] {2, 2, 4, 5}, 0), 3);
    }
}
