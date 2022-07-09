package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* Grower Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class GrowerTest { 


/** 
* 
* Method: grow(ID id, Event event) 
* 
*/ 
@Test
public void testGrow() throws Exception {
    ID nl01 = IDs.with(IDs.zero(), IDs.one());
    ID nl10 = IDs.with(IDs.one(), IDs.zero());
    ID nl11 = IDs.with(IDs.one(), IDs.one());
    ID nl101 = IDs.with(IDs.one(), IDs.with(IDs.zero(), IDs.one()));
    Event e0 = Events.zero();
    Grower.grow(nl01, e0);
    Grower.grow(nl10, e0);
    Grower.grow(nl11, e0);
    Grower.grow(nl101, e0);
}

@Test(expected = IllegalArgumentException.class)
public void testGrow1() throws Exception {
    ID nl00 = IDs.with(IDs.zero(), IDs.zero());
    Event e0 = Events.zero();
    Grower.grow(nl00, e0);
}


/**
* 
* Method: innerGrow(ID id, Event event) 
* 
*/ 
@Test
public void testInnerGrow() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("innerGrow", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growLeafID(ID id, Event event) 
* 
*/ 
@Test
public void testGrowLeafID() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growLeafID", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growNonLeafID(ID id, Event event) 
* 
*/ 
@Test
public void testGrowNonLeafID() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growNonLeafID", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growLeafEvent(ID id, Event event) 
* 
*/ 
@Test
public void testGrowLeafEvent() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growLeafEvent", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growOnRight(ID id, Event event) 
* 
*/ 
@Test
public void testGrowOnRight() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growOnRight", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growRight(ID id, Event event) 
* 
*/ 
@Test
public void testGrowRight() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growRight", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: rightGrowth(Event event, GrowResult growth) 
* 
*/ 
@Test
public void testRightGrowth() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("rightGrowth", Event.class, GrowResult.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growOnLeft(ID id, Event event) 
* 
*/ 
@Test
public void testGrowOnLeft() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growOnLeft", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growLeft(ID id, Event event) 
* 
*/ 
@Test
public void testGrowLeft() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growLeft", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: leftGrowth(Event event, GrowResult growth) 
* 
*/ 
@Test
public void testLeftGrowth() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("leftGrowth", Event.class, GrowResult.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: growOnBothSides(ID id, Event event) 
* 
*/ 
@Test
public void testGrowOnBothSides() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Grower.getClass().getMethod("growOnBothSides", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
