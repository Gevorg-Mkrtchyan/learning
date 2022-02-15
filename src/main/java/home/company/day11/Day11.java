package home.company.day11;

import java.util.Scanner;

public class Day11 {

    Scanner scanner = new Scanner(System.in);

    /**
     * 1. Write a java program to print all even numbers from a given
     * range, from a to b. Input a and b from console.Example`
     * Input ` 2 Output ` 2 4
     * 5
     * @param n
     */
//    public void evenNum(int n) {
//        n = scanner.nextInt();
//        for (int i = 2; i <= n; i += 2) {
//            System.out.println(i);
//        }
//    }

    /**
     * 2.Print all numbers on the segment from a to b that give the
     * remainder of c when divided by d. If such numbers do not exist,
     * then you do not need to display anything.
     * Example ` Input` Output`
     * a 2 2 4
     * b 5
     * c 0
     * d 2
     * i.e 2 divided to 2 reminder is 0, 4 divided to 2 reminder is 0
     */
//    public void remainder(int a, int b, int c, int d) {
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        d = scanner.nextInt();
//        for (int i = a; i <b; i++) {
//            if(i %d == c ){
//                System.out.println(i + " ");
//            }
//        }
//    }
    /**
     * 3.Integers a and b are entered. It is guaranteed that a does not
     * exceed b.
     * Print all numbers on the segment from a to b that are exact
     * squares. If there are no such numbers, then you do not need to
     * display anything.
     * Example`
     *
     * Input` 2 Output ` 4
     * 8
     */
//    public void squares(int a,int b){
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        for (int i = a; i*i <=b; ) {
//            System.out.println(i * i);
//            i++;
//        }
//    }

    /**
     * 4.Enters 2 integer numbers : x and d from console
     * Count and print one number - how many times the digit d occurs in
     * the representation of a natural number x.
     */
//    public void countOcc(int n, int d) {
//        n = scanner.nextInt();
//        d = scanner.nextInt();
//        int count = 0;
//        for (; n > 0; n = n / 10) {
//            count = (n % 10 == d) ? count + 1 : count;
//        }
//        System.out.println(count);
//    }

    /**
     * 5. Given an integer number x
     * Print the number consisting of the digits of the given number x in reverse
     * order. You do not need to output leading zeros.
     */
//    public void digitsNum() {
//        int num = scanner.nextInt();
//        int count = 0;
//        for (;num > 0; num/=10){
//            count = count * 10 + num % 10;
//        }
//        System.out.println(count);
//    }

    /**
     * 6.Given an integer number x
     * Find the smallest natural divisor of x other than 1 (2 &lt;= x &lt;= 30000).
     * Example`
     * Input` 6 Output` 2
     */
//    public void divisor() {
//        int n = scanner.nextInt();
//        for (int i = 2; i * i <= n; ) {
//            i++;
//            if (n % 2 == 0) {
//                System.out.println(2);
//                break;
//            } else if (n % i == 0) {
//                System.out.println(i);
//            } else {
//                System.out.println(n);
//            }
//        }
//    }

    /**
     * 7.Given an integer number x
     * Print all natural divisors of the number x in ascending order (including 1
     * and the number itself).
     * Example` Input ` 32 Output ` 1 2 4 8 16 32
     */
//    public void powNumber(int number) {
//        number = scanner.nextInt();
//        for (int i = 1; i < number; ) {
//            i <<= 1;
//            System.out.println(i);
//        }
//    }

    /**
     * 8. Given an integer x
     * Count the number of natural divisors of x (including 1 and the number
     * itself; x≤2 ∗ 109).
     */
//    public void allDivisors(int n) {
//        n = scanner.nextInt();
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                if (n / i == i) {
//                    System.out.print(" " + i);
//                } else {
//                    System.out.print(i + " " + n / i + " ");
//                }
//            }
//        }
//    }

    /**
     * 9.Calculate the sum of the given 10 natural numbers.
     * Input integers from console
     */
//    public void calculateNumber(int numb) {
//        numb = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= numb; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }

    /**
     * 10. Convert a natural number from binary to decimal (no more than 10
     * digits in a binary number).
     * Example` Input ` 1001 Output` 9
     * 111 Output` 7
     */
//    public void convertToBinary(int num) {
//        num = scanner.nextInt();
//        int decimalNum = 0, i = 0;
//        long remainder;
//        while (num != 0) {
//            remainder = num % 10;
//            num /= 10;
//            decimalNum += remainder * Math.pow(2, i);
//            i++;
//        }
//        System.out.println(decimalNum);
//    }

    /**
     * 11.Enter the number N, followed by N integers.
     * <p>
     * - Count how many zeros, positive numbers, negative numbers
     * among the given N numbers.
     * <p>
     * - It is necessary to print first the number of zeros, then the number
     * of positive and negative numbers.
     */
//    public  void checkNumber(int range) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the range");
//        range = scanner.nextInt();
//        int zerosCount = 0;
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int result;
//        for (int i = 0; i < range; i++) {
//            System.out.println("enter the number");
//            result = scanner.nextInt();
//            if (result > 0) {
//                positiveCount++;
//            } else if (result < 0) {
//                negativeCount++;
//            } else zerosCount++;
//        }
//        System.out.println("Zeros count: " + zerosCount + "\n" + "Negative count: " +
//                negativeCount + "\n" + "Positive count: " + positiveCount);
//    }
    /**
     * 12. &quot;GNCHE-1&quot; is a complex electronic device that issues every second
     * the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ... Due to the high
     * cost of electronic components, you have been instructed to develop an
     * emulator for these devices.
     * The number of seconds (from 1 to 1,000,000) is given that the generator
     * works after being turned on.
     * Example` Input` Output`
     * 2 1 2
     * 5 1 2 2 3 3
     * 7 1 2 2 3 3 3 4
     */
//     public  void emulator(int num) {
//         System.out.println("enter the number");
//         num = scanner.nextInt();
//        StringBuilder str = new StringBuilder();
//        for (int i = 1; i <= num; i++) {
//            for (int j = 1; j <= i; j++) {
//                str.append(i);
//                if (str.length() == num) {
//                    break;
//                }
//            }
//            if (str.length() == num) {
//                break;
//            }
//        }
//        System.out.println(str);
//    }
    /**
     * 13. Write a Java program by using two for loops to produce the output
     * shown below:
     * 1.Input N natural number, print picture like below in size N*N
     * ***********
     * ***********
     * ***********
     * ***********
     */
//    public void figureSquare(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    /**
     * 14.Write a program that prompts the user for the size (a non-negative
     * integer in int); and prints the following checkerboard pattern.
     *
     * # # # # # # #       N * N
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     * # # # # # # #
     */
//    public void figure1(int n){
//        n = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n; j++) {
//                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
//                    System.out.print("#");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }

    /**
     * 15. Write a program that prompts user for the size (a positive integer in
     * int); and prints the multiplication table as shown:
     * Enter the size: 10
     * * | 1 2 3 4 5 6 7 8 9 10
     * --------------------------------------------
     * 1 | 1 2 3 4 5 6 7 8 9 10
     * 2 | 2 4 6 8 10 12 14 16 18 20
     * 3 | 3 6 9 12 15 18 21 24 27 30
     * 4 | 4 8 12 16 20 24 28 32 36 40
     * 5 | 5 10 15 20 25 30 35 40 45 50
     * 6 | 6 12 18 24 30 36 42 48 54 60
     * 7 | 7 14 21 28 35 42 49 56 63 70
     * 8 | 8 16 24 32 40 48 56 64 72 80
     * 9 | 9 18 27 36 45 54 63 72 81 90
     * 10 | 10 20 30 40 50 60 70 80 90 100
     */
//    public void multiplicationTable(int num) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " = | ");
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i * j + " ");
//            }
//            System.out.println();
//        }
//    }

    /**
     * 16. Write 4 programs (X = A, B, C, D) that prompts user for the
     * size (a non-negative integer in int); and prints each of the patterns as
     * shown:
     * <p>
     * Enter the size: 4
     * * **** **** *
     * ** *** *** **
     * *** ** ** ***
     * **** * * ****
     * a) b) c) d)
     */
    // a
//    public void pattersA(int n) {
//        n = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    public void patternsB(int n){
//        n = scanner.nextInt();
//        for (int i = n; i >= 1; i--) {
//            for (int j = n - 1; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int l = 1; l <= i; l++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    ////// c
//    public void patternsC(int n){
//        n = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = n; j >i ; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    ///// d
//    public void patternsD(int n) {
//        n = scanner.nextInt();
//        for (int i = 0; i <= n; i++) {
//            for (int j = n - 1; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int l = 1; l <= i; l++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}

