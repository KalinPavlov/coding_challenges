package challenge_9;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testInvalidSequence() {
        String s = "()(){(())";

        Assert.assertFalse(Solution.isValid(s));
    }

    @Test
    public void testEmptySequence() {
        String s = "";

        Assert.assertTrue(Solution.isValid(s));
    }

    @Test
    public void testValidSequence() {
        String s = "([{}])()";

        Assert.assertTrue(Solution.isValid(s));
    }
}
