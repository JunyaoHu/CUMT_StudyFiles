package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* Filler Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>5�� 31, 2022</pre> 
* @version 1.0 
*/ 
public class FillerTest { 

/** 
* 
* Method: fill(ID id, Event event) 
* 
*/ 
@Test
public void testFill() throws Exception {
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
public void testFill1() throws Exception {
    ID nl00 = IDs.with(IDs.zero(), IDs.zero());
    Event e0 = Events.zero();
    Grower.grow(nl00, e0);
}



    /**
* 
* Method: fillWithLeafID(ID leafID, Event event) 
* 
*/ 
@Test
public void testFillWithLeafID() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillWithLeafID", ID.class, Event.class); 
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
* Method: fillNonLeafs(ID id, Event event) 
* 
*/ 
@Test
public void testFillNonLeafs() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillNonLeafs", ID.class, Event.class); 
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
* Method: fillLeftOneID(ID id, Event event) 
* 
*/ 
@Test
public void testFillLeftOneID() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillLeftOneID", ID.class, Event.class); 
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
* Method: fillRight(ID id, Event event) 
* 
*/ 
@Test
public void testFillRight() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillRight", ID.class, Event.class); 
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
* Method: fillRightOneID(ID id, Event event) 
* 
*/ 
@Test
public void testFillRightOneID() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillRightOneID", ID.class, Event.class); 
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
* Method: fillLeft(ID id, Event event) 
* 
*/ 
@Test
public void testFillLeft() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillLeft", ID.class, Event.class); 
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
* Method: fillLeftRight(ID id, Event event) 
* 
*/ 
@Test
public void testFillLeftRight() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Filler.getClass().getMethod("fillLeftRight", ID.class, Event.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
