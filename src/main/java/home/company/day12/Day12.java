package home.company.day12;

import java.util.Random;
import java.util.Scanner;

public class Day12 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int n = scanner.nextInt();

    public int[] initArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //          1

    /**
     * 1.Print all elements of the array with even indices (that is, A [0], A
     * [2], A [4]...)
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example ` Input` 1 2 3 4 5
     * Output` 1 3 5
     *
     * @param arr
     */
    public void arrayLogic1(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public void array1() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic1(arr);
    }

    /**
     * 2. Print all even numbered items in the list.
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example ` Input` 1 2 3 4 5 10
     * Output` 2 4 10
     */
    public void arrayLogic2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public void array2() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic2(arr);
    }

    /**
     * 3. Find the number of positive elements in the given array.
     * Example` Input` 1 -1 2 3 -8
     * Output 1 2 3
     */
    public void arrayLogic3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public void array3() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic3(arr);
    }

    /**
     * 4. A list of numbers is given. Print all the elements of the list that are
     * larger than the previous element.
     * Example` Input ` 1 5 2 4 3 Output` 5 4
     */
    public void arrayLogic4(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                System.out.print(arr[i + 1] + " ");
            }
        }
    }

    public void array4() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic4(arr);
    }

    /**
     * 5. An array of numbers is given. If it has two adjacent(հարևան)
     * elements of the same sign, print these numbers. If there are no
     * adjacent elements of the same character, do not print anything. If there
     * are several such pairs of neighbors, print the first pair.
     * Example` Input` -1 2 3 -1 -2
     * Output` 2 3
     */
    public void arrayLogic5(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0 && arr[i + 1] > 0 || arr[i] < 0 && arr[i + 1] < 0) {
                System.out.print(arr[i] + " " + arr[i + 1]);
            }
        }
    }

    public void array5() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic5(arr);
    }

    /**
     * 6. An array of numbers is given. Print the value of the largest element in
     * the array, and then the index of that element in the array. If there are
     * several largest elements, print the index of the first of them.
     * Example` Input` 1 2 3 2 1
     * Output` The largest is 3 index is 2
     */
    public void arrayLogic6(int[] arr) {
        int count = 0;
        int largest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }

    public void array6() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic6(arr);
    }

    /**
     * 7.Print the value of the smallest of all positive elements in the list. It is
     * known that the list contains at least one positive element, and the
     * absolute value of all elements of the list does not exceed 1000.
     * Example ` Input ` 5 -4 3 -2 1
     * Output ` 1
     */
    public void arrayLogic7(int[] arr) {
        int small = 1000;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (small > arr[i] && arr[i] > 0) {
                small = arr[i];
            }
        }
        System.out.println(small);
    }

    public void array7() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic7(arr);
    }

    /**
     * 8.You are given a list sorted by non-decreasing elements in it. Determine
     * how many different elements are in it.
     * Example ` Input ` 1 2 2 3 3 3
     * Output ` 3
     */
    public void arrayLogic8(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void array8() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic8(arr);
    }

    /**
     * 9.Print the elements of the given list in reverse order without changing
     * the list itself.
     * Example ` Input ` 1 2 3 4 5
     * Output ` 5 4 3 2 1
     */
    public void arrayLogic9(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public void array9() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic9(arr);
    }

    /**
     * 10.Rearrange the elements of this array in reverse order, then print the
     * elements of the resulting array.
     */
    public void arrayLogic10(int[] arr) {
        int n = arr.length - 1;
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
        }
        print(arr);
    }

    public void array10() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic10(arr);
    }

    /**
     * 11. Rearrange the adjacent elements of the array (A [0] with A [1], A [2]
     * with A [3], etc.). If there is an odd number of elements, then the last
     * element remains in its place.
     * <p>
     * Example ` Input ` 1 2 3 4 5
     * Output ` 2 1 4 3 5
     *
     * @param arr
     */
    public void arrayLogic11(int[] arr) {
        int temp = 0;
        for (int i = 0; i <= arr.length - 2; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        print(arr);
    }

    public void array11() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic11(arr);
    }

    /**
     * 12.Cycle the elements of the array to the right (A [0] goes to A [1], A [1]
     * to A [2], ..., the last element goes to A [0]).
     * Example ` Input ` 1 2 3 4 5
     * Output ` 5 1 2 3 4
     */
    public void arrayLogic12(int[] arr) {
        int temp = 0;
        for (int i = arr.length - 2; i >= 0; i--) {
//            temp = arr[i + 1];
//            arr[i + 1] = arr[i];
//            arr[i] = temp;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        print(arr);
    }

    public void array12() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic12(arr);
    }

    /**
     * 13.In the list, all items are different. Swap the minimum and maximum
     * elements of this list.
     * Example ` Input ` 3 2 1 4 5
     * Output ` 3 2 5 4 1
     */
    public void arrayLogic13(int[] arr) {
        int small = 0;
        int large = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[large] < arr[i]) {
                large = i;
            }
            if (arr[small] > arr[i]) {
                small = i;
            }
        }
        temp = arr[large];
        arr[large] = arr[small];
        arr[small] = temp;
        print(arr);
    }

    public void array13() {
        int[] arr = initArray(n);
        print(arr);
        System.out.println();
        arrayLogic13(arr);
    }

}


