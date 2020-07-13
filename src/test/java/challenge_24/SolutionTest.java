package challenge_24;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testUnderictedGraphForCycle() {
        Graph graph = new Graph();
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addEdge('a', 'b');
        graph.addEdge('b', 'c');
        graph.addEdge('c', 'a');

        Assert.assertTrue(graph.foundCycle());
    }

    @Test
    public void testUnderictedGraphForCycle1() {
        Graph graph = new Graph();
        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addEdge('a', 'b');
        graph.addEdge('b', 'c');

        Assert.assertFalse(graph.foundCycle());
    }
}
