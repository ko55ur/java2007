package course3.homework6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestReturnArray {

    TestExample1 homework6;

    @Before
    public void beforeMethod() {
        homework6 = new TestExample1();
    }

    @Test

    public void testGetArray1() {

        int[] arrayIn = {1, 4, 6, 87, 6, 9, 75, 6};
        int[] result = TestExample1.returnArr(arrayIn);
        int[] arr = {1, 7, 8};
        Assert.assertArrayEquals(arr, result);

    }

    @Test

    public void testGetArray2() {
        int[] arrayIn = {1, 4, 6, 87, 6, 9, 75, 6};
        int[] result = TestExample1.returnArr(arrayIn);
        int[] arr = {1, 8, 9, 7, 98};
        Assert.assertArrayEquals(arr, result);
    }

    @Test(expected = RuntimeException.class)
    public void testGetArrayException() throws RuntimeException {
        int[] arrayIn = {1, 2, 3, 5, 1, 7};
        TestExample1.returnArr(arrayIn);
    }

}
