package challenge_3;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testLongestSubStringLenght() {
        String str = "abrkaabcdefghijjxxx";

        int actual = Solution.findLongestSubstringNoDuplicateChars(str).getAsInt();

        Assert.assertEquals(10, actual);
    }
}
