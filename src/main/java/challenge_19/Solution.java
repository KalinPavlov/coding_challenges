package challenge_19;

public class Solution {

    public static int staircaseRec(int n) {
        return fib(n + 1);
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int staircaseIter(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int fibPrev = 1;
        for (int index = 2; index < n + 1; index++) {
            int temp = fib;
            fib += fibPrev;
            fibPrev = temp;
        }

        return fib;
    }
}
