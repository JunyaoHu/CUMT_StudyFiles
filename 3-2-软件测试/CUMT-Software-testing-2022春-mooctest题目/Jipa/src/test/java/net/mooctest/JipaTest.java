package net.mooctest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.security.AccessControlException;
import java.security.Permission;

import org.junit.Test;

public class JipaTest {
//  @Test((expected = ExitException.class))
//  public void test1()
//  {
//	  
//  }
  @Test(timeout = 4000)
  public void test() {
	  Jipa j = new Jipa();
	  int int0 = Jipa.getValue("");
	  Jipa.getValue("1");
	  Jipa.processInstruction("mov \"Al\",100");
	  Jipa.processInstruction("");
	  Jipa.processInstruction("mov Al,100");
	  Jipa.processInstruction("mov *Al,100");
	  Jipa.processInstruction("cpy Al,100");
	  Jipa.processInstruction("set Al,100");
	  Jipa.processInstruction("set BL,100");
	  Jipa.processInstruction("del AL");
	  Jipa.processInstruction("del &BL");
	  Jipa.processInstruction("del &AL");
	  Jipa.processInstruction("arr 100,100");
	  Jipa.processInstruction("var 100,100");
	  Jipa.processInstruction("var 101,100");
	  Jipa.processInstruction("var &101,100");
	  Jipa.processInstruction("del 101");
//	  Jipa.processInstruction("in AL");
	  Jipa.processInstruction("inc Al");
	  Jipa.processInstruction("dec Al");
	  Jipa.processInstruction("add 100,100");
	  Jipa.processInstruction("sub 100,100");
	  Jipa.processInstruction("mul 100,100");
	  Jipa.processInstruction("div 100,100");
	  Jipa.processInstruction("mod 100,100");
	  Jipa.processInstruction("xor 100,100");
	  Jipa.processInstruction("or 100,100");
	  Jipa.processInstruction("and 100,100");
	  Jipa.processInstruction("jmp 100,100");
	  
	  Jipa.processInstruction("jnz 100,100");
	  Jipa.processInstruction("jnz 0");
	  Jipa.processInstruction("ja 100,100,100");
	  Jipa.processInstruction("ja 100,99,100");
	  Jipa.processInstruction("jae 100,99,100");
	  Jipa.processInstruction("jae 100,101,100");
	  Jipa.processInstruction("jb 100,100,100");
	  Jipa.processInstruction("jb 100,101,100");
	  Jipa.processInstruction("jbe 100,101,100");
	  Jipa.processInstruction("jbe 100,99,100");
	  Jipa.processInstruction("jz 0,100");
	  Jipa.processInstruction("jz 1,100");
	  Jipa.processInstruction("je 100,100,100");
	  Jipa.processInstruction("je 10,100,100");
	  Jipa.processInstruction("jne 100,99,al");
	  Jipa.processInstruction("jne 100,100,Al");
	  Jipa.processInstruction("cmp 100,100,100");
	  Jipa.processInstruction("cmp 100,99,AL");
	  Jipa.processInstruction("out 100");
	  Jipa.processInstruction("out 1\"100\"");
	  Jipa.processInstruction("out \"100\"");
	  Jipa.processInstruction("out 1\"100");
	  Jipa.processInstruction("out 1\"100,");
	  
	  Label l = new Label(1,"1");
	  l.getName();
	  l.getLine();
	  l.findLabel("1");
	  try
	  {
		  String str= "as";
		  System.setIn(new ByteArrayInputStream(str.getBytes()));
		  Jipa.processInstruction("in AL");
		  str= "1";
		  System.setIn(new ByteArrayInputStream(str.getBytes()));
		  Jipa.processInstruction("in AL");
		  FileWriter fw = new FileWriter("1.txt");
		  fw.write("1231321\n");
		  fw.write("1231321;\n");
		  fw.write("\"1231321;\"\n");
		  fw.write("lbl \"1231321;\"\n");
		  fw.flush();
		  fw.close();
//		  f.createNewFile();
		  str= "./1.txt";
		  System.setIn(new ByteArrayInputStream(str.getBytes()));
		  Jipa.loadInstructions("");
		  Jipa.loadInstructions("1.txt");
		  Jipa.processInstruction("var AL,100");
		  Jipa.processInstruction("var BL,100");
		  Jipa.processInstruction("jmp \"1231321;\",100");
		  Jipa.processInstruction("jmp BL,100");
		  Jipa.loadInstructions("1");
//		  Jipa.loadInstructions("");
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  

//	  Jipa.loadInstructions("q");
//	  Jipa.loadInstructions("C:\\mooctest\\projects\\6537\\119455\\Calculator");
//	  Jipa.processInstruction("halt 100,100");
	  
	  
  }

}