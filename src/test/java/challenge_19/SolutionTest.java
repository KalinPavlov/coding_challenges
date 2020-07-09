package challenge_19;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testStarcase() {
        Assert.assertEquals(5, Solution.staircaseRec(4));
        Assert.assertEquals(5, Solution.staircaseIter(4));
    }

    @Test
    public void testStarcase1() {
        Assert.assertEquals(8, Solution.staircaseRec(5));
        Assert.assertEquals(8, Solution.staircaseIter(5));
    }
}
