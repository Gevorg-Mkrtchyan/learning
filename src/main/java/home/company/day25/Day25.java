package home.company.day25;

public class Day25 {
    /**
     * 1.Write a recursive function
     * to find the sum of a given array.
     * to find the factorial of a given natural N.
     */
    public static int sumArray(int[] arr, int length) {
        if (length == 0) {
            return 0;
        }
        return arr[length - 1] + sumArray(arr, length - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * 2.Write a fib(int) function which returns n-th fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    /**
     * 3.We have triangles made of blocks. The topmost row has 1 block, the next
     * row down has 2 blocks, the next row has 3 blocks, and so on. Compute
     * recursively (no loops or multiplication) the total number of blocks in
     * such a triangle with the given number of rows.
     * <p>
     * Example` triangle(0) -> 0
     * triangle(1) -> 1
     * triangle(2) -> 3
     */
    public static int sumNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNumber(n - 1);
    }

    /**
     * 4.Given a non-negative int n, return the sum of its digits recursively (no
     * loops
     */
    public static int digitsSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + digitsSum(n / 10);
    }

    /**
     * 5.Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
     */
    public static int countOf7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + countOf7(n / 10);
        }
        return countOf7(n / 10);
    }

    /**
     * 6.Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * Example`
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     */
    public static int countOfX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.startsWith("x")) {
            return 1 + countOfX(str.substring(1));
        }
        return countOfX(str.substring(1));
    }

    /**
     * 7.Given a string, compute recursively a new string where all the 'x' chars
     * have been removed.
     * Use`  str.substring()
     */
    public static String removeOfX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith("x")) {
            return removeOfX(str.substring(1));
        }
        return str.charAt(0) + removeOfX(str.substring(1));
    }

    /**
     * 8.Write recursive function that reverses the given String.
     * Example` HELLO -> OLLEH
     */
    public static String replace(String str) {
        if (str.length() == 0) {
            return "";
        }
        return str.charAt(str.length() - 1) + replace(str.substring(0, str.length() - 1));
    }

    /**
     * 9.Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to
     * the end of the string.
     * EXample`
     * endX("xxre") → "rexx"
     * endX("xxhixx") → "hixxxx"
     */
    public static String endOfX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith("x")) {
            return endOfX(str.substring(1)) + "x";
        }
        return str.charAt(0) + endOfX(str.substring(1));
    }

    /**
     * 10.Given a string, return recursively a "cleaned" string where adjacent
     * chars that are the same have been reduced to a single char. So "yyzzza"
     * yields "yza".
     * EXample`
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     */
    public static String cleanedDuplicateCharOfString(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return cleanedDuplicateCharOfString(str.substring(1));
        }
        return str.charAt(0) + cleanedDuplicateCharOfString(str.substring(1));
    }

    /**
     * 11.Write a function to determine if a number is prime or not.
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }
    /**
     * 12.Given a string containing only decimal digits. Find and display the largest digit.
     */
 //todo
}
