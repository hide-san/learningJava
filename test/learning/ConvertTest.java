package learning;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by hideo on 14/10/17.
 */
public class ConvertTest {
    @Test
    public void testCharArrayToString() throws Exception {
        char[] chars = {'H', 'i', 'd', 'e', 'o'};
        String aString = new String(chars);

        assertEquals("Hideo", aString);
    }

    @Test
    public void testStringToCharArray() throws Exception {
        char[] chars = "Hideo".toCharArray();

        assertArrayEquals(new char[]{'H', 'i', 'd', 'e', 'o'}, chars);
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

}
