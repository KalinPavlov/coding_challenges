package challenge_10;

public class Solution {

    public static int[] getRange(int[] arr, int x) {
        int counter = 0; // 1
        int lastIndex = -1; // 1

        for (int index = 0; index < arr.length; index++) { // n + 1
            if (arr[index] == x) { // 1
                counter++; // 1
                lastIndex = index; // 1
            }
        }

        if (counter == 0) { // 1
            return new int[]{lastIndex, lastIndex}; // 1
        }

        return new int[]{lastIndex - counter + 1, lastIndex}; // 1

        // O(n)
    }
}
