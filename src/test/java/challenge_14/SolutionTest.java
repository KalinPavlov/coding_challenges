package challenge_14;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testNotDecresing1() {
        int[] input = {13, 4, 7};

        boolean actual = Solution.isNotDecreasing(input);

        Assert.assertTrue(actual);
    }

    @Test
    public void testNotDecresing2() {
        int[] input = {5, 1, 2, 3, 2, 5};

        boolean actual = Solution.isNotDecreasing(input);

        Assert.assertFalse(actual);
    }
}
