package challenge_12;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSorting() {
        int[] input = {3, 3, 2, 1, 3, 2, 1};

        int[] expected = {1, 1, 2, 2, 3, 3, 3};

        int[] actual = Solution.sortNums(input);

        Assert.assertArrayEquals(expected, actual);
    }
}

