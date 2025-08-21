package p1553;

import classes.AssetUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mengyuantan
 * @date 2025/8/13 15:09
 */
public class MinDays {

    static class Solution {
        public static int minDays(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            if (n >= 2) {
                dp[2] = 2;
            }

            for (int i = 3; i <= n; i++) {
                int planA = (i % 2 == 0) ? dp[i / 2] + 1 : Integer.MAX_VALUE;
                int planB = (i % 3 == 0) ? dp[i / 3] + 1 : Integer.MAX_VALUE;
                int planC = dp[i - 1] + 1;
                dp[i] = Math.min(planA, Math.min(planB, planC));
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        AssetUtil.assertEqual(Solution.minDays(10), 4);
        AssetUtil.assertEqual(Solution.minDays(6), 3);
        AssetUtil.assertEqual(Solution.minDays(1), 1);
        AssetUtil.assertEqual(Solution.minDays(56), 6);
        AssetUtil.assertEqual(Solution.minDays(9209408), 23);
        AssetUtil.assertEqual(Solution.minDays(61455274), 29);
    }
}
