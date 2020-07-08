package challenge_18;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testMax() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(1);
        maxStack.push(2);
        maxStack.push(3);
        maxStack.push(2);
        Assert.assertEquals(3, maxStack.max());
        maxStack.pop();
        maxStack.pop();
        Assert.assertEquals(2, maxStack.max());
    }

    @Test
    public void testMax1() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(2);
        maxStack.push(2);
        Assert.assertEquals(2, maxStack.max());
        maxStack.push(1);
        maxStack.push(4);
        Assert.assertEquals(4, maxStack.max());
        maxStack.pop();
        Assert.assertEquals(2, maxStack.max());
        maxStack.push(5);
        Assert.assertEquals(5, maxStack.max());
        maxStack.push(5);
        maxStack.pop();
        Assert.assertEquals(5, maxStack.max());
        maxStack.pop();
        maxStack.push(3);
        Assert.assertEquals(3, maxStack.max());
    }
}
