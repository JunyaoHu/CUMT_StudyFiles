package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* Location Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>6�� 29, 2022</pre> 
* @version 1.0 
*/ 
public class LocationTest { 

/** 
* 
* Method: toString() 
* 
*/ 
@Test
public void testToString() throws Exception {
    Location location = new Location(1001,1002,1003);
    Assert.assertEquals("1002:1003", location.toString());
} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception {
    Location location = new Location(1001,1002,1003);
    Assert.assertEquals(1001, location.hashCode());
} 

/** 
* 
* Method: equals(Object obj) 
* 
*/ 
@Test
public void testEquals() throws Exception {
    Location location = new Location(1001,1002,1003);
    Location location1 = location;
    Location location2 = null;
    Integer integer = 10;
    Location location3 = new Location(1001,1002,1003);
    Location location4 = new Location(1000,1002,1003);
    Location location5 = new Location(1001,1005,1003);
    Location location6 = new Location(1001,1002,1006);

    Assert.assertEquals(location, location1);
    Assert.assertNotEquals(location, location2);
    Assert.assertNotEquals(location, integer);
    Assert.assertEquals(location, location3);
    Assert.assertNotEquals(location, location4);
    Assert.assertNotEquals(location, location5);
    Assert.assertNotEquals(location, location6);
} 


} 
