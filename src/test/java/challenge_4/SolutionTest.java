package challenge_4;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testLSP1() {
        String s = "banana";

        String actual = Solution.findLongestSubstringPalindrome(s);

        Assert.assertEquals("anana", actual);
    }

    @Test
    public void testLSP2() {
        String s = "million";

        String actual = Solution.findLongestSubstringPalindrome(s);

        Assert.assertEquals("illi", actual);
    }

    @Test
    public void testLSP3() {
        String s = "tracecars";

        String actual = Solution.findLongestSubstringPalindrome(s);

        Assert.assertEquals("racecar", actual);
    }
}
