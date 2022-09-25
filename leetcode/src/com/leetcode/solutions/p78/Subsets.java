package p78;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengyuantan
 * @date 2022/9/25 20:19
 */
public class Subsets {

    static class Solution {
        public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            for (int num : nums) {
                final int size = res.size();
                for (int i = 0; i < size; i++) {
                    List<Integer> pre = res.get(i);
                    List<Integer> each = new ArrayList<>(pre);
                    each.add(num);

                    res.add(each);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3};
        // result not fixed, so should not use asset here
        System.out.println(Solution.subsets(input1));

        int[] input2 = new int[]{0};
        System.out.println(Solution.subsets(input2));
    }
}
