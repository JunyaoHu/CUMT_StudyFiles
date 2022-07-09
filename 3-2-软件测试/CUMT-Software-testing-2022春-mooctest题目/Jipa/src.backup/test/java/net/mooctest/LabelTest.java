package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;



/** 
* Label Tester. 
* 
* @author Hujunyao CUMT CS 2019-4 06192081
* @since <pre>6�� 3, 2022</pre> 
* @version 1.0 
*/ 
public class LabelTest {

/** 
* 
* Method: getName() 
* 
*/ 
@Test
public void testGetName() throws Exception {
    Label lb = new Label(1, "huhu");
    Assert.assertEquals("huhu", lb.getName());
} 

/** 
* 
* Method: getLine() 
* 
*/ 
@Test
public void testGetLine() throws Exception {
    Label lb = new Label(1, "huhu");
    Assert.assertEquals(1, lb.getLine());
} 

/** 
* 
* Method: findLabel(String name) 
* 
*/ 
@Test
public void testFindLabel() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: buildLabelList() 
* 
*/ 
@Test
public void testBuildLabelList() throws Exception {
    Jipa.loadInstructions("src/demo.txt");
    Label.buildLabelList();

    for (Label lb : Label.labelList) {
        System.out.println(lb.getName() + "  " +  lb.getLine());
    }
}


} 
