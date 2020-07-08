package challenge_17;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testInvertRec() {
        Node node = new Node('a', new Node('b', new Node('d'), new Node('e')),
                new Node('c', new Node('f'), null));

        Solution.invertRec(node);
        Object[] expected = "acfbed".chars().boxed().map(i -> (char) i.intValue()).toArray();

        Assert.assertArrayEquals(expected, node.toListPreorder().toArray());
    }
}
