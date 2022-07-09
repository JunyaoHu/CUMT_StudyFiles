/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class will implement the logic to solve multi-word anagrams
 *
 */
public class Anagram {public static class __CLR4_4_100l4dxksbb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0035\u0038\u0038\u005c\u005c\u0031\u0031\u0038\u0035\u0037\u0030\u005c\u005c\u0041\u006e\u0061\u0067\u0072\u0061\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1655197032444L,8589935092L,100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int minWordSize = 3;
    private Dictionary sortedDictionary;
    private String dictionaryFilePath;

    public Anagram(String dictionaryFilePath) {try{__CLR4_4_100l4dxksbb.R.inc(0);
        assert (((!dictionaryFilePath.isEmpty())&&(__CLR4_4_100l4dxksbb.R.iget(1)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(2)==0&false));
        __CLR4_4_100l4dxksbb.R.inc(3);sortedDictionary = new Dictionary();
        __CLR4_4_100l4dxksbb.R.inc(4);this.dictionaryFilePath = dictionaryFilePath;
    }finally{__CLR4_4_100l4dxksbb.R.flushNeeded();}}

    public Anagram(int minWordSize, String dictionaryFilePath) {
        this(dictionaryFilePath);__CLR4_4_100l4dxksbb.R.inc(6);try{__CLR4_4_100l4dxksbb.R.inc(5);
        __CLR4_4_100l4dxksbb.R.inc(7);this.minWordSize = minWordSize;
    }finally{__CLR4_4_100l4dxksbb.R.flushNeeded();}}

    /*
     * returns set of strings with all anagrams also prints the results on std out
     */
    public Set<Set<String>> findAllAnagrams(String wordString) throws IOException {try{__CLR4_4_100l4dxksbb.R.inc(8);

        // remove all white space chars from string
        __CLR4_4_100l4dxksbb.R.inc(9);wordString = wordString.replaceAll("\\s", "");
        __CLR4_4_100l4dxksbb.R.inc(10);Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
        // load dictionary for subset words
        __CLR4_4_100l4dxksbb.R.inc(11);sortedDictionary.loadDictionaryWithSubsets(dictionaryFilePath, wordString, minWordSize);
        __CLR4_4_100l4dxksbb.R.inc(12);List<String> keyList = sortedDictionary.getDictionaryKeyList();

        __CLR4_4_100l4dxksbb.R.inc(13);int count = 0;
        // check for all the words in key list for anagrams
        __CLR4_4_100l4dxksbb.R.inc(14);for (int index = 0; (((index < keyList.size())&&(__CLR4_4_100l4dxksbb.R.iget(15)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(16)==0&false)); index++) {{
            __CLR4_4_100l4dxksbb.R.inc(17);char[] charInventory = wordString.toCharArray();
            __CLR4_4_100l4dxksbb.R.inc(18);Set<Set<String>> dictWordAnagramsSet = findAnagrams(index, charInventory, keyList);
            __CLR4_4_100l4dxksbb.R.inc(19);Set<Set<String>> tempAnagramSet = new HashSet<Set<String>>();
            __CLR4_4_100l4dxksbb.R.inc(20);if ((((dictWordAnagramsSet != null && !dictWordAnagramsSet.isEmpty())&&(__CLR4_4_100l4dxksbb.R.iget(21)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(22)==0&false))) {{
                __CLR4_4_100l4dxksbb.R.inc(23);Set<Set<String>> mergeResult = null;
                __CLR4_4_100l4dxksbb.R.inc(24);for (Set<String> anagramSet : dictWordAnagramsSet) {{
                    __CLR4_4_100l4dxksbb.R.inc(25);mergeResult = mergeAnagramKeyWords(anagramSet);
                    __CLR4_4_100l4dxksbb.R.inc(26);tempAnagramSet.addAll(mergeResult);
                }
                }__CLR4_4_100l4dxksbb.R.inc(27);System.out.println("");
                __CLR4_4_100l4dxksbb.R.inc(28);System.out.println("\t(" + sortedDictionary.findSingleWordAnagrams(keyList.get(index)).toString()
                        .replace(",", "") + ")");
                __CLR4_4_100l4dxksbb.R.inc(29);for (Set<String> anagramSet : tempAnagramSet) {{
                    __CLR4_4_100l4dxksbb.R.inc(30);System.out.println("" + ++count + ".\t" + anagramSet.toString().replace(",", ""));
                }
                }__CLR4_4_100l4dxksbb.R.inc(31);anagramsSet.addAll(tempAnagramSet);
            }
        }}

        }__CLR4_4_100l4dxksbb.R.inc(32);return anagramsSet;
    }finally{__CLR4_4_100l4dxksbb.R.flushNeeded();}}


    // recursive function to find all the anagrams for charInventory characters
    // starting with the word at dictionaryIndex in dictionary keyList
    private Set<Set<String>> findAnagrams(int dictionaryIndex, char[] charInventory, List<String> keyList) {try{__CLR4_4_100l4dxksbb.R.inc(33);
        // terminating condition if no words are found
        __CLR4_4_100l4dxksbb.R.inc(34);if ((((dictionaryIndex >= keyList.size() || charInventory.length < minWordSize)&&(__CLR4_4_100l4dxksbb.R.iget(35)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(36)==0&false))) {{
            __CLR4_4_100l4dxksbb.R.inc(37);return null;
        }

        }__CLR4_4_100l4dxksbb.R.inc(38);String searchWord = keyList.get(dictionaryIndex);
        __CLR4_4_100l4dxksbb.R.inc(39);char[] searchWordChars = searchWord.toCharArray();
        // this is where you find the anagrams for whole word
        __CLR4_4_100l4dxksbb.R.inc(40);if ((((Helper.isEquivalent(searchWordChars, charInventory))&&(__CLR4_4_100l4dxksbb.R.iget(41)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(42)==0&false))) {{
            __CLR4_4_100l4dxksbb.R.inc(43);Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
            __CLR4_4_100l4dxksbb.R.inc(44);Set<String> anagramSet = new HashSet<String>();
            __CLR4_4_100l4dxksbb.R.inc(45);anagramSet.add(searchWord);
            __CLR4_4_100l4dxksbb.R.inc(46);anagramsSet.add(anagramSet);

            __CLR4_4_100l4dxksbb.R.inc(47);return anagramsSet;
        }

        // this is where you find the anagrams with multiple words
        }__CLR4_4_100l4dxksbb.R.inc(48);if ((((Helper.isSubset(searchWordChars, charInventory))&&(__CLR4_4_100l4dxksbb.R.iget(49)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(50)==0&false))) {{
            // update charInventory by removing the characters of the search
            // word as it is subset of characters for the anagram search word
            __CLR4_4_100l4dxksbb.R.inc(51);char[] newCharInventory = Helper.setDifference(charInventory, searchWordChars);
            __CLR4_4_100l4dxksbb.R.inc(52);if ((((newCharInventory.length >= minWordSize)&&(__CLR4_4_100l4dxksbb.R.iget(53)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(54)==0&false))) {{
                __CLR4_4_100l4dxksbb.R.inc(55);Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
                __CLR4_4_100l4dxksbb.R.inc(56);for (int index = dictionaryIndex + 1; (((index < keyList.size())&&(__CLR4_4_100l4dxksbb.R.iget(57)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(58)==0&false)); index++) {{
                    __CLR4_4_100l4dxksbb.R.inc(59);Set<Set<String>> searchWordAnagramsKeysSet = findAnagrams(index, newCharInventory, keyList);
                    __CLR4_4_100l4dxksbb.R.inc(60);if ((((searchWordAnagramsKeysSet != null)&&(__CLR4_4_100l4dxksbb.R.iget(61)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(62)==0&false))) {{
                        __CLR4_4_100l4dxksbb.R.inc(63);Set<Set<String>> mergedSets = mergeWordToSets(searchWord, searchWordAnagramsKeysSet);
                        __CLR4_4_100l4dxksbb.R.inc(64);anagramsSet.addAll(mergedSets);
                    }
                }}
                }__CLR4_4_100l4dxksbb.R.inc(65);return (((anagramsSet.isEmpty() )&&(__CLR4_4_100l4dxksbb.R.iget(66)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(67)==0&false))? null : anagramsSet;
            }
        }}

        // no anagrams found for current word
        }__CLR4_4_100l4dxksbb.R.inc(68);return null;
    }finally{__CLR4_4_100l4dxksbb.R.flushNeeded();}}

    // this function will merge the real dictionary words found under the sorted key word
    // for e.g. if the set of words to be merged are [elt, aet]
    // and the real dictionary words for 'elt' are [let, tel]
    // and the real dictionary words for 'aet' are [eat, tea]
    // then the merged set would be [[let, eat], [let, tea], [tel, eat], [tel, tea]]
    private Set<Set<String>> mergeAnagramKeyWords(
            Set<String> anagramKeySet) {try{__CLR4_4_100l4dxksbb.R.inc(69);
        __CLR4_4_100l4dxksbb.R.inc(70);if ((((anagramKeySet == null)&&(__CLR4_4_100l4dxksbb.R.iget(71)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(72)==0&false))) {{
            __CLR4_4_100l4dxksbb.R.inc(73);throw new IllegalStateException("anagram keys set cannot be null");
        }
        }__CLR4_4_100l4dxksbb.R.inc(74);Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
        __CLR4_4_100l4dxksbb.R.inc(75);for (String word : anagramKeySet) {{
            __CLR4_4_100l4dxksbb.R.inc(76);Set<String> anagramWordSet = sortedDictionary.findSingleWordAnagrams(word);
            __CLR4_4_100l4dxksbb.R.inc(77);anagramsSet.add(anagramWordSet);
        }
        }__CLR4_4_100l4dxksbb.R.inc(78);@SuppressWarnings("unchecked") // cannot use generics with Set array - Java bug???
        Set<String>[] anagramsSetArray = anagramsSet.toArray(new Set[0]);

        __CLR4_4_100l4dxksbb.R.inc(79);return Helper.setMultiplication(anagramsSetArray);
    }finally{__CLR4_4_100l4dxksbb.R.flushNeeded();}}

    // add word to all the sets
    private Set<Set<String>> mergeWordToSets(String word, Set<Set<String>> sets) {try{__CLR4_4_100l4dxksbb.R.inc(80);
        assert (((!word.isEmpty())&&(__CLR4_4_100l4dxksbb.R.iget(81)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(82)==0&false));
        __CLR4_4_100l4dxksbb.R.inc(83);if ((((sets == null)&&(__CLR4_4_100l4dxksbb.R.iget(84)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(85)==0&false))) {{
            __CLR4_4_100l4dxksbb.R.inc(86);return null;
        }
        }__CLR4_4_100l4dxksbb.R.inc(87);Set<Set<String>> mergedSets = new HashSet<Set<String>>();
        __CLR4_4_100l4dxksbb.R.inc(88);for (Set<String> set : sets) {{
            __CLR4_4_100l4dxksbb.R.inc(89);if ((((set == null)&&(__CLR4_4_100l4dxksbb.R.iget(90)!=0|true))||(__CLR4_4_100l4dxksbb.R.iget(91)==0&false))) {{
                __CLR4_4_100l4dxksbb.R.inc(92);throw new IllegalStateException("anagram keys set cannot be null");
            }
            }__CLR4_4_100l4dxksbb.R.inc(93);set.add(word);
            __CLR4_4_100l4dxksbb.R.inc(94);mergedSets.add(set);
        }

        }__CLR4_4_100l4dxksbb.R.inc(95);return mergedSets;
    }finally{__CLR4_4_100l4dxksbb.R.flushNeeded();}}

    /*
     * prints usage instructions
     */
    private static void usage() {try{__CLR4_4_100l4dxksbb.R.inc(96);

        __CLR4_4_100l4dxksbb.R.inc(97);System.out.println("Usage:");
        __CLR4_4_100l4dxksbb.R.inc(98);System.out.println("\tjava -cp AnagramSolver.jar com.parthparekh.algorithms.AnagramSolver " +
                                    "<absolute_path_to_wordlist_file> <min_word_length> <words_for_anagram_search>");
        __CLR4_4_100l4dxksbb.R.inc(99);System.out.println("");
    }finally{__CLR4_4_100l4dxksbb.R.flushNeeded();}}
}
