package net.mooctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * this is a helper class holding all the static methods useful for solving anagrams
 *
 */
public class Helper {

    /*
      * sort the characters in word string
      *
      * @param wordString - string to sort
      *
      * @return string with sorted characters
      */
    public static String sortWord(String wordString) {
        if (wordString.isEmpty()) {
            return null;
        }
        byte[] charBytes = wordString.getBytes();
        Arrays.sort(charBytes);

        return new String(charBytes);
    }

    /*
      * checks if the first character array is subset of second character array
      *
      * @param charArr1 - character array charArr1 to check for subset
      *
      * @param charArr2 - checking for subset against character array charArr2
      *
      * @return true is charArray1 is subset of charArray2, false otherwise
      */
    public static boolean isSubset(char[] charArr1, char[] charArr2) {
        if (charArr1.length > charArr2.length) {
            return false;
        }
        List<Character> charList1 = toList(charArr1);
        List<Character> charList2 = toList(charArr2);
        // cannot do containsAll as there can be duplicate characters
        for (Character charValue : charList1) {
            if (charList2.contains(charValue)) {
                charList2.remove(charValue);
            } else {
                return false;
            }
        }
        return true;
    }

    /*
      * converts character array to character list
      */
    private static List<Character> toList(char[] charArr) {
        assert charArr != null;
        List<Character> charList = new ArrayList<Character>();
        for (char ch : charArr) {
            charList.add(ch);
        }
        return charList;
    }

    /*
      * converts character list to character array
      */
    private static char[] toCharArray(List<Character> charList) {
        if (charList == null || charList.isEmpty()) {
            return new char[0];
        }

        char[] charArr = new char[charList.size()];
        for (int index = 0; index < charList.size(); index++) {
            charArr[index] = charList.get(index);
        }
        return charArr;
    }

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
    public static boolean isEquivalent(char[] charArr1, char[] charArr2) {
        if (charArr1.length != charArr2.length) {
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int index = 0; index < charArr1.length; index++) {
            sum1 += charArr1[index];
            sum2 += charArr2[index];
        }
        // in most cases it would return from here
        if (sum1 != sum2) {
            return false;
        }
        List<Character> charList1 = toList(charArr1);
        List<Character> charList2 = toList(charArr2);
        for (Character charValue : charList1) {
            charList2.remove(charValue);
        }
        return charList2.isEmpty();
    }

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
    public static char[] setDifference(char[] charArr1, char[] charArr2) {
        List<Character> list1 = toList(charArr1);
        List<Character> list2 = toList(charArr2);
        for (Character charObj : list2) {
            list1.remove(charObj);
        }
        return toCharArray(list1);
    }

    /*
      * function to perform set multiplication of all the sets of strings passed
      *
      * @param setsArray - muliple sets to multiply (can be a set of strings array)
      *
      * @return returns set consisting of set of strings after cartesian product is applied
      */
    public static Set<Set<String>> setMultiplication(Set<String>... setsArray) {
        if (setsArray == null || setsArray.length == 0) {
            return null;
        }
        return setMultiplication(0, setsArray);
    }

    // recursive function to calculate the cartesian product of all the sets of strings passed
    private static Set<Set<String>> setMultiplication(int index, Set<String>... setsArray) {
        Set<Set<String>> setsMultiplied = new HashSet<Set<String>>();
        if (index == setsArray.length) {
            setsMultiplied.add(new HashSet<String>());
        } else {
            for (String obj : setsArray[index]) {
                for (Set<String> set : setMultiplication(index + 1, setsArray)) {
                    set.add(obj);
                    setsMultiplied.add(set);
                }
            }
        }

        return setsMultiplied;
    }

}
