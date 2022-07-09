package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ITClocksTest {

    @Before
    public void setUp() throws Exception {
        ITClocks itc = new ITClocks();
    }

    @Test
    public void testLteEvent() {
        Event e1 = Events.zero();
        Event e2 = Events.with(1);
        Event e3 = Events.with(0, e1, e1);
        Event e4 = Events.with(0, e2, e2);
        assertTrue(ITClocks.lessThanEquals(e1, e1));
        assertFalse(ITClocks.lessThanEquals(e2, e1));
        assertTrue(ITClocks.lessThanEquals(e1, e3));
        assertFalse(ITClocks.lessThanEquals(e2, e3));
        assertTrue(ITClocks.lessThanEquals(e3, e1));
        assertFalse(ITClocks.lessThanEquals(e4, e1));
        assertTrue(ITClocks.lessThanEquals(e3, e4));
        assertFalse(ITClocks.lessThanEquals(e4, e3));
    }

    @Test
    public void testLteStamp() {
        Stamp s1 = new Stamp();
        Stamp s2 = new Stamp(IDs.zero(), Events.zero());
        assertTrue(ITClocks.lessThanEquals(s1, s2));
        assertTrue(ITClocks.lessThanEquals(s1, s1));
    }

    @Test
    public void testCmpEvent() {
        Event e1 = Events.zero();
        Event e2 = Events.with(2);
        Event e3 = Events.with(3, e2, e2);
        Event e4 = Events.with(1, e2, e2);
        assertTrue(ITClocks.isConcurrent(e1, e1)); // LL
        assertFalse(ITClocks.isConcurrent(e1, e2)); // LL False
        assertTrue(ITClocks.isConcurrent(e2, e4)); // LN
        assertFalse(ITClocks.isConcurrent(e1, e3)); // LN False
        assertTrue(ITClocks.isConcurrent(e4, e2)); // NL
        assertFalse(ITClocks.isConcurrent(e3, e1)); // NL False
        assertTrue(ITClocks.isConcurrent(e4, e4)); // NN
        assertFalse(ITClocks.isConcurrent(e3, e4)); // NN False
    }

    @Test
    public void testUncmp() {
        Event e1 = Events.with(1);
        Event e2 = Events.with(2);
        Event e3 = Events.with(0, e1, e1);
        Event e4 = Events.with(0, e2, e2);
        Event e5 = Events.with(0, e4, e4);
        assertTrue(ITClocks.isConcurrent(e5, e3));
    }

    @Test
    public void testHB() {
        Event e1 = Events.with(1);
        Event e2 = Events.with(2);
        Event e3 = Events.with(0, e1, e1);
        Event e4 = Events.with(0, e2, e2);
        Event e5 = Events.with(0, e1, e2);
        Event e6 = Events.with(0, e2, e1);
        assertFalse(ITClocks.isConcurrent(e3, e4));
        assertTrue(ITClocks.isConcurrent(e5, e6));
    }

    @Test
    public void testHA() {
        Event e1 = Events.with(1);
        Event e2 = Events.with(2);
        Event e3 = Events.with(0, e1, e1);
        Event e4 = Events.with(0, e2, e2);
        Event e5 = Events.with(0, e1, e2);
        Event e6 = Events.with(0, e2, e1);
        assertFalse(ITClocks.isConcurrent(e4, e3));
        assertTrue(ITClocks.isConcurrent(e6, e5));
    }

    @Test
    public void testCmp0() {
        Event e1 = Events.with(1);
        Event e2 = Events.with(2);
        Event e3 = Events.with(1, e2, e2);
        assertFalse(ITClocks.isConcurrent(e1, e3));
        assertFalse(ITClocks.isConcurrent(e3, e1));
    }

    @Test
    public void testCmpNull() {
        Event e0 = Events.zero();
        try {
            ITClocks.isConcurrent(null, null);
            fail();
        } catch (Exception ignored) {
        }
        try {
            ITClocks.isConcurrent(e0, null);
            fail();
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testCmpBefore() {
        Event e1 = Events.zero();
        Event e2 = Events.with(1);
        assertFalse(ITClocks.happensBefore(e1, e1));
        assertTrue(ITClocks.happensBefore(e1, e2));
    }

    @Test
    public void testCmpBeforeStamp() {
        Stamp s1 = new Stamp();
        assertFalse(ITClocks.happensBefore(s1, s1));
    }

}
