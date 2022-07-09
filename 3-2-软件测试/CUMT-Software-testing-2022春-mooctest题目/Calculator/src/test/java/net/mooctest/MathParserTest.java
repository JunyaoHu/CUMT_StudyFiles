package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* MathParser Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class MathParserTest { 

/** 
* 
* Method: isNumber(String str) 
* 
*/ 
    @Test
    public void testIsNumber() throws Exception {
        Assert.assertTrue(MathParser.isNumber("1"));
    }

    @Test
    public void testIsNumber01() throws Exception {
        Assert.assertTrue(MathParser.isNumber("1.5"));
    }

    @Test
    public void testIsNumber02() throws Exception {
        Assert.assertTrue(MathParser.isNumber("2.05E2"));
    }

    @Test
    public void testIsNumber03() throws Exception {
        Assert.assertFalse(MathParser.isNumber("aaa"));
    }

    @Test
    public void testIsNumber04() throws Exception {
        Assert.assertFalse(MathParser.isNumber("123E2.5"));
    }



        /**
    *
    * Method: factorial(double x)
    *
    */
    @Test
    public void testFactorial() throws Exception {
        Assert.assertEquals(1,MathParser.factorial(-10),0.01);
    }

    @Test
    public void testFactorial01() throws Exception {
        Assert.assertEquals(1,MathParser.factorial(1),0.01);

    }

    @Test
    public void testFactorial02() throws Exception {
        Assert.assertEquals(2,MathParser.factorial(2),0.01);

    }

    @Test
    public void testFactorial03() throws Exception {
        Assert.assertEquals(120,MathParser.factorial(5),0.01);

    }

    /**
    *
    * Method: solveBinaryOperation(double a, String op, double b)
    *
    */
    @Test
    public void testSolveBinaryOperation() throws Exception {
        Assert.assertEquals(1024,MathParser.solveBinaryOperation(2,"^",10),0.01);
        Assert.assertEquals(0,MathParser.solveBinaryOperation(10,"%",2),0.01);
        Assert.assertEquals(1,MathParser.solveBinaryOperation(10,"%",3),0.01);
        Assert.assertEquals(0.2,MathParser.solveBinaryOperation(2,"/",10),0.01);
        Assert.assertEquals(20,MathParser.solveBinaryOperation(2,"*",10),0.01);
        Assert.assertEquals(12,MathParser.solveBinaryOperation(2,"+",10),0.01);
        Assert.assertEquals(-8,MathParser.solveBinaryOperation(2,"-",10),0.01);
    }

    /**
    *
    * Method: solveUnaryFunction(String func, double x)
    *
    */
    @Test
    public void testSolveUnaryFunction() throws Exception {
        double pi = 3.1415926535;
        double e = 2.71828;
        Assert.assertEquals(1,   MathParser.solveUnaryFunction("sin", pi/2),0.01);
        Assert.assertEquals(0,   MathParser.solveUnaryFunction("cos", pi/2),0.01);
        Assert.assertEquals(1,   MathParser.solveUnaryFunction("tan", pi/4),0.01);
        Assert.assertEquals(2,   MathParser.solveUnaryFunction("csc", pi/6),0.01);
        Assert.assertEquals(2,   MathParser.solveUnaryFunction("sec", pi/3),0.01);
        Assert.assertEquals(1,   MathParser.solveUnaryFunction("ctn", pi/4),0.01);
        Assert.assertEquals(pi/2,MathParser.solveUnaryFunction("rad", 90),0.01);
        Assert.assertEquals(180, MathParser.solveUnaryFunction("deg", pi),0.01);
        Assert.assertEquals(1,   MathParser.solveUnaryFunction("fct", -1),0.01);
        Assert.assertEquals(1,   MathParser.solveUnaryFunction("fct", 1),0.01);
        Assert.assertEquals(2,   MathParser.solveUnaryFunction("fct", 2),0.01);
        Assert.assertEquals(120, MathParser.solveUnaryFunction("fct", 5),0.01);
        Assert.assertEquals(10,  MathParser.solveUnaryFunction("abs", -10),0.01);
        Assert.assertEquals(10,  MathParser.solveUnaryFunction("abs", 10),0.01);
        Assert.assertEquals(0,   MathParser.solveUnaryFunction("abs", 0),0.01);
        Assert.assertEquals(e*1, MathParser.solveUnaryFunction("exp", 1),0.01);
        Assert.assertEquals(1,   MathParser.solveUnaryFunction("log", e),0.01);
    }

    @Test (expected= FunctionNotFoundException.class)
    public void testSolveUnaryFunction01() throws FunctionNotFoundException {
        MathParser.solveUnaryFunction("unknown", 1);
    }

} 
