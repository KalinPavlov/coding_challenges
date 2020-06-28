package challenge_8;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void testFindAllConcatenationWords() {
        String[] words = {"cat", "cats", "dog", "catsdog"};

        List<String> actual = Solution.findAllConcatenationWords(words);

        Assert.assertArrayEquals(new String[]{"catsdog"}, actual.toArray());
    }
}
