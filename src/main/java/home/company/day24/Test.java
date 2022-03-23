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
        System.out.println(MyArrayListUtil.isDuplicate(arrayList)); // task 1
        MyArrayListUtil.printElement(arrayList, n); // task 2
        System.out.println(MyArrayListUtil.doubleElemCount("abab"));  // task 3
        System.out.println(MyArrayListUtil.firsNonRepeatedCharacter("ababc")); // task 4
        System.out.println(MyArrayListUtil.lengthLongestWithoutCharacters("abcdaefjh")); // task 5
    }
}
