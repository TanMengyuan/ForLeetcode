package p474;

import classes.AssetUtil;

/**
 * @author mengyuantan
 * @date 2022/9/18 19:45
 */
public class FindMaxForm {

    static class Solution {
        public static int findMaxForm(String[] strs, int m, int n) {
            if (strs.length == 0) {
                return 0;
            }

            int[][] dp = new int[m + 1][n + 1];
            for (String str : strs) {
                int zeros = 0;
                int ones = 0;
                for (char each : str.toCharArray()) {
                    switch (each) {
                        case '0':
                            zeros++;
                            break;
                        case '1':
                            ones++;
                            break;
                        default:
                            // should not use this
                    }
                }

                for (int i = m; i >= zeros; i--) {
                    for (int j = n; j >= ones; j--) {
                        dp[i][j] = Math.max(dp[i][j], 1 + dp[i - zeros][j - ones]);
                    }
                }
            }

            return dp[m][n];
        }
    }

    public static void main(String[] args) {
        String[] input1 = new String[] {"10", "0001", "111001", "1", "0"};
        int m1 = 5;
        int n1 = 3;
        int output1 = 4;
        AssetUtil.assertEqual(Solution.findMaxForm(input1, m1, n1), output1);

        String[] input2 = new String[] {"10", "0", "1"};
        int m2 = 1;
        int n2 = 1;
        int output2 = 2;
        AssetUtil.assertEqual(Solution.findMaxForm(input2, m2, n2), output2);

        System.out.println("done");
    }
}
