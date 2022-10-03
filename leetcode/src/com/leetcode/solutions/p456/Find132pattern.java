package p456;

import classes.AssetUtil;

import java.util.Stack;

/**
 * @author mengyuantan
 * @date 2022/9/25 22:48
 */
public class Find132pattern {

    // todo: https://leetcode.cn/problems/132-pattern/
    static class Solution {
        public static boolean find132pattern(int[] nums) {
            int n = nums.length;
            if (n < 3) {
                return false;
            }

            int secondValue = Integer.MIN_VALUE;
            Stack<Integer> thirdStack = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                final int cur = nums[i];
                if (cur < secondValue) {
                    return true;
                }

                while (!thirdStack.isEmpty() && thirdStack.peek() < cur) {
                    secondValue = thirdStack.pop();
                }

                thirdStack.push(cur);
            }

            return false;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3, 4};
        AssetUtil.assertEqual(Solution.find132pattern(input1), false);

        int[] input2 = new int[]{3, 1, 4, 2};
        AssetUtil.assertEqual(Solution.find132pattern(input2), true);

        int[] input3 = new int[]{-1, 3, 2, 0};
        AssetUtil.assertEqual(Solution.find132pattern(input3), true);

        System.out.println("done");
    }
}
