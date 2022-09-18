package p1513;

import classes.AssetUtil;

/**
 * @author mengyuantan
 * @date 2022/9/18 22:06
 */
public class NumSub {

    static class Solution {
        public static int numSub(String s) {
            if (s.length() == 0) {
                return 0;
            }

            final int base = (int) (Math.pow(10, 9) + 7);
            final String[] ones = s.split("0");
            int res = 0;
            for (String one : ones) {
                if (one.length() == 0) {
                    continue;
                }

                final long len = one.length();
                res += ((1 + len) * len) / 2;
                res %= base;
            }

            return res;
        }
    }

    public static void main(String[] args) {
        String s1 = "0110111";
        int res1 = 9;
        AssetUtil.assertEqual(Solution.numSub(s1), res1);

        String s2 = "101";
        int res2 = 2;
        AssetUtil.assertEqual(Solution.numSub(s2), res2);

        String s3 = "111111";
        int res3 = 21;
        AssetUtil.assertEqual(Solution.numSub(s3), res3);

        String s4 = "1111111111011010011";
        int res4 = 62;
        AssetUtil.assertEqual(Solution.numSub(s4), res4);

        System.out.println("done");
    }
}
