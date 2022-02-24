package home.company.day16;

import java.util.Locale;

public class Day16 {
    /**
     * 1 A natural number N is given (entered from the keyboard). Calculate two to the power of N
     * Display the calculated value (1 <= N <= 15).
     */
    public int naturalNumber(int n) {
        if (n < 1 || n > 15) {
            return -1;
        }
        return (int) Math.pow(2, n);
    }

    /**
     * 4.Given number n. N minutes have passed since the beginning of the day. Determine how many hours and minutes the
     * digital clock will show at this moment. The program should print two numbers: the number of hours (from 0 to 23)
     * and the number of minutes (from 0 to 59). Note that the number n can be more than the number of minutes in a day.
     * Example` 150      2 30
     * 1441   0   1
     */
    public void dayTime(int n) {
        int hour;
        int min;
        if (n > 59) {
            hour = n / 60;
            if (hour > 23) {
                hour -= 24;
            }
            min = n % 60;
            System.out.println(hour + " : " + min);
        }
    }
    /**
     *  3 How many times will the body of the loop be executed?
     * -        for (int i = 2; i <= 15; i ++)
     *      {...}  // 14 times
     * -        for (int i = 10; i <= 100; i = i+7)
     * {...} // 13 tames
     * -       for (float i = 1.5; i <= 10.3; i = i+0.4) //compile error
     * {...}
     */

    /**
     * 4.Write a java program to determine whether the number is prime or not.
     */
    public boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number > 2 && number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number / 2; i += 2)
            if (number % i == 0) {
                return false;
            }
        return true;
    }

    /**
     * 5.You are given two four-digit numbers A and B. Print all four-digit numbers on the segment from A to B,
     * the record of which is a palindrome.
     * Example` 1600                1661
     * 2100               1771
     * 1881
     * 1991
     * 2002
     */
    public void palindromeNumber(int a, int b) {
        while (a <= b) {
            if (a / 1000 == a % 10 && a / 100 % 10 == a / 10 % 10) {
                System.out.println(a);
            }
            a++;
        }
    }

    /**
     * 7. A three-letter word is given. The word consists only of Latin letters, small and large. Print the same word,
     * where the first letter is capitalized, the rest are small.
     * <p>
     * Example` dog    Dog
     * CAT             Cat
     * Lip               Lip
     */
    public String upString(String str) {
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase(Locale.ROOT);
    }

    /**
     * 8.Enter the number N and draw an NxN checkerboard where the top left is white. Designate white margins
     * O, black margins X. Use a for loop.
     * <p>
     * Input ` 3
     * Output`
     * OXO
     * XOX
     * OXO
     * <p>
     * <p>
     * Input` 8
     * <p>
     * OXOXOXOX
     * XOXOXOXO
     * OXOXOXOX
     * XOXOXOXO
     * OXOXOXOX
     * XOXOXOXO
     * OXOXOXOX
     * XOXOXOXO
     */
    public char[][] printXOr0(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = '0';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
        return board;
    }


    /**
     * 9.The first term and the denominator of the geometric progression are given (real numbers b1 and q, q! = 0).
     * An integer n is also given. Print the n-th term of a geometric progression. Don't use the pow function,
     * use a for loop. Print the answer with precision exactly two characters after the period.
     * <p>
     * Example` Input ` 2   2           32.0
     * 5
     * 3.2   1.5          10.80
     * 4
     */
    public double geometric(double number, double multipl, int step) {
        for (int i = 1; i < step; i++) {
            number *= multipl;
        }
        return number;
    }

    /**
     * 10.A natural number> = 2 is specified. Expand it into prime factors.
     * Example` Input` 120            2*2*2*3*5
     */
    public void primeFactors(int number) {
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }

    /**
     * *10.Two numbers n and m are given. Create a two-dimensional array A [n] [m], fill it with the multiplication
     * table A [i] [j] = i * j and display it. In this case, you cannot use nested loops, the entire filling of the
     * array must be done in one cycle.
     * Example` Input` 3   3
     * Output` 0 0 0
     * 0 1 2
     * 0 2 4
     */
    public void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" ");
                System.out.print(arr[i][j]);
            }
            System.out.println(" ]");
        }
    }

    public void arrayLogic(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = i * j;
            }
        }
    }

    public void arrayTask1(int n) {
        int[][] arr = new int[n][n];
        arrayLogic(arr);
        printArray(arr);
    }

}
