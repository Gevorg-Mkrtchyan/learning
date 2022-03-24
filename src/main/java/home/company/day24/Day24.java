package home.company.day24;

import java.util.*;

public class Day24 {
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
    public static void firsNonRepeatedCharacter(String stirng) {
        int length = stirng.length();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(stirng.charAt(i))) {
                map.put(stirng.charAt(i), 2);
                continue;
            }
            map.put(stirng.charAt(i), 1);
        }
        for (int i = 0; i < length; i++) {
            if (map.get(stirng.charAt(i)) == 1) {
                System.out.println(stirng.charAt(i));
                break;
            }
        }
    }

    /**
     * Write a method which will return the length of
     * the longest substring without repeating
     * characters.
     * “abba” – 2, “abcdaefjh” – 8
     */
    public static int lengthLongestWithoutCharacters(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maximumLength = 0;
        int start = 0;
        for (int end = 0; end < string.length(); end++) {
            if (map.containsKey(string.charAt(end))) {
                start = Math.max(start, map.get(string.charAt(end)) + 1);
            }
            map.put(string.charAt(end), end);
            maximumLength = Math.max(maximumLength, end - start + 1);
        }
        return maximumLength;
    }
}