package challenge_7;

import java.util.*;

public class Solution {
    private static final int SUM = 8;
    public static List<int[]> findDoubles(int[] numbers) {
        final Set<Integer> nums = new HashSet<>();
        Arrays.stream(numbers).forEach(n -> nums.add(n));

        List<int[]> result = new ArrayList<>();
        Arrays.stream(numbers).forEach(n -> {
            int addition = SUM - n;
            if (nums.contains(addition)) {
                result.add(new int[]{n, addition});
                nums.remove(n);
                nums.remove(addition);
            }
        });

        return result;
    }
}
