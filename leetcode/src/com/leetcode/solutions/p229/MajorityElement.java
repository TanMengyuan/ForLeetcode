package p229;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author mengyuantan
 * @date 2022/9/18 17:40
 */
public class MajorityElement {

    static class Solution {
        public static List<Integer> majorityElement(int[] nums) {
            final int threshold = nums.length / 3;
            final Map<Integer, AtomicInteger> records = new HashMap<>(nums.length);
            for (int num : nums) {
                records.computeIfAbsent(num, key -> new AtomicInteger(0)).incrementAndGet();
            }

            final List<Integer> results = new ArrayList<>();
            for (Map.Entry<Integer, AtomicInteger> entry : records.entrySet()) {
                if (entry.getValue().get() > threshold) {
                    results.add(entry.getKey());
                }
            }
            return results;
        }
    }


    public static void main(String[] args) {
        int[] input1 = new int[]{3, 2, 3};
        List<Integer> output1 = Collections.singletonList(3);

        assert Objects.equals(Solution.majorityElement(input1), output1);

        int[] input2 = new int[]{1};
        List<Integer> output2 = Collections.singletonList(1);

        assert Objects.equals(Solution.majorityElement(input2), output2);

        int[] input3 = new int[]{1, 1};
        List<Integer> output3 = Arrays.asList(1, 2);

        assert Objects.equals(Solution.majorityElement(input3), output3);

        System.out.println("done");
    }
}
