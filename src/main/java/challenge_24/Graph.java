package challenge_24;

import java.util.*;

/**
 * Undirected graph
 */
public class Graph {

    private final Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        adjVertices = new HashMap<>();
    }

    @SuppressWarnings("unused")
    public List<Vertex> getAdjVertices(Vertex vertex) {
        return adjVertices.get(vertex);
    }

    public void addVertex(char ch) {
        Vertex v = new Vertex(ch);
        adjVertices.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(char ch1, char ch2) {
        Vertex v1 = new Vertex(ch1);
        Vertex v2 = new Vertex(ch2);

        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    @Override
    public String toString() {
        return "DGraph{" +
                "adjVertices=" + adjVertices +
                '}';
    }

    public boolean foundCycle() {
        for (Map.Entry<Vertex, List<Vertex>> vertex : adjVertices.entrySet()) {
            Set<Vertex> visited = new HashSet<>();
            if (dfsCycle(vertex.getKey(), visited, null)) {
                return true;
            }
        }

        return false;
    }

    private boolean dfsCycle(Vertex v, final Set<Vertex> visited, Vertex parent) {
        visited.add(v);

        for (Vertex adj : adjVertices.get(v)) {
            if (!visited.contains(adj)) {
                if (dfsCycle(adj, visited, v)) {
                    return true;
                }
            } else if (!adj.equals(parent)) {
                return true;
            }
        }

        return false;
    }
}
