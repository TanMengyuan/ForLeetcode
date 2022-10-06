package p931;

import classes.AssetUtil;

import java.util.Arrays;

/**
 * @author mengyuantan
 * @date 2022/10/6 20:23
 */
public class MinFallingPathSum {

    static class Solution {
        public static int minFallingPathSum(int[][] matrix) {
            int depth = matrix.length;
            int weight = matrix[0].length;

            int[][] dp = new int[depth][weight + 2];
            for (int[] cur : dp) {
                cur[0] = Integer.MAX_VALUE;
                cur[weight + 1] = Integer.MAX_VALUE;
            }

            System.arraycopy(matrix[depth - 1], 0, dp[depth - 1], 1, weight);

            for (int layer = depth - 2; layer >= 0; layer--) {
                for (int i = 1; i <= weight; i++) {
                    dp[layer][i] =
                            Math.min(
                                            Math.min(dp[layer + 1][i - 1], dp[layer + 1][i]),
                                            dp[layer + 1][i + 1])
                                    + matrix[layer][i - 1];
                }
            }

            return Arrays.stream(dp[0]).min().getAsInt();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 =
                new int[][] {
                    new int[] {2, 1, 3},
                    new int[] {6, 5, 4},
                    new int[] {7, 8, 9}
                };
        AssetUtil.assertEqual(Solution.minFallingPathSum(matrix1), 13);

        int[][] matrix2 =
                new int[][] {
                    new int[] {-19, 57},
                    new int[] {-40, -5}
                };
        AssetUtil.assertEqual(Solution.minFallingPathSum(matrix2), -59);
    }
}
