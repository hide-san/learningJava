package learning;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class IntArrayTest {

    @Test
    public void testIntArraySort() throws Exception {
        int[] ints = {3, 1, 2};
        Arrays.sort(ints);

        assertArrayEquals(new int[]{1, 2, 3}, ints);
    }

    @Test
    public void testIntArrayFill() throws Exception {
        int[] ints = new int[3];
        Arrays.fill(ints, 0);

        assertArrayEquals(new int[]{0, 0, 0}, ints);
    }

}