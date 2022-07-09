package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;


/** 
* Stamp Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5月 31, 2022</pre> 
* @version 1.0 
*/ 
public class StampTest { 


/** 
* 
* Method: getId() 
* 
*/ 
@Test
public void testGetId() throws Exception {
    Stamp s = new Stamp();
    Assert.assertEquals("1", s.getId().toString());
    Stamp s1 = new Stamp(new LeafID(5), new LeafEvent(6));
    Assert.assertEquals("5", s1.getId().toString());
}

/** 
* 
* Method: getEvent() 
* 
*/ 
@Test
public void testGetEvent() throws Exception {
    Stamp s = new Stamp();
    Assert.assertEquals("0", s.getEvent().toString());
    Stamp s1 = new Stamp(new LeafID(5), new LeafEvent(6));
    Assert.assertEquals("6", s1.getEvent().toString());
}

/** 
* 
* Method: fork() 
* 
*/ 
@Test
public void testFork() throws Exception {
    Stamp s1 = new Stamp();
    Stamp[] s2 = s1.fork();
    Assert.assertNotEquals(s2[0], s2[1]);
} 

/** 
* 
* Method: peek() 
* 
*/ 
@Test
public void testPeek() throws Exception {
    Stamp s1 = new Stamp();
    Stamp[] s2 = s1.peek();
    Assert.assertEquals(s1.getId(), s2[0].getId());
    Assert.assertEquals(IDs.zero(), s2[1].getId());
} 

/** 
* 
* Method: join(Stamp other) 
* 
*/ 
@Test(expected = IllegalArgumentException.class)
public void testJoin() throws Exception {
    Stamp s1 = new Stamp();
    Stamp s2 = new Stamp();
    s1.join(s2);
}

@Test
public void testJoin1() throws Exception {
    Stamp s1 = new Stamp();
    Stamp s2 = new Stamp(IDs.zero(), Events.zero());
    s1.join(s2);
}

    /**
* 
* Method: event() 
* 
*/ 
@Test(expected = IllegalArgumentException.class)
public void testEvent() throws Exception {
    Stamp s0 = new Stamp(IDs.zero(), Events.zero());
    s0.event();
}

@Test
public void testEvent1() throws Exception {
    Stamp s0 = new Stamp(IDs.zero(), Events.zero());
    Stamp s1 = new Stamp();
    s1.event();
    s1.send();
    s1.receive(s0);
    s1.sync(s0);
    s1.leq(s1);
} 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    Stamp s1 = new Stamp();
    Assert.assertEquals("(1, 0)", s1.toString());
} 

/** 
* 
* Method: equals(Object o) 
* 
*/ 
@Test
public void testEquals() throws Exception {
    Stamp s1 = new Stamp();
    Assert.assertFalse(s1.equals(null));
} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {
    Stamp s1 = new Stamp();
    Assert.assertEquals(1817, s1.hashCode());
} 

/** 
* 
* Method: send() 
* 
*/ 
@Test
public void testSend() throws Exception {
    Stamp s1 = new Stamp();
    s1.send();
} 

/** 
* 
* Method: receive(Stamp other) 
* 
*/ 
@Test
public void testReceive() throws Exception {
    Stamp s1 = new Stamp();
    Stamp s2 = new Stamp(IDs.zero(), Events.zero());
    s1.receive(s2);
} 

/** 
* 
* Method: sync(Stamp other) 
* 
*/ 
@Test
public void testSync() throws Exception {
    Stamp s1 = new Stamp();
    Stamp s2 = new Stamp(IDs.zero(), Events.zero());
    s1.sync(s2);
} 

/** 
* 
* Method: leq(Stamp other) 
* 
*/ 
@Test
public void testLeq() throws Exception {


}
}

