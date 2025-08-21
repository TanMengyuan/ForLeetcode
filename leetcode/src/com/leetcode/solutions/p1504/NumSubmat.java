package p1504;

import classes.AssetUtil;

/**
 * @author mengyuantan
 * @date 2025/8/21 16:00
 */
public class NumSubmat {

    static class Solution {
        public static int numSubmat(int[][] mat) {
            int m = mat.length, n = mat[0].length;
            int[] heights = new int[n];
            long ans = 0;

            int[][] stack = new int[n][2];
            int top;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    heights[j] = (mat[i][j] == 0) ? 0 : heights[j] + 1;
                }

                long cur = 0;
                top = -1;

                for (int j = 0; j < n; j++) {
                    int h = heights[j];
                    int cnt = 1;

                    while (top >= 0 && stack[top][0] >= h) {
                        int hOld = stack[top][0];
                        int cOld = stack[top][1];
                        top--;
                        cur -= (long) cOld * (hOld - h);
                        cnt += cOld;
                    }

                    cur += h;
                    stack[++top][0] = h;
                    stack[top][1] = cnt;

                    ans += cur;
                }
            }

            return (int) ans;
        }
    }

    public static void main(String[] args) {
        // 输入：mat = [[1,0,1],[1,1,0],[1,1,0]]
        // 输出：13
        int[][] mat1 = new int[][] {new int[] {1, 0, 1}, new int[] {1, 1, 0}, new int[] {1, 1, 0}};
        AssetUtil.assertEqual(Solution.numSubmat(mat1), 13);

        // 输入：mat = [[0,1,1,0],[0,1,1,1],[1,1,1,0]]
        // 输出：24
        int[][] mat2 =
                new int[][] {
                    new int[] {0, 1, 1, 0}, new int[] {0, 1, 1, 1}, new int[] {1, 1, 1, 0}
                };
        AssetUtil.assertEqual(Solution.numSubmat(mat2), 24);

        System.out.println("done.");
    }
}
