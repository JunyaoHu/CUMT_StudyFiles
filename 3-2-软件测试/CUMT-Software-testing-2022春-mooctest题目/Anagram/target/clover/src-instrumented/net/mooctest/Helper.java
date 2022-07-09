/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * this is a helper class holding all the static methods useful for solving anagrams
 *
 */
public class Helper {public static class __CLR4_4_14m4ml4dxksdl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u006e\u0061\u0067\u0072\u0061\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197032444L,8589935092L,250,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
      * sort the characters in word string
      *
      * @param wordString - string to sort
      *
      * @return string with sorted characters
      */
    public static String sortWord(String wordString) {try{__CLR4_4_14m4ml4dxksdl.R.inc(166);
        __CLR4_4_14m4ml4dxksdl.R.inc(167);if ((((wordString.isEmpty())&&(__CLR4_4_14m4ml4dxksdl.R.iget(168)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(169)==0&false))) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(170);return null;
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(171);byte[] charBytes = wordString.getBytes();
        __CLR4_4_14m4ml4dxksdl.R.inc(172);Arrays.sort(charBytes);

        __CLR4_4_14m4ml4dxksdl.R.inc(173);return new String(charBytes);
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

    /*
      * checks if the first character array is subset of second character array
      *
      * @param charArr1 - character array charArr1 to check for subset
      *
      * @param charArr2 - checking for subset against character array charArr2
      *
      * @return true is charArray1 is subset of charArray2, false otherwise
      */
    public static boolean isSubset(char[] charArr1, char[] charArr2) {try{__CLR4_4_14m4ml4dxksdl.R.inc(174);
        __CLR4_4_14m4ml4dxksdl.R.inc(175);if ((((charArr1.length > charArr2.length)&&(__CLR4_4_14m4ml4dxksdl.R.iget(176)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(177)==0&false))) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(178);return false;
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(179);List<Character> charList1 = toList(charArr1);
        __CLR4_4_14m4ml4dxksdl.R.inc(180);List<Character> charList2 = toList(charArr2);
        // cannot do containsAll as there can be duplicate characters
        __CLR4_4_14m4ml4dxksdl.R.inc(181);for (Character charValue : charList1) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(182);if ((((charList2.contains(charValue))&&(__CLR4_4_14m4ml4dxksdl.R.iget(183)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(184)==0&false))) {{
                __CLR4_4_14m4ml4dxksdl.R.inc(185);charList2.remove(charValue);
            } }else {{
                __CLR4_4_14m4ml4dxksdl.R.inc(186);return false;
            }
        }}
        }__CLR4_4_14m4ml4dxksdl.R.inc(187);return true;
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

    /*
      * converts character array to character list
      */
    private static List<Character> toList(char[] charArr) {try{__CLR4_4_14m4ml4dxksdl.R.inc(188);
        assert (((charArr != null)&&(__CLR4_4_14m4ml4dxksdl.R.iget(189)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(190)==0&false));
        __CLR4_4_14m4ml4dxksdl.R.inc(191);List<Character> charList = new ArrayList<Character>();
        __CLR4_4_14m4ml4dxksdl.R.inc(192);for (char ch : charArr) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(193);charList.add(ch);
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(194);return charList;
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

    /*
      * converts character list to character array
      */
    private static char[] toCharArray(List<Character> charList) {try{__CLR4_4_14m4ml4dxksdl.R.inc(195);
        __CLR4_4_14m4ml4dxksdl.R.inc(196);if ((((charList == null || charList.isEmpty())&&(__CLR4_4_14m4ml4dxksdl.R.iget(197)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(198)==0&false))) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(199);return new char[0];
        }

        }__CLR4_4_14m4ml4dxksdl.R.inc(200);char[] charArr = new char[charList.size()];
        __CLR4_4_14m4ml4dxksdl.R.inc(201);for (int index = 0; (((index < charList.size())&&(__CLR4_4_14m4ml4dxksdl.R.iget(202)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(203)==0&false)); index++) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(204);charArr[index] = charList.get(index);
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(205);return charArr;
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

    /*
      * checks if two character arrays are equivalent;
      * char arrays are equivalent if:
      * 1. the number of elements in them are equal, and
      * 2. all the elements are same (not necessarily in same order)
      * complexity should be O(n)
      *
      * @param charArr1 - first character array for equivalence check
      *
      * @param charArr2 - second character array for equivalence check
      *
      * @return true is charArr1 is equivalent to charArr2, false otherwise
      */
    public static boolean isEquivalent(char[] charArr1, char[] charArr2) {try{__CLR4_4_14m4ml4dxksdl.R.inc(206);
        __CLR4_4_14m4ml4dxksdl.R.inc(207);if ((((charArr1.length != charArr2.length)&&(__CLR4_4_14m4ml4dxksdl.R.iget(208)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(209)==0&false))) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(210);return false;
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(211);int sum1 = 0;
        __CLR4_4_14m4ml4dxksdl.R.inc(212);int sum2 = 0;
        __CLR4_4_14m4ml4dxksdl.R.inc(213);for (int index = 0; (((index < charArr1.length)&&(__CLR4_4_14m4ml4dxksdl.R.iget(214)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(215)==0&false)); index++) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(216);sum1 += charArr1[index];
            __CLR4_4_14m4ml4dxksdl.R.inc(217);sum2 += charArr2[index];
        }
        // in most cases it would return from here
        }__CLR4_4_14m4ml4dxksdl.R.inc(218);if ((((sum1 != sum2)&&(__CLR4_4_14m4ml4dxksdl.R.iget(219)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(220)==0&false))) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(221);return false;
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(222);List<Character> charList1 = toList(charArr1);
        __CLR4_4_14m4ml4dxksdl.R.inc(223);List<Character> charList2 = toList(charArr2);
        __CLR4_4_14m4ml4dxksdl.R.inc(224);for (Character charValue : charList1) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(225);charList2.remove(charValue);
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(226);return charList2.isEmpty();
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

    /*
      * calculates set difference for 2 character arrays i.e. charArr1 - charArr2 removes all charArr2 elements from charArr1
      * complexity should be O(n)
      *
      * @param charArr1 - first character array for set difference
      *
      * @param charArr2 - second character array for set difference
      *
      * @return resultant character array of set difference between charArr1 and charArr2
      */
    public static char[] setDifference(char[] charArr1, char[] charArr2) {try{__CLR4_4_14m4ml4dxksdl.R.inc(227);
        __CLR4_4_14m4ml4dxksdl.R.inc(228);List<Character> list1 = toList(charArr1);
        __CLR4_4_14m4ml4dxksdl.R.inc(229);List<Character> list2 = toList(charArr2);
        __CLR4_4_14m4ml4dxksdl.R.inc(230);for (Character charObj : list2) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(231);list1.remove(charObj);
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(232);return toCharArray(list1);
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

    /*
      * function to perform set multiplication of all the sets of strings passed
      *
      * @param setsArray - muliple sets to multiply (can be a set of strings array)
      *
      * @return returns set consisting of set of strings after cartesian product is applied
      */
    public static Set<Set<String>> setMultiplication(Set<String>... setsArray) {try{__CLR4_4_14m4ml4dxksdl.R.inc(233);
        __CLR4_4_14m4ml4dxksdl.R.inc(234);if ((((setsArray == null || setsArray.length == 0)&&(__CLR4_4_14m4ml4dxksdl.R.iget(235)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(236)==0&false))) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(237);return null;
        }
        }__CLR4_4_14m4ml4dxksdl.R.inc(238);return setMultiplication(0, setsArray);
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

    // recursive function to calculate the cartesian product of all the sets of strings passed
    private static Set<Set<String>> setMultiplication(int index, Set<String>... setsArray) {try{__CLR4_4_14m4ml4dxksdl.R.inc(239);
        __CLR4_4_14m4ml4dxksdl.R.inc(240);Set<Set<String>> setsMultiplied = new HashSet<Set<String>>();
        __CLR4_4_14m4ml4dxksdl.R.inc(241);if ((((index == setsArray.length)&&(__CLR4_4_14m4ml4dxksdl.R.iget(242)!=0|true))||(__CLR4_4_14m4ml4dxksdl.R.iget(243)==0&false))) {{
            __CLR4_4_14m4ml4dxksdl.R.inc(244);setsMultiplied.add(new HashSet<String>());
        } }else {{
            __CLR4_4_14m4ml4dxksdl.R.inc(245);for (String obj : setsArray[index]) {{
                __CLR4_4_14m4ml4dxksdl.R.inc(246);for (Set<String> set : setMultiplication(index + 1, setsArray)) {{
                    __CLR4_4_14m4ml4dxksdl.R.inc(247);set.add(obj);
                    __CLR4_4_14m4ml4dxksdl.R.inc(248);setsMultiplied.add(set);
                }
            }}
        }}

        }__CLR4_4_14m4ml4dxksdl.R.inc(249);return setsMultiplied;
    }finally{__CLR4_4_14m4ml4dxksdl.R.flushNeeded();}}

}
