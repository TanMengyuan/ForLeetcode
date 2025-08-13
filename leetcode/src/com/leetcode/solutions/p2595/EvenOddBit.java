package p2595;

import classes.AssetUtil;

/**
 * @author mengyuantan
 * @date 2025/7/11 17:29
 */
public class EvenOddBit {

    static class Solution {
        public static int[] evenOddBit(int n) {
            int even = 0;
            int odd = 0;
            int index = 0;

            while (n > 0) {
                if ((n & 1) == 1) {
                    if (index % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }
                n >>= 1;
                index++;
            }

            return new int[]{even, odd};
        }
    }

    public static void main(String[] args){
        final int[] res = Solution.evenOddBit(50);
        AssetUtil.assertEqual(res[0], 1);
        AssetUtil.assertEqual(res[1], 2);
    }
}
