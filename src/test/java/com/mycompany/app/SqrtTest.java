package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class SqrtTest {

    @Test
    public void testAverage() {
        Sqrt s = new Sqrt(0);
        assertEquals(2.5, s.average(2, 3), 1e-9);
    }

    @Test
    public void testGoodTrue() {
        Sqrt s = new Sqrt(0);
        assertTrue(s.good(1.0, 1.0));
    }

    @Test
    public void testGoodFalse() {
        Sqrt s = new Sqrt(0);
        assertFalse(s.good(1.0, 2.0));
    }

    @Test
    public void testImprove() {
        Sqrt s = new Sqrt(4);
        assertEquals(2.5, s.improve(1.0, 4.0), 1e-2);
    }

    @Test
    public void testIterSimple() {
        Sqrt s = new Sqrt(4);
        assertEquals(2.0, s.iter(1.0, 4), 1e-6);
    }

    @Test
    public void testCalcPerfectSquare() {
        Sqrt s = new Sqrt(9);
        assertEquals(3.0, s.calc(), 1e-6);
    }

    @Test
    public void testCalcDecimal() {
        Sqrt s = new Sqrt(2);
        assertEquals(Math.sqrt(2), s.calc(), 1e-6);
    }

    @Test
    public void testCalcZero() {
        Sqrt s = new Sqrt(0);
        assertEquals(0.0, s.calc(), 1e-6);
    }

    @Test
    public void testCalcLarge() {
        Sqrt s = new Sqrt(1e6);
        assertEquals(1000.0, s.calc(), 1e-6);
    }

    @Test
    public void testCalcSmall() {
        Sqrt s = new Sqrt(1e-6);
        assertEquals(Math.sqrt(1e-6), s.calc(), 1e-6);
    }
}
