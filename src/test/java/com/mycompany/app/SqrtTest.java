package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), 0.0001);
        assertEquals(0.0, sqrt.average(-1.0, 1.0), 0.0001);
        assertEquals(1.5, sqrt.average(1.0, 2.0), 0.0001);
    }

    @Test
    public void testGood() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
        assertFalse(sqrt.good(1.9, 4.0));
        assertTrue(sqrt.good(1.99999999, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.05, sqrt.improve(2.0, 4.2), 0.0001);
        assertEquals(2.5, sqrt.improve(2.0, 5.0), 0.0001);
    }

    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), 0.0001);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), 0.0001);
    }

    @Test
    public void testCalc() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), 0.0001);
        sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), 0.0001);
        sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), 0.0001);
    }
}
