package net.mooctest;


import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.Test;
import org.junit.runner.RunWith;

public class DictionaryTest{

  @Test(timeout = 4000)
  public void test(){
      Dictionary dictionary = new Dictionary();
  }
  
//  @Test(timeout = 4000)
//  public void test00()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("$:");
//      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "ZwH5WHLe'lwyC");
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionaryWithSubsets("$:", "$:", 0);
//      boolean boolean1 = dictionary0.isDictionaryLoaded();
//      assertTrue(boolean1 == boolean0);
//  }

//  @Test(timeout = 4000)
//  public void test01()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[7];
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      FileSystemHandling.shouldAllThrowIOExceptions();
//      try { 
//        dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", (-3));
//        fail("Expecting exception: IOException");
//      
//      } catch(IOException e) {
//         //
//         // Simulated IOException
//         //
//         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      try { 
        dictionary0.loadDictionaryWithSubsets("^~_2g:'5", "T", (-1985));
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      FileSystemHandling.shouldAllThrowIOExceptions();
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      try { 
//        dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
//        fail("Expecting exception: IOException");
//      
//      } catch(IOException e) {
//         //
//         // Simulated IOException
//         //
//         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      try { 
        dictionary0.addWord((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//  @Test(timeout = 4000)
//  public void test05()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      byteArray0[0] = (byte) (-63);
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", (-36));
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      Dictionary dictionary0 = new Dictionary();
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("T");
//      FileSystemHandling.appendLineToFile(evoSuiteFile0, "T");
//      dictionary0.loadDictionaryWithSubsets("T", (String) null, 1);
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", (-36));
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      try { 
        dictionary0.loadDictionaryWithSubsets("", "", 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file path invalid
         //
         verifyException("net.mooctest.Dictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      dictionary0.getDictionaryKeyList();
      assertFalse(dictionary0.isDictionaryLoaded());
  }

//  @Test(timeout = 4000)
//  public void test10()  throws Throwable  {
//      Dictionary dictionary0 = new Dictionary();
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      FileSystemHandling.appendLineToFile(evoSuiteFile0, "isDictionaryLoaded?: false\nDictionary: {}");
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "isDictionaryLoaded?: false\nDictionary: {}", 61);
//      // Undeclared exception!
//      try { 
//        dictionary0.findSingleWordAnagrams("");
//        fail("Expecting exception: IllegalStateException");
//      
//      } catch(IllegalStateException e) {
//         //
//         // word string invalid
//         //
//         verifyException("net.mooctest.Dictionary", e);
//      }
//  }

//  @Test(timeout = 4000)
//  public void test11()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("dictionary not loaded");
//      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionary("dictionary not loaded");
//      // Undeclared exception!
//      try { 
//        dictionary0.findSingleWordAnagrams((String) null);
//        fail("Expecting exception: IllegalStateException");
//      
//      } catch(IllegalStateException e) {
//         //
//         // word string invalid
//         //
//         verifyException("net.mooctest.Dictionary", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      try { 
        dictionary0.findSingleWordAnagrams("U");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // dictionary not loaded
         //
         verifyException("net.mooctest.Dictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      dictionary0.addWord("EBOCK");
      boolean boolean0 = dictionary0.addWord("EBOCK");
      assertFalse(dictionary0.isDictionaryLoaded());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      boolean boolean0 = dictionary0.addWord("");
      assertFalse(dictionary0.isDictionaryLoaded());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      boolean boolean0 = dictionary0.addWord("$:");
      assertTrue(boolean0);
      
      dictionary0.getDictionaryKeyList();
      assertFalse(dictionary0.isDictionaryLoaded());
  }

//  @Test(timeout = 4000)
//  public void test16()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      byteArray0[0] = (byte) (-63);
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionaryWithSubsets("isDictionaryLoaded?: false\nDictionary: {}", "", (byte)60);
//      assertTrue(dictionary0.isDictionaryLoaded());
//  }

//  @Test(timeout = 4000)
//  public void test17()  throws Throwable  {
//      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("isDictionaryLoaded?: false\nDictionary: {}");
//      byte[] byteArray0 = new byte[2];
//      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
//      Dictionary dictionary0 = new Dictionary();
//      dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
//      Set<String> set0 = dictionary0.findSingleWordAnagrams("\"T^1:53.oC^r");
//      assertNull(set0);
//  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      try { 
        dictionary0.loadDictionary("isDictionaryLoaded?: false\nDictionary: {}");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      try { 
        dictionary0.loadDictionaryWithSubsets((String) null, "EBOCK", 14);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file path invalid
         //
         verifyException("net.mooctest.Dictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      String string0 = dictionary0.toString();
      assertEquals("isDictionaryLoaded?: false\nDictionary: {}", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      // Undeclared exception!
      try { 
        dictionary0.loadDictionary("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file path invalid
         //
         verifyException("net.mooctest.Dictionary", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Dictionary dictionary0 = new Dictionary();
      boolean boolean0 = dictionary0.isDictionaryLoaded();
      assertFalse(boolean0);
  }
  
  
  @Test(timeout = 4000)
  public void test1() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("");
      dictionary.addWord("abc");
      dictionary.loadDictionary(fileString);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void test2() throws IllegalArgumentException {
	  Dictionary dictionary = new Dictionary();
	  try {
		dictionary.loadDictionary("");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @Test(timeout = 4000)
  public void test3() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("");
      dictionary.addWord("hj");
      dictionary.loadDictionary(fileString);
  }
  
  @Test(timeout = 4000)
  public void test4() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("");
      dictionary.addWord("hjyy");
      dictionary.addWord("hjyz");
      dictionary.loadDictionary(fileString);
  }
  
  @Test(timeout = 4000)
  public void test5() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("hjyz");
      dictionary.loadDictionary(fileString);
      dictionary.findSingleWordAnagrams("hjyz");

  }
  
  @Test(expected = IllegalStateException.class)
  public void test6() throws IllegalStateException {
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
	  Dictionary dictionary = new Dictionary();
	  dictionary.addWord("hjy");
	  dictionary.findSingleWordAnagrams("hjy");
	  
  }
  
  @Test(expected = IllegalStateException.class)
  public void test7() throws Exception{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("hjyz");
      dictionary.loadDictionary(fileString);
      dictionary.findSingleWordAnagrams("");

  }
  
  @Test(timeout = 4000)
  public void test8() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("abcd");
      dictionary.isDictionaryLoaded();
      dictionary.loadDictionary(fileString);
      dictionary.isDictionaryLoaded();
      dictionary.findSingleWordAnagrams("abcd");

  }
  
  @Test(timeout = 4000)
  public void test9() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("abcd");
      dictionary.loadDictionary(fileString);
      dictionary.getDictionaryKeyList();

  }
  
  @Test(timeout = 4000)
  public void test10() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      dictionary.addWord("abcd");
      dictionary.loadDictionary(fileString);
      dictionary.toString();

  }
  
  @Test(timeout = 4000)
  public void test11() throws IOException{
	  String fileString = "C:\\Users\\hujunyao\\Desktop\\demotest.txt";
      Dictionary dictionary = new Dictionary();
      Anagram anagram1 = new Anagram(fileString);
      Anagram anagram2 = new Anagram(2,fileString);
      anagram2.findAllAnagrams("hjy");
      anagram2.findAllAnagrams("hjy hy");
  }
  
  
  
  
  
  
}
