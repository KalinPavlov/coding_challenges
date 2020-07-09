package challenge_20;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        int[] input = new int[]{1, 2, 3, 4, 5};

        int[] actual = Solution.multiplied(input);

        int[] expected = {120, 60, 40, 30, 24};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolution1() {
        int[] input = new int[]{3, 2, 1};

        int[] actual = Solution.multiplied(input);

        int[] expected = {2, 3, 6};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolutionNoDivision() {
        int[] input = new int[]{1, 2, 3, 4, 5};

        int[] actual = Solution.multipliedWithoutDivision(input);

        int[] expected = {120, 60, 40, 30, 24};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSolutionNoDivision1() {
        int[] input = new int[]{3, 2, 1};

        int[] actual = Solution.multipliedWithoutDivision(input);

        int[] expected = {2, 3, 6};

        Assert.assertArrayEquals(expected, actual);
    }
}
