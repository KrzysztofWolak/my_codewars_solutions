package org.example;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    private Factorial fact;

    @Before
    public void initFactorial() {
        fact = new Factorial();
    }

    @After
    public void afterFactorial() {
        fact = null;
    }

    @Test
    public void test_factorial0() {
        assertEquals(1, fact.factorial(0));
    }

    @Test
    public void test_factorial3() {
        assertEquals(6, fact.factorial(3));
    }

    @Test
    public void test_factorial5() {
        assertEquals(120, fact.factorial(5));
    }

    @Test
    public void test_factorial_big_num() {
        assertThrows(IllegalArgumentException.class, ()-> fact.factorial(15));
    }
}