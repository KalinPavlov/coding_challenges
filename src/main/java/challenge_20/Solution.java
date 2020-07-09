package challenge_20;

import java.util.Arrays;

public class Solution {

    public static int[] multiplied(int[] input) {
        if (input == null) {
            return null;
        } else if (input.length < 2) {
            return new int[]{1};
        }

        int res = Arrays.stream(input).reduce(1, (a, b) -> a * b);

        int[] output = new int[input.length];

        for (int index = 0; index < output.length; index++) {
            output[index] = res / input[index];
        }

        return output;
    }

    public static int[] multipliedWithoutDivision(int[] input) {
        if (input == null) {
            return null;
        } else if (input.length < 2) {
            return new int[]{1};
        }

        int[] res = new int[input.length];

        for (int index = 0; index < input.length; index++) {
            swap(input, index, 0);
            int m = Arrays.stream(input).skip(1).reduce(1, (a, b) -> a * b);
            res[index] = m;
            swap(input, 0, index);
        }

        return res;
    }

    @SuppressWarnings("")
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
