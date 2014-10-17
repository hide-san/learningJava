package learning;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by hideo on 14/10/17.
 */
public class ContainTest {

    @Test
    public void testIntegerArrayContains() throws Exception {
        Integer[] integers = {3, 1, 2};

        assertTrue(Arrays.asList(integers).contains(3));
        assertFalse(Arrays.asList(integers).contains(0));
    }
}
