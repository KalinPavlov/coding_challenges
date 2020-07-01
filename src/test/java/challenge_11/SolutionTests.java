package challenge_11;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTests {

    @Test
    public void testReverse() {
        ListNode list = new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(0)))));
        ListNode expected = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));

        ListNode actual = Solution.reverseIter(list);
        Assert.assertArrayEquals(expected.toList().toArray(), actual.toList().toArray());

//        actual = Solution.reverseRec(list);
//        Assert.assertArrayEquals(expected.toList().toArray(), actual.toList().toArray());
    }
}
