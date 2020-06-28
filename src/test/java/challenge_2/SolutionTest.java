package challenge_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static challenge_2.Color.*;

public class SolutionTest {

    @Test
    public void testRectangularMatrix() {
        Color[][] matrix = new Color[][]{
            {GREEN, GREEN, BLUE, RED},
            {GREEN, BLUE,  RED,  BLUE},
            {RED,   BLUE,  BLUE, BLUE}
        };

        Map.Entry<Color, Integer> actual = Solution.findMaxNumberOfConnectedColors(matrix).orElseThrow(AssertionError::new);
        Assert.assertEquals(BLUE, actual.getKey());
        Assert.assertEquals(5, (int) actual.getValue());
    }

    @Test
    public void testSquareMatrix() {
        Color[][] matrix = new Color[][]{
                {GREEN, GREEN, BLUE,  RED,   RED,   RED},
                {GREEN, GREEN, GREEN, GREEN, BLUE,  RED},
                {RED,   BLUE,  GREEN, BLUE,  BLUE,  BLUE},
                {GREEN, BLUE,  GREEN, BLUE,  BLUE,  BLUE},
                {GREEN, GREEN, GREEN, GREEN, RED,   BLUE},
                {RED,   RED,   RED,   GREEN, GREEN, GREEN}
        };

        Map.Entry<Color, Integer> actual = Solution.findMaxNumberOfConnectedColors(matrix).orElseThrow(AssertionError::new);
        Assert.assertEquals(GREEN, actual.getKey());
        Assert.assertEquals(16, (int) actual.getValue());
    }

    @Test
    public void testRectangularOnTheEdgesMatrix() {
        Color[][] matrix = new Color[][]{
                {RED, RED,   RED,   RED,   RED,  RED},
                {RED, GREEN, GREEN, GREEN, BLUE, RED},
                {RED, BLUE,  GREEN, BLUE,  BLUE, RED},
                {RED, BLUE,  GREEN, BLUE,  BLUE, RED},
                {RED, RED,   RED,   RED,   RED,  RED}
        };

        Map.Entry<Color, Integer> actual = Solution.findMaxNumberOfConnectedColors(matrix).orElseThrow(AssertionError::new);
        Assert.assertEquals(RED, actual.getKey());
        Assert.assertEquals(18, (int) actual.getValue());
    }

    @Test
    public void testSquareMatrixInTheMiddle() {
        Color[][] matrix = new Color[][]{
                {GREEN, GREEN, GREEN, RED,   RED,   RED},
                {GREEN, BLUE,  BLUE,  BLUE,  BLUE,  RED},
                {RED,   BLUE,  BLUE,  BLUE,  BLUE,  RED},
                {GREEN, BLUE,  BLUE,  BLUE,  BLUE,  RED},
                {GREEN, BLUE,  BLUE,  BLUE,  BLUE,  RED},
                {RED,   RED,   RED,   GREEN, GREEN, GREEN}
        };

        Map.Entry<Color, Integer> actual = Solution.findMaxNumberOfConnectedColors(matrix).orElseThrow(AssertionError::new);
        Assert.assertEquals(BLUE, actual.getKey());
        Assert.assertEquals(16, (int) actual.getValue());
    }
}
