package net.mooctest;


import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Set;
import java.util.TreeSet;

import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

public class HelperTest{

  @Test(timeout = 4000)
  public void test(){
      Dictionary dictionary = new Dictionary();
  }
  
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[4];
      char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      char[] charArray2 = Helper.setDifference(charArray1, charArray1);
      boolean boolean0 = Helper.isEquivalent(charArray2, charArray1);
      assertTrue(boolean0);
      assertEquals(0, charArray2.length);
  }
//
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = 'W';
      char[] charArray1 = new char[7];
      boolean boolean0 = Helper.isEquivalent(charArray0, charArray1);
      assertFalse(boolean0);
  }
//
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = 'F';
      boolean boolean0 = Helper.isEquivalent(charArray0, charArray0);
      assertTrue(boolean0);
  }
//
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = ',';
      char[] charArray1 = new char[3];
      boolean boolean0 = Helper.isEquivalent(charArray1, charArray0);
      assertFalse(boolean0);
  }
//
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      char[] charArray1 = new char[0];
      boolean boolean0 = Helper.isEquivalent(charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[3];
      char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      boolean boolean0 = Helper.isSubset(charArray1, charArray0);
      assertTrue(boolean0);
      assertEquals(0, charArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 1);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      setArray0[0] = (Set<String>) treeSet0;
      Set<Set<String>> set0 = Helper.setMultiplication(setArray0);
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Helper.sortWord((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Helper.isSubset((char[]) null, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Helper", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Helper.isEquivalent((char[]) null, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Helper", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 1);
      TreeSet<String> treeSet0 = new TreeSet<String>();
      treeSet0.add("aOd0[4i;BsNi");
      setArray0[0] = (Set<String>) treeSet0;
      Set<Set<String>> set0 = Helper.setMultiplication(setArray0);
      assertEquals(1, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 1);
      // Undeclared exception!
      try { 
        Helper.setMultiplication(setArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Helper", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Set<String>[] setArray0 = (Set<String>[]) Array.newInstance(Set.class, 0);
      Set<Set<String>> set0 = Helper.setMultiplication(setArray0);
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Set<Set<String>> set0 = Helper.setMultiplication((Set<String>[]) null);
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[2];
      char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      boolean boolean0 = Helper.isEquivalent(charArray1, charArray0);
      assertEquals(0, charArray1.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[3];
      char[] charArray1 = new char[3];
      charArray0[2] = '\u0089';
      char[] charArray2 = Helper.setDifference(charArray0, charArray1);
      assertArrayEquals(new char[] {'\u0089'}, charArray2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Helper.setDifference((char[]) null, (char[]) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      char[] charArray0 = new char[3];
      char[] charArray1 = new char[3];
      charArray0[2] = '\u0089';
      boolean boolean0 = Helper.isSubset(charArray0, charArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[2];
      char[] charArray1 = Helper.setDifference(charArray0, charArray0);
      boolean boolean0 = Helper.isSubset(charArray0, charArray1);
      assertEquals(0, charArray1.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = Helper.sortWord("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Helper.sortWord("eHBJ,9IY8v$bIl\"p{(");
      assertEquals("\"$(,89BHIIJYbelpv{", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Helper helper0 = new Helper();
  }
}
