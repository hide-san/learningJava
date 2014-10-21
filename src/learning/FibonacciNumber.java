package learning;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by hideo on 14/10/21.
 */
public class FibonacciNumber {
    static int simpleFib(int a) {
        if (a <= 1) return 1;
        return simpleFib(a - 1) + simpleFib(a - 2);
    }

    static Map<Integer, Integer> MEMO = new Hashtable<Integer, Integer>();

    static int memoFib(int a) {
        if (MEMO.containsKey(a)) return MEMO.get(a);

        int fib;
        if (a <= 1) {
            fib = 1;
        } else {
            fib = memoFib(a - 2) + memoFib(a - 1);
        }
        MEMO.put(a, fib);
        return fib;
    }
}
