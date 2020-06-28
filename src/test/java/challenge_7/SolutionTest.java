package challenge_7;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution() {
        int[] arr = {7, 5, 8, 6, 2, 3, 1};

        List<int[]> actual = Solution.findDoubles(arr);

        int[][] expected = {{7, 1}, {5, 3}, {6, 2}};

        Assert.assertArrayEquals(expected, actual.toArray());
    }
}
