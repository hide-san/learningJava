package learning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumberTest {

    @Test
    public void testMemoFib() throws Exception {

        for (int i = 0; i < 10; i++) {
            int ans = FibonacciNumber.simpleFib(i);
            assertEquals(ans, FibonacciNumber.memoFib(i));
        }

    }

    @Test
    public void testMemoFib100() throws Exception {

        assertEquals(FibonacciNumber.simpleFib(30), FibonacciNumber.memoFib(30));

    }

    @Test
    public void testRepeat() throws Exception {
        long before, after;
        before = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println("Fibonacci Number of " + i + " is " + FibonacciNumber.memoFib(i));
            after = System.currentTimeMillis();
            System.out.println(after - before);
        }
    }

    @Test
    public void testErrapsedTime() throws Exception {
        int repeatNumber = 30;

        long before, after;

        before = System.currentTimeMillis();
        for (int i = 0; i < repeatNumber; i++) {
            FibonacciNumber.simpleFib(i);
        }
        after = System.currentTimeMillis();
        System.out.println(after - before);


        before = System.currentTimeMillis();
        for (int i = 0; i < repeatNumber; i++) {
            FibonacciNumber.memoFib(i);
        }
        after = System.currentTimeMillis();
        System.out.println(after - before);


    }

}