package learning;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class IntegerArrayTest {
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
    public void testIntegerArrayFill() throws Exception {
        Integer[] integers = new Integer[3];
        Arrays.fill(integers, 9);

        Integer[] expectedIntegers = {9, 9, 9};
        assertArrayEquals(expectedIntegers, integers);
    }

    @Test
    public void testIntegerArrayToList() throws Exception {
        Integer[] integers = {3, 1, 2};
        List<Integer> integerList = Arrays.asList(integers);

        assertEquals(Integer.valueOf(3), integerList.get(0));
        assertEquals(Integer.valueOf(1), integerList.get(1));
        assertEquals(Integer.valueOf(2), integerList.get(2));
    }

    @Test
    public void testIntegerArrayToIntArray() throws Exception {
        Integer[] integers = {3, 1, 2};
        int[] ints = new int[3];

        for (int i = 0; i < ints.length; i++) ints[i] = integers[i];

        assertArrayEquals(new int[]{3, 1, 2}, ints);
    }

    @Test
    public void testIntegerArrayContains() throws Exception {
        Integer[] integers = {3, 1, 2};

        assertTrue(Arrays.asList(integers).contains(3));
        assertFalse(Arrays.asList(integers).contains(0));
    }

}