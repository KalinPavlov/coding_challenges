package challenge_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SolutionTest {

    @Test
    public void testAutocompletion() {
        String[] words = {"dog", "dark", "cat", "door", "dodge"};
        String prefix = "do";

        List<String> actual = Solution.findAutocompleteWords(words , prefix);

        List<String> expected = new ArrayList<>();
        expected.add("dog");
        expected.add("door");
        expected.add("dodge");

        Assert.assertTrue(expected.containsAll(Objects.requireNonNull(actual)));
    }
}
