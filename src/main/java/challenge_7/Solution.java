package challenge_7;

import java.util.*;

public class Solution {
    private static final int SUM = 8;
    public static List<int[]> findDoubles(int[] numbers) {
        final Set<Integer> nums = new HashSet<>(); // 1
        Arrays.stream(numbers).forEach(n -> nums.add(n)); // n

        List<int[]> result = new ArrayList<>(); // 1
        Arrays.stream(numbers).forEach(n -> { // n
            int addition = SUM - n; // 1
            if (nums.contains(addition)) { // 1
                result.add(new int[]{n, addition}); // 1
                nums.remove(n); // 1
                nums.remove(addition); // 1
            }
        });

        return result; // 1

        // O(n)
    }
}
