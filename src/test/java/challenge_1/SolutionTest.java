package challenge_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testChallengeExample() {
        List<Integer> l11 = new ArrayList<>();
        l11.add(2);
        l11.add(4);
        l11.add(3);

        List<Integer> l22 = new ArrayList<>();
        l22.add(5);
        l22.add(6);
        l22.add(4);

        List<Integer> actual = Solution.addTwoNumbers(l11, l22);

        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(0);
        expected.add(8);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testEmptyLists() {
        List<Integer> l11 = new ArrayList<>();
        List<Integer> l22 = new ArrayList<>();
        List<Integer> actual = Solution.addTwoNumbers(l11, l22);

        List<Integer> expected = new ArrayList<>();
        expected.add(0);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testSumNoOverflow() {
        List<Integer> l11 = new ArrayList<>();
        l11.add(2);
        l11.add(4);
        l11.add(3);

        List<Integer> l22 = new ArrayList<>();
        l22.add(2);
        l22.add(4);
        l22.add(5);

        List<Integer> actual = Solution.addTwoNumbers(l11, l22);

        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(8);
        expected.add(8);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testSumOfZeroes() {
        List<Integer> l11 = new ArrayList<>();
        l11.add(0);

        List<Integer> l22 = new ArrayList<>();
        l22.add(0);

        List<Integer> actual = Solution.addTwoNumbers(l11, l22);

        List<Integer> expected = new ArrayList<>();
        expected.add(0);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testDifferentListLengthNoOverflow() {
        List<Integer> l11 = new ArrayList<>();
        l11.add(2);
        l11.add(4);

        List<Integer> l22 = new ArrayList<>();
        l22.add(2);
        l22.add(4);
        l22.add(5);

        List<Integer> actual = Solution.addTwoNumbers(l11, l22);

        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(8);
        expected.add(5);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testDifferentListLengthWithOverflow() {
        List<Integer> l11 = new ArrayList<>();
        l11.add(2);
        l11.add(6);

        List<Integer> l22 = new ArrayList<>();
        l22.add(2);
        l22.add(4);
        l22.add(5);

        List<Integer> actual = Solution.addTwoNumbers(l11, l22);

        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(0);
        expected.add(6);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void testSameListLengthWithOverflow() {
        List<Integer> l11 = new ArrayList<>();
        l11.add(2);
        l11.add(8);
        l11.add(6);

        List<Integer> l22 = new ArrayList<>();
        l22.add(7);
        l22.add(9);
        l22.add(5);

        List<Integer> actual = Solution.addTwoNumbers(l11, l22);

        List<Integer> expected = new ArrayList<>();
        expected.add(9);
        expected.add(7);
        expected.add(2);
        expected.add(1);

        Assert.assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
