package challenge_16;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

    private static Node bTree;

    @BeforeClass
    public static void init() {
        bTree = new Node(8, new Node(4, new Node(2), new Node(6)),
                new Node(12, new Node(10), new Node(14)));
    }

    @Test
    public void testFindFloorCeilingDFS() {
        Assert.assertArrayEquals(new int[]{4, 6}, Solution.findFloorCeilingDFSRec(bTree, 5));
        Assert.assertArrayEquals(new int[]{4, 6}, Solution.findFloorCeilingDFSIter(bTree, 5));
    }

    @Test
    public void testFindFloorCeilingFFS() {
        Assert.assertArrayEquals(new int[]{4, 6}, Solution.findFloorCeilingBFSRec(bTree, 5));
        Assert.assertArrayEquals(new int[]{4, 6}, Solution.findFloorCeilingBFSIter(bTree, 5));
    }
}
