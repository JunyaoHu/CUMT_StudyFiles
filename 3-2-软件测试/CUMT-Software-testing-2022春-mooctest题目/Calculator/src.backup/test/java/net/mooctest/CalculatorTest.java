package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;

/** 
* Calculator Tester. 
* 
* @author <Authors name> 
* @since <pre>5æœ? 26, 2022</pre> 
* @version 1.0 
*/ 
public class CalculatorTest {

/** 
* 
* Method: evaluate(String exp) 
* 
*/
@Test
public void testEvaluate() throws Exception {
    Calculator.expParser=new ExpressionParser(100);
    Assert.assertEquals("4.0", Calculator.evaluate("1 * (2 + 3) / (10 * (64 ^ -0.5))"));
    Calculator.evaluate("x = 3");
    Assert.assertEquals("4.0", Calculator.evaluate("y = <x> + 1"));
    Assert.assertEquals("5.0", Calculator.evaluate("(<x>^2 + <y>^2)^0.5"));
    Assert.assertEquals("2.0", Calculator.evaluate("x = 1 + (y = 1)"));
    Assert.assertEquals("2.0", Calculator.evaluate("<x>"));
    Assert.assertEquals("1.0", Calculator.evaluate("<y>"));
    Calculator.previousAns = Calculator.evaluate("1 * 2 * 3 * 4");
    Assert.assertEquals("24.0", Calculator.previousAns);
    Assert.assertEquals("120.0", Calculator.evaluate("<ans> * 5"));
    Calculator.evaluate("pi = 3.1415926535");
    Calculator.evaluate("e = 2.71828");
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("abs[-1]")), 0.01);
    Assert.assertEquals(0,     Double.parseDouble(Calculator.evaluate("abs[0]")      ),0.01);
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("abs[1]")      ),0.01);
    Assert.assertEquals(2.718, Double.parseDouble(Calculator.evaluate("exp[1]")      ),0.01);
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("log[<e>]")    ),0.01);
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("fct[-1]")     ),0.01);
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("fct[1]" )     ),0.01);
    Assert.assertEquals(2,     Double.parseDouble(Calculator.evaluate("fct[2]" )     ),0.01);
    Assert.assertEquals(120,   Double.parseDouble(Calculator.evaluate("fct[5]" )     ),0.01);
    Assert.assertEquals(180,   Double.parseDouble(Calculator.evaluate("deg[<pi>]")     ),0.01);
    Assert.assertEquals(1.57,  Double.parseDouble(Calculator.evaluate("rad[90]")   ),0.01);
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("sin[<pi>/2]") ),0.01);
    Assert.assertEquals(0,     Double.parseDouble(Calculator.evaluate("cos[<pi>/2]") ),0.01);
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("tan[<pi>/4]") ),0.01);
    Assert.assertEquals(2,     Double.parseDouble(Calculator.evaluate("csc[<pi>/6]") ),0.01);
    Assert.assertEquals(2,     Double.parseDouble(Calculator.evaluate("sec[<pi>/3]") ),0.01);
    Assert.assertEquals(1,     Double.parseDouble(Calculator.evaluate("ctn[<pi>/4]") ),0.01);

}


/** 
* 
* Method: parseCommand(String command) 
* 
*/ 
@Test
public void testParseCommand() throws Exception {
    Calculator.parseCommand("exit");
    Calculator.parseCommand("help");
    Calculator.parseCommand("help vars");
    Calculator.parseCommand("help funcs");
    Calculator.parseCommand("help cmds");
    Calculator.parseCommand("list");
    Calculator.parseCommand("list cmds");
    Calculator.parseCommand("list funcs");
}

    @Test
    public void testParseCommand01() throws Exception {
        Calculator.expParser=new ExpressionParser(3);
        Calculator.evaluate("x = 1^20+2*3/4");
        Calculator.evaluate("pi = 3.1415926535");
        Calculator.evaluate("y = sin[<pi>/2] + abs[ log[exp[fct[(-10) !]]]]");
        Calculator.previousAns = Calculator.evaluate("<x> + <y>");
        Assert.assertEquals("4.5", Calculator.previousAns);
        Calculator.parseCommand("list vars");
        Calculator.previousAns = Calculator.evaluate("<ans> + 0.5");
        Assert.assertEquals("5.0", Calculator.previousAns);
        Calculator.parseCommand("list vars");
    }

} 
