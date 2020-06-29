package challenge_10;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testRange1() {
        int[] input = {1, 3, 3, 5, 7, 8, 9, 9, 9, 15};

        int[] actual = Solution.getRange(input, 9);

        Assert.assertArrayEquals(new int[]{6, 8}, actual);
    }

    @Test
    public void testRange2() {
        int[] input = {100, 150, 150, 153};

        int[] actual = Solution.getRange(input, 150);

        Assert.assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    public void testRange3() {
        int[] input = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};

        int[] actual = Solution.getRange(input, 9);

        Assert.assertArrayEquals(new int[]{-1, -1}, actual);
    }

    @Test
    public void testRangeNotFound() {
        int[] input = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};

        int[] actual = Solution.getRange(input, 2);

        Assert.assertArrayEquals(new int[]{1, 4}, actual);
    }
}
