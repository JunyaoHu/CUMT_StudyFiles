package net.mooctest; 

import org.junit.Assert;
import org.junit.Test;
/** 
* ExpressionParser Tester. 
* 
* @author <Authors name> 
* @since <pre>5�� 26, 2022</pre> 
* @version 1.0 
*/ 
public class ExpressionParserTest { 


    /**
    *
    * Method: addVariable(String name, String value)
    *
    */
    @Test
    public void testAddVariable() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.addVariable("v1", "10");
        ep.addVariable("v2", "20");
        ep.addVariable("v1", "30");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddVariable1() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.addVariable("v1", "10");
        ep.addVariable("v2", "20");
        ep.addVariable("v3", "30");
    }

        /**
    *
    * Method: evaluate(String exp)
    *
    */
    @Test(expected = NullExpressionException.class)
    public void testEvaluate1() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.evaluate("          ");
    }

    @Test
    public void testEvaluate2() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.evaluate("  v1     =   10   ");
        Assert.assertEquals("20.0", ep.evaluate("  v2     =   20   "));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testEvaluate3() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.evaluate("  v1     =   10   ");
        ep.evaluate("  v2     =   20   ");
        ep.evaluate("  v3     =   30   ");
    }

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate4() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.evaluate("  v1     =   10   ");
        ep.evaluate("  v2     =   abc   ");
    }


//    exp = parseVariables(exp);
//    exp = parseParenthesis(exp);
//    exp = parseFunctions(exp);

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate5() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.evaluate("  1 +   ");
    }

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate6() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.evaluate("  sin[   ");
    }

    @Test(expected = ExpressionParserException.class)
    public void testEvaluate7() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.evaluate("  (5+2)+(aa)  ");
    }

    /**
* 
* Method: parseVariables(String exp) 
* 
*/ 
@Test
public void testParseVariables() throws Exception {
    ExpressionParser ep = new ExpressionParser(2);
    ep.evaluate("  v1     =   10   ");
    ep.evaluate("  v2     =   20   ");
    Assert.assertEquals("10.0 + -20.0", ep.parseVariables("    <   v1   > -<  v2  > "));
}

@Test
public void testParseVariables01() throws Exception {
    ExpressionParser ep = new ExpressionParser(2);
    ep.evaluate("  v1     =   10   ");
    ep.evaluate("  v2     =   20   ");
    Assert.assertEquals("10.0  -<", ep.parseVariables("    <   v1   > -<"));
}

@Test(expected = VariableNotFoundException.class)
public void testParseVariables02() throws Exception {
    ExpressionParser ep = new ExpressionParser(2);
    ep.evaluate("  v1     =   10   ");
    ep.evaluate("  v2     =   20   ");
    ep.parseVariables("    <   v1   > - <  v3  > ");
}

    /**
* 
* Method: parseParenthesis(String exp) 
* 
*/ 
@Test
public void testParseParenthesis() throws Exception {
    ExpressionParser ep = new ExpressionParser(2);
    Assert.assertEquals("1  +  2.0", ep.parseParenthesis("1 + 2.0"));
    Assert.assertEquals("1  +  -1.0", ep.parseParenthesis("1 +(  2.0 + -3  )"));
    Assert.assertEquals("1 + -5.0", ep.parseParenthesis("1 -(  2.0 + 3  )"));
}

    @Test(expected = UnmatchedBracketsException.class)
    public void testParseParenthesis01() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseParenthesis("(");
    }

    @Test(expected = ExpressionParserException.class)
    public void testParseParenthesis02() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseParenthesis("(aaa + 2)");
    }

    /**
* 
* Method: parseFunctions(String exp) 
* 
*/ 
    @Test
    public void testParseFunctions() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        Assert.assertEquals("120.0", ep.parseFunctions("5 !"));
        Assert.assertEquals("120.0", ep.parseFunctions("fct[5]"));
        Assert.assertEquals("6.0", ep.parseFunctions("fct[1+2]"));
        Assert.assertEquals("-6.0", ep.parseFunctions("-fct[1+2]"));
        Assert.assertEquals("-1.0", ep.parseFunctions("-fct[1+(2 - 3.0)]"));
    }

    @Test(expected = FunctionNotFoundException.class)
    public void testParseFunctions00() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseFunctions("fun1[5]");
    }

    @Test(expected = FunctionNotFoundException.class)
    public void testParseFunctions01() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseFunctions("fun1[5]");
    }

    @Test(expected = ExpressionParserException.class)
    public void testParseFunctions02() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseFunctions("fun[5");
    }

    @Test(expected = MissingOperandException.class)
    public void testParseFunctions04() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseFunctions("fct[      ]");
    }

    @Test(expected = UnmatchedBracketsException.class)
    public void testParseFunctions05() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseFunctions("sin[[[[");
    }


    /**
* 
* Method: parseOperators(String exp) 
* 
*/ 
    @Test
    public void testParseOperators() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        Assert.assertEquals("0.0",ep.parseOperators("1 - 2 * 3 / 2 + 2"));
    }

    @Test(expected = ExpressionParserException.class)
    public void testParseOperators1() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseOperators("1 - 2 * a / 2 + 2");
    }

    @Test(expected = ExpressionParserException.class)
    public void testParseOperators2() throws Exception {
        ExpressionParser ep = new ExpressionParser(2);
        ep.parseOperators(" + ");
    }
    /**
    *
    * Method: adjustNumberSpacing(String exp)
    *
    */
    @Test
    public void testAdjustNumberSpacing() throws Exception {
        Assert.assertEquals("  1 + +2  ", ExpressionParser.adjustNumberSpacing("1+2"));
        Assert.assertEquals(" 1  +  2  -  -3  +   4.2 + -1e-2  ", ExpressionParser.adjustNumberSpacing("1 + 2 - -3 + 4.2-1e-2"));
    }

/** 
* 
* Method: indexOfMatchingBracket(String str, int pos, char open, char close) 
* 
*/ 
    @Test
    public void testIndexOfMatchingBracket() throws Exception {
        Assert.assertEquals(3,ExpressionParser.indexOfMatchingBracket("(())(()())(()",0,'(',')'));
        Assert.assertEquals(9,ExpressionParser.indexOfMatchingBracket("(())(()())(()",4,'(',')'));
    }

    @Test(expected = UnmatchedBracketsException.class)
    public void testIndexOfMatchingBracket01() throws Exception {
        ExpressionParser.indexOfMatchingBracket("(())(()())(()",100,'(',')');
    }

    @Test(expected = UnmatchedBracketsException.class)
    public void testIndexOfMatchingBracket02() throws Exception {
        ExpressionParser.indexOfMatchingBracket("(())(()())(()",10,'(',')');
    }
} 
