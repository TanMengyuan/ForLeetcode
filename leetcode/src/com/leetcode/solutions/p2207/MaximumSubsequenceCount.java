package p2207;

import classes.AssetUtil;

/**
 * @author mengyuantan
 * @date 2022/10/5 16:58
 */
public class MaximumSubsequenceCount {

    static class Solution {
        public static long maximumSubsequenceCount(String text, String pattern) {
            final char a = pattern.charAt(0);
            final char b = pattern.charAt(1);

            long aCount = 0, bCount = 0;
            long sum = 0;
            for (char curChar : text.toCharArray()) {
                if (curChar == a) {
                    aCount++;
                }

                if (curChar == b) {
                    bCount++;
                    sum += aCount;
                }
            }

            return a == b ? sum : Math.max(aCount, bCount) + sum;
        }
    }

    public static void main(String[] args) {
        String text1 = "abdcdbc";
        String pattern1 = "ac";
        AssetUtil.assertEqual(Solution.maximumSubsequenceCount(text1, pattern1), 4L);

        String text2 = "aabb";
        String pattern2 = "ab";
        AssetUtil.assertEqual(Solution.maximumSubsequenceCount(text2, pattern2), 6L);

        String text3 = "vnedkpkkyxelxqptfwuzcjhqmwagvrglkeivowvbjdoyydnjrqrqejoyptzoklaxcjxbrrfmpdxckfjzahparhpanwqfjrpbslsyiwbldnpjqishlsuagevjmiyktgofvnyncizswldwnngnkifmaxbmospdeslxirofgqouaapfgltgqxdhurxljcepdpndqqgfwkfiqrwuwxfamciyweehktaegynfumwnhrgrhcluenpnoieqdivznrjljcotysnlylyswvdlkgsvrotavnkifwmnvgagjykxgwaimavqsxuitknmbxppgzfwtjdvegapcplreokicxcsbdrsyfpustpxxssnouifkypwqrywprjlyddrggkcglbgcrbihgpxxosmejchmzkydhquevpschkpyulqxgduqkqgwnsowxrmgqbmltrltzqmmpjilpfxocflpkwithsjlljxdygfvstvwqsyxlkknmgpppupgjvfgmxnwmvrfuwcrsadomyddazlonjyjdeswwznkaeaasyvurpgyvjsiltiykwquesfjmuswjlrphsdthmuqkrhynmqnfqdlwnwesdmiiqvcpingbcgcsvqmsmskesrajqwmgtdoktreqssutpudfykriqhblntfabspbeddpdkownehqszbmddizdgtqmobirwbopmoqzwydnpqnvkwadajbecmajilzkfwjnpfyamudpppuxhlcngkign";
        String pattern3 = "rr";
        AssetUtil.assertEqual(Solution.maximumSubsequenceCount(text3, pattern3), 496L);

        System.out.println("done");
    }
}
