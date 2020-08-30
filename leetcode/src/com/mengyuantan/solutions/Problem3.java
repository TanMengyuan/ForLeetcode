import java.util.HashSet;
import java.util.Set;

/**
 * @author: mengyuantan
 * @date: 2020/8/30 11:59
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Problem3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int res = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            while (charSet.contains(c)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            right++;
            charSet.add(c);
            res = Math.max(res, charSet.size());
        }

        return res;
    }

    public static void main(String[] args) {
        // Assert: res1 == 3; res2 == 1; res3 == 3; res4 == 0; res5 == 1;

        int res1 = lengthOfLongestSubstring("abcabcbb");
        int res2 = lengthOfLongestSubstring("bbbbb");
        int res3 = lengthOfLongestSubstring("pwwkew");
        int res4 = lengthOfLongestSubstring("");
        int res5 = lengthOfLongestSubstring(" ");

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
    }
}
