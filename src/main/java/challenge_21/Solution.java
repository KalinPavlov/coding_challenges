package challenge_21;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public static boolean findPythagoreanTriplets(int[] arr) {
        Set<Integer> squared = Arrays.stream(arr).map(n -> n * n).boxed().collect(Collectors.toSet());

        for (int index = 0; index < arr.length; index++) {
            arr[index] *= arr[index];
        }

        for (int index = 0; index < arr.length; index++) {
            for (int index1 = index + 1; index1 < arr.length; index1++) {
                if (squared.contains(arr[index] + arr[index1])) {
                    return true;
                }
            }
        }

        return false;
    }
}
