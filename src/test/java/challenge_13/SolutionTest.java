package challenge_13;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testTwoSum1() {
        int[] input = {4,7,1,-3,2};

        boolean actual = Solution.twoSum(input, 5);

        Assert.assertTrue(actual);
    }
}
