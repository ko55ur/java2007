package course3.homework6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOneOrFour {
    TestExample2 homework6;

    @Before
    public void beforeMethod() {
        homework6 = new TestExample2();
    }

    @Test
    public void testOneOrFour1() {
        int[] arrIn = {1, 4, 4};
        Assert.assertTrue(TestExample2.isOneOrFour(arrIn));
    }

    @Test
    public void testOneOrFour2() {
        int[] arrIn = {1, 4, 5};
        Assert.assertFalse(TestExample2.isOneOrFour(arrIn));
    }

    @Test
    public void testOneOrFour3() {
        int[] arrIn = {1, 1, 1};
        Assert.assertFalse(TestExample2.isOneOrFour(arrIn));
    }


}