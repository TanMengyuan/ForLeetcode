package p552;

import classes.AssetUtil;

/**
 * @author mengyuantan
 * @date 2022/10/23 20:23
 */
public class CheckRecord {

    @SuppressWarnings("all")
    static class Solution {
        public static int checkRecord(int n) {
            final int MOD = 1000000007;
            long[][][] dp = new long[n][2][3];

            dp[0][0][0] = 1;
            dp[0][1][0] = 1;
            dp[0][0][1] = 1;

            for (int i = 1; i < n; i++) {
                dp[i][0][0] = (dp[i - 1][0][0] + dp[i - 1][0][1] + dp[i - 1][0][2]) % MOD;
                dp[i][1][0] = (dp[i - 1][1][0] + dp[i - 1][1][1] + dp[i - 1][1][2]) % MOD;

                dp[i][1][0] = (dp[i][1][0] + dp[i - 1][0][0] + dp[i - 1][0][1] + dp[i - 1][0][2]) % MOD;

                dp[i][0][1] = dp[i - 1][0][0];
                dp[i][0][2] = dp[i - 1][0][1];
                dp[i][1][1] = dp[i - 1][1][0];
                dp[i][1][2] = dp[i - 1][1][1];
            }

            long ans = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    ans = (ans + dp[n - 1][i][j]) % MOD;
                }
            }

            return (int) ans;
        }
    }

    public static void main(String[] args) {
        int n1 = 2;
        AssetUtil.assertEqual(Solution.checkRecord(n1), 8);

        int n2 = 1;
        AssetUtil.assertEqual(Solution.checkRecord(n2), 3);

        int n3 = 10101;
        AssetUtil.assertEqual(Solution.checkRecord(n3), 183236316);

        System.out.println("done");
    }
}
