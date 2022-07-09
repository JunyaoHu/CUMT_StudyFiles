package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import net.mooctest.Anagram;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

public class AnagramTest{

  
  
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Anagram anagram0 = new Anagram((-60), "IGNORE_TYPE_VARIABLE_OR_WILDCARD");
      // Undeclared exception!
      try { 
        anagram0.findAllAnagrams((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.mooctest.Anagram", e);
      }
  }



  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Anagram anagram0 = new Anagram("Annotations are not supported.");
      try { 
        anagram0.findAllAnagrams("Annotations are not supported.");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Anagram anagram0 = null;
      try {
        anagram0 = new Anagram((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Anagram anagram0 = null;
      try {
        anagram0 = new Anagram(0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Anagram anagram0 = null;
      try {
        anagram0 = new Anagram("");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }





  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Anagram anagram0 = null;
      try {
        anagram0 = new Anagram(0, "");
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
