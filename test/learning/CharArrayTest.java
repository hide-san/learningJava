package learning;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CharArrayTest {
    @Test
    public void testCharArraySort() throws Exception {
        char[] chars = {'a', 'z', 'A', 'Z', '9', '1'};
        Arrays.sort(chars);

        assertArrayEquals(new char[]{'1', '9', 'A', 'Z', 'a', 'z'}, chars);
    }

    @Test
    public void testCharArrayToString() throws Exception {
        char[] chars = {'H', 'i', 'd', 'e', 'o'};
        String aString = new String(chars);

        assertEquals("Hideo", aString);
    }
}