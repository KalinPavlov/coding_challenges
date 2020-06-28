package challenge_6;

public class Solution {

    public static int findKthLargest(int[] input, int k) {
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            int pivotIndex = partition(input, left, right);
            if (pivotIndex == input.length - k) {
                return input[pivotIndex];
            } else if (pivotIndex > input.length - k) {
                right = pivotIndex - 1;
            } else {
                left = pivotIndex + 1;
            }
        }
        return -1;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int index = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[high];
        arr[high] = temp;

        return index;
    }
}
