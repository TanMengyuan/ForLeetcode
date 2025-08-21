package p2918;

import classes.AssetUtil;

/**
 * @author mengyuantan
 * @date 2025/8/21 16:22
 */
public class MinSum {

    static class Solution {
        public static long minSum(int[] nums1, int[] nums2) {
            long sum1 = 0;
            long sum2 = 0;
            long zeroNum1 = 0;
            long zeroNum2 = 0;

            for (int i : nums1) {
                if (i == 0) zeroNum1++;
                sum1 += i;
            }

            for (int i : nums2) {
                if (i == 0) zeroNum2++;
                sum2 += i;
            }

            if (zeroNum1 == 0 && zeroNum2 == 0) {
                return sum1 == sum2 ? sum1 : -1;
            }

            long minSum1 = sum1 + zeroNum1;
            long minSum2 = sum2 + zeroNum2;

            if (minSum1 == minSum2) {
                return minSum1;
            } else if (minSum1 > minSum2) {
                if (zeroNum1 <= zeroNum2 || zeroNum2 != 0) {
                    return minSum1;
                } else {
                    return -1;
                }
            } else {
                if (zeroNum1 >= zeroNum2 || zeroNum1 != 0) {
                    return minSum2;
                } else {
                    return -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 输入：nums1 = [3,2,0,1,0], nums2 = [6,5,0]
        // 输出：12
        AssetUtil.assertEqual(Solution.minSum(new int[] {3, 2, 0, 1, 0}, new int[] {6, 5, 0}), 12L);

        // 输入：nums1 = [2,0,2,0], nums2 = [1,4]
        // 输出：-1
        AssetUtil.assertEqual(Solution.minSum(new int[] {2, 0, 2, 0}, new int[] {1, 4}), -1L);

        AssetUtil.assertEqual(
                Solution.minSum(
                        new int[] {0, 7, 28, 17, 18}, new int[] {1, 2, 6, 26, 1, 0, 27, 3, 0, 30}),
                98L);
        AssetUtil.assertEqual(
                Solution.minSum(
                        new int[] {0, 16, 28, 12, 10, 15, 25, 24, 6, 0, 0},
                        new int[] {20, 15, 19, 5, 6, 29, 25, 8, 12}),
                139L);
    }
}
