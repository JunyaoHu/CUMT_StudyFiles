package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* Variable Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>6�� 3, 2022</pre> 
* @version 1.0 
*/ 
public class VariableTest {


/** 
* 
* Method: addVariable(String varName) 
* 
*/ 
@Test
public void testAddVariable() throws Exception {
    Assert.assertTrue(Variable.addVariable("huhu"));
    Assert.assertFalse(Variable.addVariable("huhu"));
}

/** 
* 
* Method: removeVariable(String varName) 
* 
*/ 
@Test
public void testRemoveVariable() throws Exception {
    Variable.addVariable("huhu");
    Variable.removeVariable("huhu");
    Variable.removeVariable("huhu1");
} 

/** 
* 
* Method: getVariableValue(String varName) 
* 
*/ 
@Test
public void testGetVariableValue() throws Exception {
    Variable.addVariable("huhu");
    Variable.setVariableValue("huhu", 123);
    Assert.assertEquals(123, Variable.getVariableValue("huhu"));
    Assert.assertEquals(0, Variable.getVariableValue("huhu1"));

    Variable.addVariable("huhu1");
    Variable.setVariableValue("huhu1", 66);
    Variable.addVariable("*huhu1");
    Assert.assertEquals(1, Variable.getVariableValue("*huhu1"));
    Assert.assertEquals(-1, Variable.getVariableValue("*huhu2"));
}

/** 
* 
* Method: setVariableValue(String varName, int varValue) 
* 
*/ 
@Test
public void testSetVariableValue() throws Exception {
    Variable.addVariable("huhu");
    Variable.setVariableValue("huhu", 123);
    Variable.setVariableValue("huhu1", 123);
}


/** 
* 
* Method: getValue() 
* 
*/ 
@Test
public void testGetValue() throws Exception {
    Variable v = new Variable("hu");
    Assert.assertEquals(0, v.getValue());
} 

/** 
* 
* Method: setValue(int varValue) 
* 
*/ 
@Test
public void testSetValue() throws Exception {
    Variable v = new Variable("hu");
    v.setValue(10);
    Assert.assertEquals(10, v.getValue());
} 

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception {
    Variable v = new Variable("hu");
    Assert.assertEquals("hu", v.getName());
} 

/** 
* 
* Method: findVariable(String varName) 
* 
*/ 
@Test
public void testFindVariable() throws Exception {
    Variable.addVariable("hu1");
    Variable.setVariableValue("hu1",10);
    Variable.addVariable("hu2");
    Variable.setVariableValue("hu2", 20);
    Assert.assertEquals(1, Variable.findVariable("hu2"));
    Assert.assertEquals(-1, Variable.findVariable("hu3"));
    Assert.assertEquals(10, Variable.findVariable("&hu1"));
}

} 
