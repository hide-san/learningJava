package learning;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by hideo on 14/10/20.
 */
public class MapTest {

    public static final String HIDEO = "Hideo";

    @Test
    public void testInitializeHashMap() throws Exception {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put(HIDEO, hashMap.get(HIDEO) == null ? 0 : hashMap.get(HIDEO) + 1);
        assertEquals(Integer.valueOf(0), hashMap.get(HIDEO));

        hashMap.put(HIDEO, hashMap.get(HIDEO) == null ? 0 : hashMap.get(HIDEO) + 1);
        assertEquals(Integer.valueOf(1), hashMap.get(HIDEO));
    }

    @Test
    public void testNullValueHashMap() throws Exception {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put(HIDEO, null);
        assertNull(hashMap.get(HIDEO));
    }

    @Test(expected = NullPointerException.class)
    public void testNullValueHashtable() throws Exception {
        Map<String, Integer> hashtable = new Hashtable<String, Integer>();
        hashtable.put(HIDEO, null);
    }


}
