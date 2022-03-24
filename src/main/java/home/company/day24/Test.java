package home.company.day24;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        int n = arrayList.size();
        System.out.println(Day24.isDuplicate(arrayList)); // task 1
        Day24.printElement(arrayList, n); // task 2
        System.out.println(Day24.doubleElemCount("abab"));  // task 3
        Day24.firsNonRepeatedCharacter("ababc"); // task 4
        System.out.println(Day24.lengthLongestWithoutCharacters("abcdaefjh")); // task 5
    }
}
