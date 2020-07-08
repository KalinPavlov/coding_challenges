package challenge_15;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchTest {

    private static NodeBTree bTree;
    private static NodeMTree mTree;

    @BeforeClass
    public static void init() {
        bTree = new NodeBTree(1, new NodeBTree(2, new NodeBTree(4), new NodeBTree(5,
                new NodeBTree(8), null)), new NodeBTree(3, new NodeBTree(6, null,
                new NodeBTree(9)), new NodeBTree(7)));

        List<NodeMTree> twoChildren = new ArrayList<>(Arrays.asList(new NodeMTree(5), new NodeMTree(6), new NodeMTree(7)));
        List<NodeMTree> threeChildren = new ArrayList<>(Arrays.asList(new NodeMTree(8), new NodeMTree(9), new NodeMTree(10)));
        List<NodeMTree> fourChildren = new ArrayList<>(Arrays.asList(new NodeMTree(11), new NodeMTree(12), new NodeMTree(13)));
        List<NodeMTree> children = new ArrayList<>(Arrays.asList(new NodeMTree(2, twoChildren), new NodeMTree(3, threeChildren), new NodeMTree(4, fourChildren)));
        mTree = new NodeMTree(1, children);
    }

    @Test
    public void testBTreeTraversalDFS() {
        Assert.assertTrue(SolutionBTree.findElementDFSRec(bTree, 8));
        Assert.assertTrue(SolutionBTree.findElementDFSIter(bTree, 6));
    }

    @Test
    public void testBTreeTraversalBFS() {
        Assert.assertTrue(SolutionBTree.findElementBFSRec(bTree, 3));
        Assert.assertFalse(SolutionBTree.findElementBFSIter(bTree, 77));
    }

    @Test
    public void testMTreeTraversalDFS() {
        Assert.assertTrue(SolutionMTree.findElementDFSRec(mTree, 8));
        Assert.assertTrue(SolutionMTree.findElementDFSIter(mTree, 6));
    }

    @Test
    public void testMTreeTraversalBFS() {
        Assert.assertTrue(SolutionMTree.findElementBFSRec(mTree, 8));
        Assert.assertTrue(SolutionMTree.findElementBFSIter(mTree, 6));
    }
}
