/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
// *******************************************
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                          *
// *******************************************
/**
 * Class Name: Jipa
 * Class Use: This class is the core of the interpreter, handling
 *            the processing and interpreting of the code.
 * @author Dominic Charley-Roy
 */
import java.io.*;
import java.util.*;

@java.lang.SuppressWarnings({"fallthrough"}) public class Jipa {public static class __CLR4_4_100l3zcakfi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0033\u0037\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u004a\u0069\u0070\u0061\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1654314757275L,8589935092L,271,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int TOTAL_INSTRUCTIONS=0;
    public static String[] instruction = new String[0];
    public static int iPtr = 0;

    public enum opcodes{
        halt, novalue,                            // System Commands
        set, mov, cpy, var, del, arr,             // Setting Commands
        add, sub, mul, div, mod,                  // Arithmethic
        inc, dec,                                 // Increment / Decrement
        in, out,                                  // Input/Output commands
        jmp, jnz, jz, je, ja, jae, jb, jbe, jne,  // Jump commands
        xor, or, and,                             // Logical Arithmethic
        cmp                                       // Compare commands
        ;

        public static opcodes toOpcode(String str)
        {try{__CLR4_4_100l3zcakfi.R.inc(0);
            __CLR4_4_100l3zcakfi.R.inc(1);try {
                __CLR4_4_100l3zcakfi.R.inc(2);return valueOf(str);
            } catch (Exception e){
                __CLR4_4_100l3zcakfi.R.inc(3);return novalue;
            }
        }finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}
    }

    public static void processInstruction(String instruction)
    {try{__CLR4_4_100l3zcakfi.R.inc(4);
        //////////////////////////////////////
        // Instruction Format               //
        // ------------------               //
        // opcode (operand[0](,operand[1])) //
        //////////////////////////////////////
        __CLR4_4_100l3zcakfi.R.inc(5);String opcode;
        __CLR4_4_100l3zcakfi.R.inc(6);String operand[];
        __CLR4_4_100l3zcakfi.R.inc(7);int spaceLoc = instruction.indexOf(' '), commaLoc = instruction.indexOf(',');

        // Get the op code and operands
        
        __CLR4_4_100l3zcakfi.R.inc(8);if ((((spaceLoc != -1)&&(__CLR4_4_100l3zcakfi.R.iget(9)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(10)==0&false)))
        {{
            __CLR4_4_100l3zcakfi.R.inc(11);opcode = instruction.substring(0, spaceLoc);

            // Split up arguments and parse them to an array
            //operand = instruction.substring(spaceLoc+1).split(",");
            //operand = new int[operandString.length];
            //for (int i = 0; i < operandString.length; i++)
            //    operand[i] = Integer.parseInt(operandString[i]);
            __CLR4_4_100l3zcakfi.R.inc(12);operand = splitArguments(instruction.substring(spaceLoc+1));
        }
        }else
        {{
            // No arguments
            __CLR4_4_100l3zcakfi.R.inc(13);opcode = instruction;
            __CLR4_4_100l3zcakfi.R.inc(14);operand = new String[1];
        }

        }boolean __CLB4_4_1_bool0=false;__CLR4_4_100l3zcakfi.R.inc(15);switch (opcodes.toOpcode(opcode.toLowerCase()))
        {
            case halt:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(16);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(17);System.exit(0);
                __CLR4_4_100l3zcakfi.R.inc(18);break;

            // out r - Displays a string value
            case out:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(19);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(20);System.out.println(getStringValue(operand[0]));
                __CLR4_4_100l3zcakfi.R.inc(21);break;


            // in var1 - Reads for user input (integer) and places it in r1
            case in:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(22);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(23);Variable.setVariableValue(operand[0], readValue());
                __CLR4_4_100l3zcakfi.R.inc(24);break;

            // mov var1, var2 - moves the value of variable 1 to variable 2
            case mov:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(25);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(26);Variable.setVariableValue(operand[1], Variable.getVariableValue(operand[0]));
                __CLR4_4_100l3zcakfi.R.inc(27);Variable.setVariableValue(operand[0], 0);
                __CLR4_4_100l3zcakfi.R.inc(28);break;

            // cpy var1, var2 - copies the value of variable 1 to variable 2
            case cpy:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(29);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(30);Variable.setVariableValue(operand[1], Variable.getVariableValue(operand[0]));
                __CLR4_4_100l3zcakfi.R.inc(31);break;

            // set var1,(n/var2) - sets the value of variable var1 to either n or var2
            case set:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(32);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(33);Variable.setVariableValue(operand[0],getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(34);break;

            // del var1 - removes the variable, consequently shifting all above pointers down by one
            case del:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(35);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(36);Variable.removeVariable(operand[0]);
                __CLR4_4_100l3zcakfi.R.inc(37);break;

            // arr var, n - Creates an array named var1 with n elements. First element
            //              is called var, all consequent ones are var1, var2,..,varn-1
            case arr:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(38);__CLB4_4_1_bool0=true;}
                // Create first one
                __CLR4_4_100l3zcakfi.R.inc(39);Variable.addVariable(operand[0]);

                __CLR4_4_100l3zcakfi.R.inc(40);for (int i=1;(((i<Integer.parseInt(operand[1]))&&(__CLR4_4_100l3zcakfi.R.iget(41)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(42)==0&false));i++)
                    {__CLR4_4_100l3zcakfi.R.inc(43);Variable.addVariable(operand[0]+""+i);

                }__CLR4_4_100l3zcakfi.R.inc(44);break;

            // var string - creates a variable named string
            case var:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(45);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(46);Variable.addVariable(operand[0]);
                __CLR4_4_100l3zcakfi.R.inc(47);break;

            // inc var1 - Increments var1 value
            case inc:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(48);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(49);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) + 1);
                __CLR4_4_100l3zcakfi.R.inc(50);break;

            // dec r1 - Decrements var1 value
            case dec:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(51);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(52);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) - 1);
                __CLR4_4_100l3zcakfi.R.inc(53);break;
                
            // add var1, n|var2 - adds the values of n/variable2 to variable1
            case add:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(54);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(55);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) + getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(56);break;

            // sub var1, var2 - subsract variable2 value from variable 1 value
            case sub:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(57);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(58);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) - getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(59);break;

            // mul var1, var2 - multiply variable1 value by variable2 value
            case mul:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(60);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(61);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) * getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(62);break;

            // div var1, var2 - divide variable1 value by variable2 value
            case div:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(63);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(64);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) / getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(65);break;

            // mod var1, var2 - modulus variable1 value by variable 2 value
            case mod:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(66);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(67);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) % getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(68);break;

            // xor var1, var2 - xors the values of variable2 to variable1
            case xor:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(69);__CLB4_4_1_bool0=true;}

                __CLR4_4_100l3zcakfi.R.inc(70);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) ^ getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(71);break;

            // or var1, var2 - ors the values of variable2 to variable1
            case or:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(72);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(73);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) | getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(74);break;

            // and var1,va r2 - ors the values of variable2 to variable1
            case and:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(75);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(76);Variable.setVariableValue(operand[0], Variable.getVariableValue(operand[0]) + getValue(operand[1]));
                __CLR4_4_100l3zcakfi.R.inc(77);break;

            // jmp l1 - jump to line l1
            case jmp:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(78);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(79);iPtr = getJumpValue(operand[0]);
                __CLR4_4_100l3zcakfi.R.inc(80);break;

            // jnz var1, l1 - Jump to line l1 if variable1 is not zero
            case jnz:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(81);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(82);if ((((getValue(operand[0]) != 0)&&(__CLR4_4_100l3zcakfi.R.iget(83)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(84)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(85);iPtr = getJumpValue(operand[1]);
                }__CLR4_4_100l3zcakfi.R.inc(86);break;

            // ja var1,var2,l1 - Jump to line l1 if variable1 is above variable2
            case ja:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(87);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(88);if ((((getValue(operand[0]) > getValue(operand[1]))&&(__CLR4_4_100l3zcakfi.R.iget(89)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(90)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(91);iPtr = getJumpValue(operand[2]);
                }__CLR4_4_100l3zcakfi.R.inc(92);break;

            // jae var1,var2,l1 - Jump to line l1 if variable 1 is above or equal variable2
            case jae:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(93);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(94);if ((((getValue(operand[0]) >= getValue(operand[1]))&&(__CLR4_4_100l3zcakfi.R.iget(95)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(96)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(97);iPtr = getJumpValue(operand[2]);
                }__CLR4_4_100l3zcakfi.R.inc(98);break;

            // jb var1,var2,l1 - Jump to line l1 if variable 1 is below variable2
            case jb:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(99);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(100);if ((((getValue(operand[0]) < getValue(operand[1]))&&(__CLR4_4_100l3zcakfi.R.iget(101)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(102)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(103);iPtr = getJumpValue(operand[2]);
                }__CLR4_4_100l3zcakfi.R.inc(104);break;

            // jbe var1,var2,l1 - Jump to line l1 if variable 1 is below or equal variable2
            case jbe:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(105);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(106);if ((((getValue(operand[0]) <= getValue(operand[1]))&&(__CLR4_4_100l3zcakfi.R.iget(107)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(108)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(109);iPtr = getJumpValue(operand[2]);
                }__CLR4_4_100l3zcakfi.R.inc(110);break;

            // jz var1, l1 - Jump to the line l1 if variable 1 is zero
            case jz:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(111);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(112);if ((((getValue(operand[0]) == 0)&&(__CLR4_4_100l3zcakfi.R.iget(113)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(114)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(115);iPtr = getJumpValue(operand[1]);
                }__CLR4_4_100l3zcakfi.R.inc(116);break;

           // je r2, r2, l1 - Jump to the line l1 if variable 1 and 2 are equal
            case je:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(117);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(118);if ((((getValue(operand[0]) == getValue(operand[1]))&&(__CLR4_4_100l3zcakfi.R.iget(119)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(120)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(121);iPtr = getJumpValue(operand[2]);
                }__CLR4_4_100l3zcakfi.R.inc(122);break;

            // jne r2, r2, l1 - Jump to the line l1 if variable 1 and 2 are not equal
            case jne:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(123);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(124);if ((((getValue(operand[0]) != getValue(operand[1]))&&(__CLR4_4_100l3zcakfi.R.iget(125)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(126)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(127);iPtr = getJumpValue(operand[2]);
                }__CLR4_4_100l3zcakfi.R.inc(128);break;

            // cmp r1, r2, r3 - Compares r1 and r2. If they are equal, places 1 in r3. If not, places 0.
            case cmp:if (!__CLB4_4_1_bool0) {__CLR4_4_100l3zcakfi.R.inc(129);__CLB4_4_1_bool0=true;}
                __CLR4_4_100l3zcakfi.R.inc(130);if ((((getValue(operand[1]) == getValue(operand[0]))&&(__CLR4_4_100l3zcakfi.R.iget(131)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(132)==0&false)))
                    {__CLR4_4_100l3zcakfi.R.inc(133);Variable.setVariableValue(operand[2], 1);
                }else
                    {__CLR4_4_100l3zcakfi.R.inc(134);Variable.setVariableValue(operand[2], 0);
                }__CLR4_4_100l3zcakfi.R.inc(135);break;

        }
        
        __CLR4_4_100l3zcakfi.R.inc(136);iPtr++;
        __CLR4_4_100l3zcakfi.R.inc(137);return;


    }finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static String getFileName()
    {try{__CLR4_4_100l3zcakfi.R.inc(138);
        __CLR4_4_100l3zcakfi.R.inc(139);Scanner in = new Scanner(System.in);
        __CLR4_4_100l3zcakfi.R.inc(140);System.out.println("Enter the full path to the file or type q to quit :");
        __CLR4_4_100l3zcakfi.R.inc(141);return in.nextLine();
    }finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static boolean loadInstructions(String fileName)
    {try{__CLR4_4_100l3zcakfi.R.inc(142);
        __CLR4_4_100l3zcakfi.R.inc(143);String currentLine;
        __CLR4_4_100l3zcakfi.R.inc(144);int i=0;

        // Reset instructions before we do anything
        __CLR4_4_100l3zcakfi.R.inc(145);resetInstructions();

        // Get file name if we don't have one
        __CLR4_4_100l3zcakfi.R.inc(146);if ((((fileName.isEmpty())&&(__CLR4_4_100l3zcakfi.R.iget(147)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(148)==0&false)))
            {__CLR4_4_100l3zcakfi.R.inc(149);fileName = getFileName();

        // Check if user wants to quit
        }__CLR4_4_100l3zcakfi.R.inc(150);if ((((fileName.equalsIgnoreCase("q"))&&(__CLR4_4_100l3zcakfi.R.iget(151)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(152)==0&false)))
            {__CLR4_4_100l3zcakfi.R.inc(153);System.exit(0);
       
        }__CLR4_4_100l3zcakfi.R.inc(154);try {
            // Initialize file reader
            __CLR4_4_100l3zcakfi.R.inc(155);FileInputStream fin = new FileInputStream(fileName);
            __CLR4_4_100l3zcakfi.R.inc(156);BufferedReader inputFile = new BufferedReader(new InputStreamReader(fin));

            // Count the number of lines
            __CLR4_4_100l3zcakfi.R.inc(157);LineNumberReader linecount = new LineNumberReader(new FileReader(fileName));
            __CLR4_4_100l3zcakfi.R.inc(158);while ((currentLine = linecount.readLine()) != null){{}
            }__CLR4_4_100l3zcakfi.R.inc(161);TOTAL_INSTRUCTIONS = linecount.getLineNumber();
            __CLR4_4_100l3zcakfi.R.inc(162);instruction = new String[TOTAL_INSTRUCTIONS];
            __CLR4_4_100l3zcakfi.R.inc(163);linecount.close();

            // Read every line and parse it to the instruction array
            __CLR4_4_100l3zcakfi.R.inc(164);while ((currentLine = inputFile.readLine()) != null )
            {{
                // Is there a comment in the line? Remove it
                __CLR4_4_100l3zcakfi.R.inc(167);currentLine = removeComment(currentLine);

                // Add the instruction to the list
                __CLR4_4_100l3zcakfi.R.inc(168);instruction[i]=currentLine.trim();
                __CLR4_4_100l3zcakfi.R.inc(169);i++;
            }

            // Build label list
            }__CLR4_4_100l3zcakfi.R.inc(170);Label.buildLabelList();
        }
        catch (Exception e) {
            __CLR4_4_100l3zcakfi.R.inc(171);e.printStackTrace();
            //System.out.println(fileName);
            //System.out.println("File not found. Please enter another one.");
            __CLR4_4_100l3zcakfi.R.inc(172);return false;
        }

        __CLR4_4_100l3zcakfi.R.inc(173);return true;
    }finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static String removeComment(String line)
    {try{__CLR4_4_100l3zcakfi.R.inc(174);
        __CLR4_4_100l3zcakfi.R.inc(175);if ((((line.lastIndexOf(';') == -1)&&(__CLR4_4_100l3zcakfi.R.iget(176)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(177)==0&false)))
            {__CLR4_4_100l3zcakfi.R.inc(178);return line.trim();
        }else
            // Check to make sure the semi colon isn't in quotes.
            {__CLR4_4_100l3zcakfi.R.inc(179);if ((((line.lastIndexOf(';') > line.lastIndexOf('"'))&&(__CLR4_4_100l3zcakfi.R.iget(180)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(181)==0&false)))
                {__CLR4_4_100l3zcakfi.R.inc(182);return line.substring(0,line.lastIndexOf(';')).trim();
            }else
                {__CLR4_4_100l3zcakfi.R.inc(183);return line.trim();
    }}}finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static void resetInstructions()
    {try{__CLR4_4_100l3zcakfi.R.inc(184);
        __CLR4_4_100l3zcakfi.R.inc(185);for (int i = 0; (((i < TOTAL_INSTRUCTIONS)&&(__CLR4_4_100l3zcakfi.R.iget(186)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(187)==0&false)); i++)
            {__CLR4_4_100l3zcakfi.R.inc(188);instruction[i]="";
    }}finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static String[] splitArguments(String original)
    {try{__CLR4_4_100l3zcakfi.R.inc(189);
        __CLR4_4_100l3zcakfi.R.inc(190);int lastArg = 0;
        __CLR4_4_100l3zcakfi.R.inc(191);String[] args;
        __CLR4_4_100l3zcakfi.R.inc(192);Collection<String> argList = new ArrayList<String>();
        __CLR4_4_100l3zcakfi.R.inc(193);boolean inQuotes=false;

        // Check if there are no arguments
        __CLR4_4_100l3zcakfi.R.inc(194);if ((((original.indexOf(',') == -1)&&(__CLR4_4_100l3zcakfi.R.iget(195)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(196)==0&false))){{
            __CLR4_4_100l3zcakfi.R.inc(197);args = new String[1];
            __CLR4_4_100l3zcakfi.R.inc(198);args[0]=original.trim();
            __CLR4_4_100l3zcakfi.R.inc(199);return args;
        }

        // Add each argument found to the collection
        }__CLR4_4_100l3zcakfi.R.inc(200);for (int i = 0;(((i < original.length())&&(__CLR4_4_100l3zcakfi.R.iget(201)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(202)==0&false));i++)
        {{
            // Are we in quotes
            __CLR4_4_100l3zcakfi.R.inc(203);if ((((original.charAt(i)== '"')&&(__CLR4_4_100l3zcakfi.R.iget(204)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(205)==0&false)))
            {{
                __CLR4_4_100l3zcakfi.R.inc(206);inQuotes = !inQuotes;
            } }else {__CLR4_4_100l3zcakfi.R.inc(207);if((((original.charAt(i)==',' && inQuotes==false)&&(__CLR4_4_100l3zcakfi.R.iget(208)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(209)==0&false)))
            {{
                __CLR4_4_100l3zcakfi.R.inc(210);argList.add(original.substring(lastArg,i).trim());
                __CLR4_4_100l3zcakfi.R.inc(211);lastArg = i+1;
            }
        }}}
        
        // Add the last argument
        }__CLR4_4_100l3zcakfi.R.inc(212);argList.add(original.substring(lastArg).trim());
        
        // Convert it to a string array.
        __CLR4_4_100l3zcakfi.R.inc(213);args = (String[]) argList.toArray(new String[0]);

        __CLR4_4_100l3zcakfi.R.inc(214);return args;
        
    }finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static int getValue(String operand)
    {try{__CLR4_4_100l3zcakfi.R.inc(215);
        __CLR4_4_100l3zcakfi.R.inc(216);if ((((!isNumeric(operand))&&(__CLR4_4_100l3zcakfi.R.iget(217)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(218)==0&false)))
        {{
            __CLR4_4_100l3zcakfi.R.inc(219);return Variable.getVariableValue(operand);
        } }else {{
            __CLR4_4_100l3zcakfi.R.inc(220);return Integer.parseInt(operand);
        }
    }}finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static int getJumpValue(String operand)
    {try{__CLR4_4_100l3zcakfi.R.inc(221);
        __CLR4_4_100l3zcakfi.R.inc(222);if ((((isNumeric(operand))&&(__CLR4_4_100l3zcakfi.R.iget(223)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(224)==0&false)))
            {__CLR4_4_100l3zcakfi.R.inc(225);return Integer.parseInt(operand) - 1;
        }else 
            {__CLR4_4_100l3zcakfi.R.inc(226);return Label.findLabel(operand) - 1;

    }}finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static int readValue()
    {try{__CLR4_4_100l3zcakfi.R.inc(227);
        __CLR4_4_100l3zcakfi.R.inc(228);Scanner in = new Scanner(System.in);
        __CLR4_4_100l3zcakfi.R.inc(229);String tmpInt = in.nextLine();
        __CLR4_4_100l3zcakfi.R.inc(230);if ((((isNumeric(tmpInt))&&(__CLR4_4_100l3zcakfi.R.iget(231)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(232)==0&false)))
            {__CLR4_4_100l3zcakfi.R.inc(233);return Integer.parseInt(tmpInt);
        }else
            {__CLR4_4_100l3zcakfi.R.inc(234);return 0;
    }}finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static String getStringValue(String original)
    {try{__CLR4_4_100l3zcakfi.R.inc(235);
        __CLR4_4_100l3zcakfi.R.inc(236);String finalString = "";
        __CLR4_4_100l3zcakfi.R.inc(237);boolean inQuotes = false;
        __CLR4_4_100l3zcakfi.R.inc(238);int lastQuotes = 0;

        // Check if there is any quotes?
        __CLR4_4_100l3zcakfi.R.inc(239);if ((((original.indexOf('"') == -1)&&(__CLR4_4_100l3zcakfi.R.iget(240)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(241)==0&false)))
            {__CLR4_4_100l3zcakfi.R.inc(242);return Integer.toString(getValue(original));

        // Loop through every character and process quotes
        }__CLR4_4_100l3zcakfi.R.inc(243);for (int i = 0;(((i < original.length())&&(__CLR4_4_100l3zcakfi.R.iget(244)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(245)==0&false));i++)
        {{
            __CLR4_4_100l3zcakfi.R.inc(246);if ((((original.charAt(i) == '"')&&(__CLR4_4_100l3zcakfi.R.iget(247)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(248)==0&false))){{
                __CLR4_4_100l3zcakfi.R.inc(249);if ((((inQuotes)&&(__CLR4_4_100l3zcakfi.R.iget(250)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(251)==0&false)))
                {{
                    __CLR4_4_100l3zcakfi.R.inc(252);finalString = finalString + original.substring(lastQuotes,i);
                    __CLR4_4_100l3zcakfi.R.inc(253);inQuotes=false;
                    __CLR4_4_100l3zcakfi.R.inc(254);lastQuotes=i+1;
                } }else {{
                    __CLR4_4_100l3zcakfi.R.inc(255);inQuotes=true;
                    __CLR4_4_100l3zcakfi.R.inc(256);if ((((i!=0)&&(__CLR4_4_100l3zcakfi.R.iget(257)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(258)==0&false)))
                        {__CLR4_4_100l3zcakfi.R.inc(259);finalString = finalString + getValue(original.substring(lastQuotes,i));
                    }__CLR4_4_100l3zcakfi.R.inc(260);lastQuotes=i+1;
                }
            }}
        }}

        // Check if there is any values at the end that haven't been processed.
        }__CLR4_4_100l3zcakfi.R.inc(261);if ((((lastQuotes != original.length())&&(__CLR4_4_100l3zcakfi.R.iget(262)!=0|true))||(__CLR4_4_100l3zcakfi.R.iget(263)==0&false)))
             {__CLR4_4_100l3zcakfi.R.inc(264);finalString = finalString + getValue(original.substring(lastQuotes));
        
        }__CLR4_4_100l3zcakfi.R.inc(265);return finalString;
    }finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

    public static boolean isNumeric(String str)
    {try{__CLR4_4_100l3zcakfi.R.inc(266);
        __CLR4_4_100l3zcakfi.R.inc(267);try {
            __CLR4_4_100l3zcakfi.R.inc(268);Integer.parseInt(str);
            __CLR4_4_100l3zcakfi.R.inc(269);return true;
        } catch (Exception e) {
            __CLR4_4_100l3zcakfi.R.inc(270);return false;
        }
    }finally{__CLR4_4_100l3zcakfi.R.flushNeeded();}}

}
