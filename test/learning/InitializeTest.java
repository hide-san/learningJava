package learning;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by hideo on 14/10/17.
 */
public class InitializeTest {

    @Test
    public void testIntArrayFill() throws Exception {
        int[] ints = new int[3];
        Arrays.fill(ints, 0);

        assertArrayEquals(new int[]{0, 0, 0}, ints);
    }


    @Test
    public void testIntegerArrayFill() throws Exception {
        Integer[] integers = new Integer[3];
        Arrays.fill(integers, 9);

        Integer[] expectedIntegers = {9, 9, 9};
        assertArrayEquals(expectedIntegers, integers);
    }


}
