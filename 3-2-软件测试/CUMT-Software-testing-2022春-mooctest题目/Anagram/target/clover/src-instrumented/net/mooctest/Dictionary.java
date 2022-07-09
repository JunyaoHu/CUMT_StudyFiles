/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * data structure to store the dictionary of words with sorted keys
 *
 */
public class Dictionary {public static class __CLR4_4_12s2sl4dxksct{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u006e\u0061\u0067\u0072\u0061\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197032444L,8589935092L,166,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // below map will store string with sorted characters as key and all the anagrams of that string as value
    private final Map<String, Set<String>> sortedStringMap = new TreeMap<String, Set<String>>();
    private boolean isDictionaryLoaded = false;

    /*
      * loads the words from wordlist file into map; it assumes the wordlist file contains words delimited by newline
      * i.e. \n
      *
      * @param filePath absolute file path of the wordlist (assuming it's in the classpath)
      */
    public void loadDictionary(String filePath) throws IOException {try{__CLR4_4_12s2sl4dxksct.R.inc(100);

        __CLR4_4_12s2sl4dxksct.R.inc(101);loadDictionaryWithSubsets(filePath, null, 0);
    }finally{__CLR4_4_12s2sl4dxksct.R.flushNeeded();}}

    /*
      * loads only the words that are subsets of wordString from wordlist file into map;
      * it assumes the wordlist file contains words delimited by newline i.e. \n
      *
      * @param filePath absolute file path of the wordlist (assuming it's in the classpath)
      *
      * @param wordString string to check for subsets
      *
      * @param minWordSize minimum word size to load from dictionary
      */
    public void loadDictionaryWithSubsets(String filePath, String wordString,
                                          int minWordSize) throws IOException {try{__CLR4_4_12s2sl4dxksct.R.inc(102);

        __CLR4_4_12s2sl4dxksct.R.inc(103);if ((((filePath == null || filePath.isEmpty())&&(__CLR4_4_12s2sl4dxksct.R.iget(104)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(105)==0&false))) {{
            __CLR4_4_12s2sl4dxksct.R.inc(106);throw new IllegalArgumentException("file path invalid");
        }

        }__CLR4_4_12s2sl4dxksct.R.inc(107);try {
            __CLR4_4_12s2sl4dxksct.R.inc(108);File file = new File(filePath);
            __CLR4_4_12s2sl4dxksct.R.inc(109);BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file)));
            __CLR4_4_12s2sl4dxksct.R.inc(110);String word;
            __CLR4_4_12s2sl4dxksct.R.inc(111);while ((word = reader.readLine()) != null) {{
                assert (((word != null)&&(__CLR4_4_12s2sl4dxksct.R.iget(114)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(115)==0&false));
                __CLR4_4_12s2sl4dxksct.R.inc(116);word = word.trim().toLowerCase();
                __CLR4_4_12s2sl4dxksct.R.inc(117);String sortedWord = Helper.sortWord(word);
                __CLR4_4_12s2sl4dxksct.R.inc(118);if ((((sortedWord == null
                        || sortedWord.isEmpty()
                        || (wordString != null && !wordString.isEmpty() && (sortedWord
                        .length() < minWordSize || !Helper
                        .isSubset(sortedWord.toCharArray(), wordString
                                .replaceAll("\\s", "").toLowerCase()
                                .toCharArray()))))&&(__CLR4_4_12s2sl4dxksct.R.iget(119)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(120)==0&false))) {{
                    // don't add the word to dictionary if word is empty or if
                    // word from word-list is not a subset of wordString or word
                    // is less than minWordSize
                    __CLR4_4_12s2sl4dxksct.R.inc(121);continue;
                }
                }__CLR4_4_12s2sl4dxksct.R.inc(122);Set<String> wordSet = sortedStringMap.get(sortedWord);
                __CLR4_4_12s2sl4dxksct.R.inc(123);if ((((wordSet != null)&&(__CLR4_4_12s2sl4dxksct.R.iget(124)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(125)==0&false))) {{
                    // add word to the existing wordset
                    __CLR4_4_12s2sl4dxksct.R.inc(126);wordSet.add(word);
                } }else {{
                    __CLR4_4_12s2sl4dxksct.R.inc(127);wordSet = new TreeSet<String>();
                    __CLR4_4_12s2sl4dxksct.R.inc(128);wordSet.add(word);
                    __CLR4_4_12s2sl4dxksct.R.inc(129);sortedStringMap.put(sortedWord, wordSet);
                }
            }}

            }__CLR4_4_12s2sl4dxksct.R.inc(130);reader.close();
            __CLR4_4_12s2sl4dxksct.R.inc(131);isDictionaryLoaded = true;
        } catch (IOException ioException) {
            __CLR4_4_12s2sl4dxksct.R.inc(132);throw ioException;
        }
    }finally{__CLR4_4_12s2sl4dxksct.R.flushNeeded();}}

    /*
      * adds word to dictionary
      *
      * @param wordString adds wordString to current dictionary
      *
      * @return true if the word is successfully added, false otherwise
      */
    public boolean addWord(String wordString) {try{__CLR4_4_12s2sl4dxksct.R.inc(133);

        __CLR4_4_12s2sl4dxksct.R.inc(134);if ((((wordString.isEmpty())&&(__CLR4_4_12s2sl4dxksct.R.iget(135)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(136)==0&false))) {{
            __CLR4_4_12s2sl4dxksct.R.inc(137);return false;
        }

        }__CLR4_4_12s2sl4dxksct.R.inc(138);String sortedWord = Helper.sortWord(wordString);
        __CLR4_4_12s2sl4dxksct.R.inc(139);Set<String> wordSet = sortedStringMap.get(sortedWord);
        __CLR4_4_12s2sl4dxksct.R.inc(140);if ((((wordSet != null)&&(__CLR4_4_12s2sl4dxksct.R.iget(141)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(142)==0&false))) {{
            // add word to the existing words set
            __CLR4_4_12s2sl4dxksct.R.inc(143);wordSet.add(wordString);
        } }else {{
            // add create new words set
            __CLR4_4_12s2sl4dxksct.R.inc(144);wordSet = new TreeSet<String>();
            __CLR4_4_12s2sl4dxksct.R.inc(145);wordSet.add(wordString);
            __CLR4_4_12s2sl4dxksct.R.inc(146);sortedStringMap.put(sortedWord, wordSet);
        }

        }__CLR4_4_12s2sl4dxksct.R.inc(147);return true;
    }finally{__CLR4_4_12s2sl4dxksct.R.flushNeeded();}}

    /*
      * finds all the anagrams of the word in the dictionary
      *
      * @param wordString word for which anagrams are to be found
      *
      * @return set of single word anagrams for given string
      */
    public Set<String> findSingleWordAnagrams(String wordString) {try{__CLR4_4_12s2sl4dxksct.R.inc(148);

        __CLR4_4_12s2sl4dxksct.R.inc(149);if ((((!isDictionaryLoaded)&&(__CLR4_4_12s2sl4dxksct.R.iget(150)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(151)==0&false))) {{
            __CLR4_4_12s2sl4dxksct.R.inc(152);throw new IllegalStateException("dictionary not loaded");
        } }else {{

            __CLR4_4_12s2sl4dxksct.R.inc(153);if ((((wordString == null || wordString.isEmpty())&&(__CLR4_4_12s2sl4dxksct.R.iget(154)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(155)==0&false))) {{
                __CLR4_4_12s2sl4dxksct.R.inc(156);throw new IllegalStateException("word string invalid");
            }
            }__CLR4_4_12s2sl4dxksct.R.inc(157);return sortedStringMap
                    .get(Helper.sortWord(wordString));
        }
    }}finally{__CLR4_4_12s2sl4dxksct.R.flushNeeded();}}

    /*
      * get list for all the keys in dictionary
      *
      * @return returns the list of all the keys
      */
    public List<String> getDictionaryKeyList() {try{__CLR4_4_12s2sl4dxksct.R.inc(158);
        assert (((sortedStringMap != null)&&(__CLR4_4_12s2sl4dxksct.R.iget(159)!=0|true))||(__CLR4_4_12s2sl4dxksct.R.iget(160)==0&false));
        __CLR4_4_12s2sl4dxksct.R.inc(161);return new ArrayList<String>(sortedStringMap.keySet());
    }finally{__CLR4_4_12s2sl4dxksct.R.flushNeeded();}}

    public boolean isDictionaryLoaded() {try{__CLR4_4_12s2sl4dxksct.R.inc(162);
        __CLR4_4_12s2sl4dxksct.R.inc(163);return isDictionaryLoaded;
    }finally{__CLR4_4_12s2sl4dxksct.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_12s2sl4dxksct.R.inc(164);
        __CLR4_4_12s2sl4dxksct.R.inc(165);return "isDictionaryLoaded?: " + isDictionaryLoaded + "\nDictionary: " + sortedStringMap;
    }finally{__CLR4_4_12s2sl4dxksct.R.flushNeeded();}}
}
