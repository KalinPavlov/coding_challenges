package challenge_2;

import java.util.*;

import static challenge_2.Color.*;
import static challenge_2.Color.GREEN;

/**
 * Using BFS to find the maximum number of connected nodes in the grid.
 */
public class Solution {
    private static int counter = 0;

    private static List<Pair> getValidNeighbours(final Color[][] matrix, final int row, final int col) {
        List<Pair> validNodeNeighbours = new ArrayList<>();
        if (valid_cell(matrix, row - 1, col)) {
            validNodeNeighbours.add(new Pair(row - 1, col));
        }
        if (valid_cell(matrix, row + 1, col)) {
            validNodeNeighbours.add(new Pair(row + 1, col));
        }
        if (valid_cell(matrix, row, col - 1)) {
            validNodeNeighbours.add(new Pair(row, col - 1));
        }
        if (valid_cell(matrix, row, col + 1)) {
            validNodeNeighbours.add(new Pair(row, col + 1));
        }

        return validNodeNeighbours;
    }

    private static boolean valid_cell(final Color[][] matrix, final int row, final int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static void DFS(Color[][] matrix, int row, int col, Map<Pair, Pair> visited) {
        List<Pair> validNeighbours = getValidNeighbours(matrix, row, col);
        Pair currentCell = new Pair(row, col);
        if (visited.get(currentCell) == null) {
            visited.put(currentCell, currentCell);
            counter++;
        }
        for (Pair node : validNeighbours) {
            if (matrix[node.getX()][node.getY()] == matrix[row][col] && visited.get(node) == null) {
                visited.put(node, node);
                counter++;
                DFS(matrix, node.getX(), node.getY(), visited);
            }
        }
    }

    public static void setResultIfGreater(Map<Color, Integer> result, Color color, int numberOfConnectedNodes) {
        if (result.get(color) < numberOfConnectedNodes) {
            result.put(color, numberOfConnectedNodes);
        }
    }

    public static void main(String[] args) {
        Color[][] matrix = new Color[][]{
                {GREEN, GREEN, BLUE,  RED,   RED,   RED},
                {GREEN, GREEN, GREEN, GREEN, BLUE,  RED},
                {RED,   BLUE,  GREEN, BLUE,  BLUE,  BLUE},
                {GREEN, BLUE,  GREEN, BLUE,  BLUE,  BLUE},
                {GREEN, GREEN, GREEN, GREEN, RED,   BLUE},
                {RED,   RED,   RED,   GREEN, GREEN, GREEN}
        };

        Map<Color, Map<Pair, Pair>> visited = new HashMap<>();
        visited.put(RED, new HashMap<>());
        visited.put(GREEN, new HashMap<>());
        visited.put(BLUE, new HashMap<>());

        Map<Color, Integer> result = new HashMap<>();
        result.put(RED, 0);
        result.put(GREEN, 0);
        result.put(BLUE, 0);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                DFS(matrix, row, col, visited.get(matrix[row][col]));
                setResultIfGreater(result, matrix[row][col], counter);
                counter = 0;
            }
        }

        System.out.println(result.entrySet().stream().max(Map.Entry.comparingByValue()).get());
    }

    public static Optional<Map.Entry<Color, Integer>> findMaxNumberOfConnectedColors(Color[][] matrix) {
        Map<Color, Map<Pair, Pair>> visited = new HashMap<>();
        visited.put(RED, new HashMap<>());
        visited.put(GREEN, new HashMap<>());
        visited.put(BLUE, new HashMap<>());

        Map<Color, Integer> result = new HashMap<>();
        result.put(RED, 0);
        result.put(GREEN, 0);
        result.put(BLUE, 0);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                DFS(matrix, row, col, visited.get(matrix[row][col]));
                setResultIfGreater(result, matrix[row][col], counter);
                counter = 0;
            }
        }

        return result.entrySet().stream().max(Map.Entry.comparingByValue());
    }
}
