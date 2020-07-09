package challenge_21;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testPythTriplets() {
        int[] input = {3, 5, 12, 5, 13};

        Assert.assertTrue(Solution.findPythagoreanTriplets(input));
    }
}
