package challenge_14;

public class  Solution {

    public static boolean isNotDecreasing(int[] arr) {
        if (arr.length < 2) {
            return true;
        }

        boolean isOneChanged = false;

        for (int index = 0; index < arr.length - 1; index++) {
            int current = arr[index];
            int next = arr[index + 1];

            if (current > next) {
                if (isOneChanged) {
                    return false;
                }
                isOneChanged = true;
            }
        }

        return true;
    }
}
