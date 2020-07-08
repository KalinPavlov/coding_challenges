package challenge_18;

import java.util.Stack;

public class MaxStack {
    private final Stack<Integer> stack = new Stack<>();
    private final Stack<int[]> maxCache = new Stack<>();

    public void push(int n) {
        if (stack.isEmpty()) {
            maxCache.push(new int[]{n, 1});
        }

        if (maxCache.peek()[0] == n) {
            int[] max = maxCache.pop();
            max[1]++;
            maxCache.push(max);
        } else if (maxCache.peek()[0] < n) {
            maxCache.push(new int[]{n, 1});
        }

        stack.push(n);
    }

    public int pop() {
        int res = stack.pop();
        int[] max = maxCache.peek();
        if (max[0] == res) {
            if (max[1] > 1) {
                max[1]--;
            } else {
                maxCache.pop();
            }
        }

        return res;
    }

    public int max() {
        if (!maxCache.isEmpty()) {
            return maxCache.peek()[0];
        }

        return 0;
    }
}
