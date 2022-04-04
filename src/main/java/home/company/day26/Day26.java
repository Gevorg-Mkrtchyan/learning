package home.company.day26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day26 {
    /**
     * 1. Write a method which takes a list of any type and prints the elements of the list.
     */
    public static <T> void print(List<T> list) {
        for (T i : list) {
            System.out.println(i);
        }
    }

    /**
     * 2. Write a method that takes an array of T type and converts it to a list of type T.
     */
    public static <T> List<T> convertListInArray(T[] arr) {
        return Arrays.asList(arr);
    }

    /**
     * 3. Write a method which takes a List of T type and Comparator of type T.
     * Return the largest value in the list.
     */
    public static <T> T max(List<T> list, Comparator<T> comparator) {

        T max = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (comparator.compare(list.get(i), list.get(i + 1)) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }


    /**
     * 4. Define a method copy(dest, src) which will copy from src to dest. src and dest are lists.
     * (use wildcards for this problem)
     * Method should work for this example`
     * List<Number> nums;
     * List<Integer> ints;
     * copy(nums, ints);
     * But not for this` copy(ints, nums);
     */
    public static <T> void copy(List<? super T> list1, List<T> list2) {
        list1.addAll(list2);
    }
}

