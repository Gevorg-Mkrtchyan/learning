package home.company.day26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        Day26.print(list1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        Day26.print(list2);
        Integer[] arr1 = {1, 2, 3, 45, 6};
        String[] arr2 = {"a", "b", "c"};
        System.out.println(Day26.convertListInArray(arr1));
        System.out.println(Day26.convertListInArray(arr2));
        System.out.println(Day26.max(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }));
        System.out.println(Day26.max(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }));

        List<Number> arrayList = new ArrayList<>();
        Day26.copy(arrayList,list2);
        System.out.println(arrayList);
    }
}