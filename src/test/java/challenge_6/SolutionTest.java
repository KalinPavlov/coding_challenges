package challenge_6;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testFindThirdLargestElement() {
        int[] input = {5, 7, 2, 3, 4, 1, 6};

        int actual = Solution.findKthLargest(input, 3);

        Assert.assertEquals(5, actual);
    }
}
