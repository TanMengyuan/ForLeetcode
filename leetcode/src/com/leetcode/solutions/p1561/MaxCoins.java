package p1561;

import classes.AssetUtil;

import java.util.Arrays;

/**
 * @author mengyuantan
 * @date 2022/11/6 22:06
 */
public class MaxCoins {

    static class Solution {
        public static int maxCoins(int[] piles) {
            if (piles.length < 3) {
                return 0;
            }

            Arrays.sort(piles);
            int length = piles.length;
            int n = piles.length / 3;
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += piles[length - 2 * i - 2];
            }

            return res;
        }
    }

    public static void main(String[] args) {
        int[] plies1 = new int[] {2, 4, 1, 2, 7, 8};
        AssetUtil.assertEqual(Solution.maxCoins(plies1), 9);

        int[] plies2 = new int[] {2, 4, 5};
        AssetUtil.assertEqual(Solution.maxCoins(plies2), 4);

        int[] plies3 = new int[] {9, 8, 7, 6, 5, 1, 2, 3, 4};
        AssetUtil.assertEqual(Solution.maxCoins(plies3), 18);

        System.out.println("done.");
    }
}
