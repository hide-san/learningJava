package learning;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertArrayEquals;

public class ArrayTest {

    @Test
    public void testIntArraySort() throws Exception {
        int[] ints = {3, 1, 2};
        Arrays.sort(ints);

        assertArrayEquals(new int[]{1, 2, 3}, ints);
    }


    @Test
    public void testCharArraySort() throws Exception {
        char[] chars = {'a', 'z', 'A', 'Z', '9', '1'};
        Arrays.sort(chars);

        assertArrayEquals(new char[]{'1', '9', 'A', 'Z', 'a', 'z'}, chars);
    }

    @Test
    public void testIntegerArraySort() throws Exception {
        Integer[] integers = {3, 1, 2};
        Arrays.sort(integers);

        Integer[] expectedIntegers = {1, 2, 3};
        assertArrayEquals(expectedIntegers, integers);
    }

    @Test
    public void testIntegerArrayReverseSort() throws Exception {
        Integer[] integers = {3, 1, 2};
        Arrays.sort(integers, Collections.reverseOrder());

        Integer[] expectedIntegers = {3, 2, 1};
        assertArrayEquals(expectedIntegers, integers);
    }

    @Test
    public void testIntArrayFill() throws Exception {
        int[] ints = new int[3];
        Arrays.fill(ints, 0);

        assertArrayEquals(new int[]{0, 0, 0}, ints);
    }

}