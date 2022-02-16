package home.company.day12;

import java.util.Random;
import java.util.Scanner;

public class Day12 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    /**
     * 1.Print all elements of the array with even indices (that is, A [0], A
     * [2], A [4]...)
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example  Input 1 2 3 4 5
     * Output` 1 3 5
     */
    public void printArray1(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void initArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("invalid state of array");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20) - 10;
        }
    }

    void printLogic1(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }

    public void elementsArray(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        printArray1(arr);
        System.out.println();
        printLogic1(arr);
    }

    /**
     * 2. Print all even numbered items in the list.
     * - Input natural integer N
     * - define an array with size N,
     * - Initialize it
     * Example  Input 1 2 3 4 5 10
     * Output` 2 4 10
     */
    void printLogic2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public void evenArray(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        printArray1(arr);
        System.out.println();
        printLogic2(arr);
    }

    /**
     * 3. Find the number of positive elements in the given array.
     * Example` Input` 1 -1 2 3 -8
     * Output 1 2 3
     */
    public void printLogic3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public void positiveArray(int n) {
        int[] arr = new int[n];
        initArray(arr);
        printArray1(arr);
        System.out.println();
        printLogic3(arr);
    }

    /**
     * 4. A list of numbers is given. Print all the elements of the list that are
     * larger than the previous element.
     * Example` Input  1 5 2 4 3 Output 5 4
     */
    public void printLogic4(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public void largestArray(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        printArray1(arr);
        System.out.println();
        printLogic4(arr);
    }

    /**
     * 5. An array of numbers is given. If it has two adjacent(հարևան)
     * elements of the same sign, print these numbers. If there are no
     * adjacent elements of the same character, do not print anything. If there
     * are several such pairs of neighbors, print the first pair.
     * Example` Input` -1 2 3 -1 -2
     * Output` 2 3
     */
    public void printLogic5(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > 0 && arr[i + 1] > 0) {
                System.out.print(arr[i] + " ");
                System.out.println(arr[i + 1]);
                return;
            } else if (arr[i] < 0 && arr[i + 1] < 0) {
                System.out.print(arr[i] + " ");
                System.out.println(arr[i + 1]);
                return;
            }
        }
    }

    public void adjacentNumInArray(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        printArray1(arr);
        System.out.println();
        printLogic5(arr);
    }

    /**
     * 6. An array of numbers is given. Print the value of the largest element in
     * the array, and then the index of that element in the array. If there are
     * several largest elements, print the index of the first of them.
     * Example` Input` 1 2 3 2 1
     * Output` The largest is 3 index is 2
     */
    public void printArray2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void printLogic6(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }

    public void valueLargeElement(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        printArray2(arr);
        System.out.println();
        printLogic6(arr);
    }

    /**
     * 7.Print the value of the smallest of all positive elements in the list. It is
     * known that the list contains at least one positive element, and the
     * absolute value of all elements of the list does not exceed 1000.
     * Example  Input  5 -4 3 -2 1
     * Output ` 1
     */
    public void printLogic7(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min && min > 0) {
                min = arr[i];
            }
        }
        System.out.print(min);
    }

    public void allPositiveNumSmall(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        printArray2(arr);
        System.out.println();
        printLogic7(arr);
    }

    /**
     * 8.You are given a list sorted by non-decreasing elements in it. Determine
     * how many different elements are in it.
     * Example  Input  1 2 2 3 3 3
     * Output ` 3
     */
    public void printLogic8(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                res++;
            }
        }
        System.out.println(res);
    }

    public void sumDifferentElements(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        printArray2(arr);
        System.out.println();
        printLogic8(arr);
    }

    /**
     * 9.Print the elements of the given list in reverse order without changing
     * the list itself.
     * Example  Input  1 2 3 4 5
     * Output ` 5 4 3 2 1
     */
    public void reverseArray(int n) {
        n = scanner.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}


