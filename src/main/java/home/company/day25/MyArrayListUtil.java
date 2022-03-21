package home.company.day25;

import java.util.*;

public class MyArrayListUtil {
    /**
     * 1  Write a method which will check if given array
     * of integers contains duplicate element.
     */
    public static boolean isDuplicate(ArrayList<Integer> arrayList) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : arrayList) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 2 Write a method which prints elements that
     * occurred only once in the array.
     */
    public static void printElement(ArrayList<Integer> arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr.get(i)))
                map.put(arr.get(i), 1 + map.get(arr.get(i)));
            else
                map.put(arr.get(i), 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1)
                System.out.print(entry.getKey() + " ");
        }
    }

    /**
     * 3 Write a method that counts duplicate characters
     * from a given string.
     */
    public static int doubleElemCount(String strings) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < strings.length(); i++) {
            if (set.add(strings.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    /**
     * 4 Write a method that returns the first non-
     * repeated character from a given string.
     */
    public static char firsNonRepeatedCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            char str = string.charAt(i);
            if (string.indexOf(str) == i && string.indexOf(str, i + 1) == -1) {
                return str;
            }
        }
        return ' ';
    }

    /**
     * Write a method which will return the length of
     * the longest substring without repeating
     * characters.
     * “abba” – 2, “abcdaefjh” – 8
     */
    public static int lengthLongestWithoutCharacters(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add((str.charAt(i)));
        }
        return set.size();
    }

}
