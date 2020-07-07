package challenge_13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static boolean twoSum(int[] arr, int target) {
        final Set<Integer> table = new HashSet<>();
        Arrays.stream(arr).forEach(table::add);

        for (int n : arr) {
            int diff = target - n;
            if (table.contains(diff)) {
                return true;
            }
        }

        return false;
    }
}
