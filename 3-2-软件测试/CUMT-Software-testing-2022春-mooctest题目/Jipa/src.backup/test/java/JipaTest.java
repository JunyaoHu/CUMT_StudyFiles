package net.mooctest;


import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;



import java.util.ArrayList;


public class JipaTest {

    @Before
    public void handleBefore() {
        Jipa.TOTAL_INSTRUCTIONS = 0;
        Jipa.instruction = new String[0];
        Jipa.iPtr = 0;
        Label.labelList = new ArrayList<Label>();
    }

    @Test(timeout = 4000)
    public void test() {

        int int0 = Jipa.getValue("");

    }

    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = -198;
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("~i:kp,m[65(b|-Zc\"");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test1() throws java.lang.Throwable {
        net.mooctest.Jipa.processInstruction("");
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("cp\"");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test2() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments(",Xg&|bO,jL");
        org.junit.Assert.assertEquals(3, stringArray0.length);
        org.junit.Assert.assertNotNull(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test3() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = -82;
        net.mooctest.Jipa.resetInstructions();
    }

    @org.junit.Test(timeout = 4000)
    public void test4() throws java.lang.Throwable {
        net.mooctest.Jipa.processInstruction("");
        net.mooctest.Jipa.resetInstructions();
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("");
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test6() throws java.lang.Throwable {
        boolean boolean0 = net.mooctest.Jipa.isNumeric("00");
        assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test7() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getValue("5");
        org.junit.Assert.assertEquals(5, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test9() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getJumpValue("3");
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.splitArguments(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.removeComment(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.loadInstructions(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.getValue(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.getStringValue(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        net.mooctest.Label.labelList = null;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.getJumpValue("&y-KM3U|`\"%veu m");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getValue("hh7");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments("div");
        org.junit.Assert.assertEquals(1, stringArray0.length);
        org.junit.Assert.assertNotNull(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 512;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.resetInstructions();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("&");
        org.junit.Assert.assertEquals("&", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        net.mooctest.Jipa.opcodes jipa_opcodes0 = net.mooctest.Jipa.opcodes.toOpcode("9htZW\",ACmg");
        org.junit.Assert.assertEquals(net.mooctest.Jipa.opcodes.novalue, jipa_opcodes0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        boolean boolean0 = net.mooctest.Jipa.isNumeric("z^e;mOMx!<&{T3T5k.?");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("\"-S~~MfzEv![ne");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("*<v\"B BI9BoE5[?\"L");
        org.junit.Assert.assertEquals("-1B BI9BoE5[?0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("net.mooctest.Variable");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getJumpValue("00");
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments("IvC}v$Ot@X\"O{7q*,");
        org.junit.Assert.assertEquals(1, stringArray0.length);
        org.junit.Assert.assertNotNull(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments("r5P_S,/TnPd0!");
        org.junit.Assert.assertEquals(2, stringArray0.length);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 22;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.loadInstructions("g1\"");
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("$bvp\u007fb;xs\"pnz");
        org.junit.Assert.assertEquals("$bvp\u007fb;xs\"pnz", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("`y:2pmr.J@wRG\"t;U5");
        org.junit.Assert.assertEquals("`y:2pmr.J@wRG\"t", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jne");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("je");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jz");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jbe");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jae");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("ja");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("and");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("or");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("xor");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("var");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("arr");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("del");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("out");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }



    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        net.mooctest.Jipa.processInstruction("lbl ");
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 22;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.loadInstructions("g1\"");
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jnz");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        net.mooctest.Jipa jipa0 = new net.mooctest.Jipa();
        org.junit.Assert.assertEquals(0, net.mooctest.Jipa.TOTAL_INSTRUCTIONS);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = -156;
        net.mooctest.Label.buildLabelList();
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label((-443), "lbl kdo)~g*w%{");
        label0.getName();
        org.junit.Assert.assertEquals((-443), label0.getLine());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label(852, "");
        label0.getName();
        org.junit.Assert.assertEquals(852, label0.getLine());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label(0, "");
        int int0 = label0.getLine();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label((-156), "lbl ");
        int int0 = label0.getLine();
        org.junit.Assert.assertEquals((-156), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        net.mooctest.Label.labelList = null;
        // Undeclared exception!
        try {
            net.mooctest.Label.findLabel("");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 3345;
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "kdo)~.g*.{";
        net.mooctest.Jipa.instruction = stringArray0;
        // Undeclared exception!
        try {
            net.mooctest.Label.buildLabelList();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label(921, ((java.lang.String) (null)));
        label0.getName();
        org.junit.Assert.assertEquals(921, label0.getLine());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 802;
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "lbl kdo)~g*w%{";
        net.mooctest.Jipa.instruction = stringArray0;
        // Undeclared exception!
        try {
            net.mooctest.Label.buildLabelList();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        net.mooctest.Variable.removeVariable("");
        boolean boolean0 = net.mooctest.Variable.addVariable("&");
        assertTrue(boolean0);
        int int0 = net.mooctest.Variable.getVariableValue("&");
        org.junit.Assert.assertEquals(0, int0);
        net.mooctest.Variable.setVariableValue("&", 0);
        net.mooctest.Variable.removeVariable("&");
        net.mooctest.Variable.setVariableValue("l", 0);
        net.mooctest.Variable.setVariableValue("&", 0);
        boolean boolean1 = net.mooctest.Variable.addVariable("l");
        assertTrue((boolean1 == boolean0));
        assertTrue(boolean1);
        int int1 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int1 == int0));
        org.junit.Assert.assertEquals(0, int1);
        boolean boolean2 = net.mooctest.Variable.addVariable("&");
        assertTrue((boolean2 == boolean0));
        assertTrue((boolean2 == boolean1));
        assertTrue(boolean2);
        net.mooctest.Variable.setVariableValue("", (-1453));
        int int2 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int2 == int0));
        assertTrue((int2 == int1));
        org.junit.Assert.assertEquals(0, int2);
        net.mooctest.Variable.setVariableValue("", 0);
        int int3 = net.mooctest.Variable.getVariableValue("&");
        assertTrue((int3 == int1));
        assertTrue((int3 == int2));
        assertTrue((int3 == int0));
        org.junit.Assert.assertEquals(0, int3);
        int int4 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int4 == int1));
        assertTrue((int4 == int2));
        assertTrue((int4 == int0));
        assertTrue((int4 == int3));
        org.junit.Assert.assertEquals(0, int4);
        boolean boolean3 = net.mooctest.Variable.addVariable("&");
        assertTrue((boolean3 == boolean2));
        assertTrue((boolean3 == boolean1));
        assertTrue((boolean3 == boolean0));
        assertTrue(boolean3);
        boolean boolean4 = net.mooctest.Variable.addVariable("");
        assertTrue((boolean4 == boolean3));
        assertTrue((boolean4 == boolean2));
        assertTrue((boolean4 == boolean0));
        assertTrue((boolean4 == boolean1));
        assertTrue(boolean4);
        net.mooctest.Variable.setVariableValue("", (-1453));
        boolean boolean5 = net.mooctest.Variable.addVariable("");
        org.junit.Assert.assertFalse((boolean5 == boolean2));
        org.junit.Assert.assertFalse((boolean5 == boolean1));
        org.junit.Assert.assertFalse((boolean5 == boolean0));
        org.junit.Assert.assertFalse((boolean5 == boolean4));
        org.junit.Assert.assertFalse((boolean5 == boolean3));
        org.junit.Assert.assertFalse(boolean5);
        boolean boolean6 = net.mooctest.Variable.addVariable("");
        org.junit.Assert.assertFalse((boolean6 == boolean4));
        org.junit.Assert.assertFalse((boolean6 == boolean0));
        org.junit.Assert.assertFalse((boolean6 == boolean2));
        org.junit.Assert.assertFalse((boolean6 == boolean3));
        assertTrue((boolean6 == boolean5));
        org.junit.Assert.assertFalse((boolean6 == boolean1));
        org.junit.Assert.assertFalse(boolean6);
        net.mooctest.Variable.removeVariable("*");
        // Undeclared exception!
        try {
            net.mooctest.Variable.getVariableValue("&");
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }





   
}
