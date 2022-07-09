package net.mooctest;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class will implement the logic to solve multi-word anagrams
 *
 */
public class Anagram {

    private int minWordSize = 3;
    private Dictionary sortedDictionary;
    private String dictionaryFilePath;

    public Anagram(String dictionaryFilePath) {
        assert !dictionaryFilePath.isEmpty();
        sortedDictionary = new Dictionary();
        this.dictionaryFilePath = dictionaryFilePath;
    }

    public Anagram(int minWordSize, String dictionaryFilePath) {
        this(dictionaryFilePath);
        this.minWordSize = minWordSize;
    }

    /*
     * returns set of strings with all anagrams also prints the results on std out
     */
    public Set<Set<String>> findAllAnagrams(String wordString) throws IOException {

        // remove all white space chars from string
        wordString = wordString.replaceAll("\\s", "");
        Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
        // load dictionary for subset words
        sortedDictionary.loadDictionaryWithSubsets(dictionaryFilePath, wordString, minWordSize);
        List<String> keyList = sortedDictionary.getDictionaryKeyList();

        int count = 0;
        // check for all the words in key list for anagrams
        for (int index = 0; index < keyList.size(); index++) {
            char[] charInventory = wordString.toCharArray();
            Set<Set<String>> dictWordAnagramsSet = findAnagrams(index, charInventory, keyList);
            Set<Set<String>> tempAnagramSet = new HashSet<Set<String>>();
            if (dictWordAnagramsSet != null && !dictWordAnagramsSet.isEmpty()) {
                Set<Set<String>> mergeResult = null;
                for (Set<String> anagramSet : dictWordAnagramsSet) {
                    mergeResult = mergeAnagramKeyWords(anagramSet);
                    tempAnagramSet.addAll(mergeResult);
                }
                System.out.println("");
                System.out.println("\t(" + sortedDictionary.findSingleWordAnagrams(keyList.get(index)).toString()
                        .replace(",", "") + ")");
                for (Set<String> anagramSet : tempAnagramSet) {
                    System.out.println("" + ++count + ".\t" + anagramSet.toString().replace(",", ""));
                }
                anagramsSet.addAll(tempAnagramSet);
            }
        }

        return anagramsSet;
    }


    // recursive function to find all the anagrams for charInventory characters
    // starting with the word at dictionaryIndex in dictionary keyList
    private Set<Set<String>> findAnagrams(int dictionaryIndex, char[] charInventory, List<String> keyList) {
        // terminating condition if no words are found
        if (dictionaryIndex >= keyList.size() || charInventory.length < minWordSize) {
            return null;
        }

        String searchWord = keyList.get(dictionaryIndex);
        char[] searchWordChars = searchWord.toCharArray();
        // this is where you find the anagrams for whole word
        if (Helper.isEquivalent(searchWordChars, charInventory)) {
            Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
            Set<String> anagramSet = new HashSet<String>();
            anagramSet.add(searchWord);
            anagramsSet.add(anagramSet);

            return anagramsSet;
        }

        // this is where you find the anagrams with multiple words
        if (Helper.isSubset(searchWordChars, charInventory)) {
            // update charInventory by removing the characters of the search
            // word as it is subset of characters for the anagram search word
            char[] newCharInventory = Helper.setDifference(charInventory, searchWordChars);
            if (newCharInventory.length >= minWordSize) {
                Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
                for (int index = dictionaryIndex + 1; index < keyList.size(); index++) {
                    Set<Set<String>> searchWordAnagramsKeysSet = findAnagrams(index, newCharInventory, keyList);
                    if (searchWordAnagramsKeysSet != null) {
                        Set<Set<String>> mergedSets = mergeWordToSets(searchWord, searchWordAnagramsKeysSet);
                        anagramsSet.addAll(mergedSets);
                    }
                }
                return anagramsSet.isEmpty() ? null : anagramsSet;
            }
        }

        // no anagrams found for current word
        return null;
    }

    // this function will merge the real dictionary words found under the sorted key word
    // for e.g. if the set of words to be merged are [elt, aet]
    // and the real dictionary words for 'elt' are [let, tel]
    // and the real dictionary words for 'aet' are [eat, tea]
    // then the merged set would be [[let, eat], [let, tea], [tel, eat], [tel, tea]]
    private Set<Set<String>> mergeAnagramKeyWords(
            Set<String> anagramKeySet) {
        if (anagramKeySet == null) {
            throw new IllegalStateException("anagram keys set cannot be null");
        }
        Set<Set<String>> anagramsSet = new HashSet<Set<String>>();
        for (String word : anagramKeySet) {
            Set<String> anagramWordSet = sortedDictionary.findSingleWordAnagrams(word);
            anagramsSet.add(anagramWordSet);
        }
        @SuppressWarnings("unchecked") // cannot use generics with Set array - Java bug???
        Set<String>[] anagramsSetArray = anagramsSet.toArray(new Set[0]);

        return Helper.setMultiplication(anagramsSetArray);
    }

    // add word to all the sets
    private Set<Set<String>> mergeWordToSets(String word, Set<Set<String>> sets) {
        assert !word.isEmpty();
        if (sets == null) {
            return null;
        }
        Set<Set<String>> mergedSets = new HashSet<Set<String>>();
        for (Set<String> set : sets) {
            if (set == null) {
                throw new IllegalStateException("anagram keys set cannot be null");
            }
            set.add(word);
            mergedSets.add(set);
        }

        return mergedSets;
    }

    /*
     * prints usage instructions
     */
    private static void usage() {

        System.out.println("Usage:");
        System.out.println("\tjava -cp AnagramSolver.jar com.parthparekh.algorithms.AnagramSolver " +
                                    "<absolute_path_to_wordlist_file> <min_word_length> <words_for_anagram_search>");
        System.out.println("");
    }
}
