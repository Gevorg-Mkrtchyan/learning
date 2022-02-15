package home.company.day10;

import java.util.Random;
import java.util.Scanner;

public class Day10 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    /**
     * 1 .Print all integer numbers from 1 to 10.
     */
//    public void allInt() {
//        int num = 0;
//        while (num < 10) {
//            num++;
//            System.out.println(num);
//        }
//    }

    /**
     * 2.Print all even integer numbers from 1 to 20.
     */
//    public void evenNum() {
//        int num = 0;
//        while (num < 20) {
//            num += 2;
//            System.out.println(num);
//        }
//    }

    /**
     * 3.Print all exact squares of natural numbers that are not
     * exceeding a given positive integer N. Input N from console.
     * Example`
     * Input number - 15
     * Output `
     * 1
     * 4
     * 9
     * @param n
     */
//    public void squares(int n) {
//        n = scanner.nextInt();
//        int num = 1;
//        while (num * num <= n) {
//            System.out.println(num * num);
//            num++;
//        }
//    }

    /**
     * 4. Given an integer number, greater than 2.Find and print the
     * smallest natural divisor other than 1 for a given number.Input
     * number from console.Example `
     * Input` 15
     * Output ` 3
     * @param n
     */
//    public void divisorNumber(int n) {
//        n = scanner.nextInt();
//        int i = 2;
//        while (n % i != 0) {
//            i++;
//            System.out.println(i);
//        }
//    }

    /**
     * 5.Print all integer powers of two not exceeding N in ascending
     * order.Input N from console. Example ` Input 50(You can not use
     * Math.pow())
     * Output ` 1 2 4 8 16 32
     * @param num
     */
//    public void divisor2(int num) {
//        num = scanner.nextInt();
//        int m = 1;
//        while (m  < num) {
//            m <<= 1;
//            System.out.println(m);
//        }
//    }
    /**
     *6.For a given integer number N,print all integers in descending
     * order.
     * @param number1
     */
//    public void descendingNumber(int number1){
//        System.out.println("enter number1");
//        number1 =scanner.nextInt();
//        System.out.println("enter number2");
//        int number2 = scanner.nextInt();
//        while (number1 >= number2){
//            number1--;
//            System.out.println(number1);
//        }
//    }

    /**
     * 7.For a given integer number N,print all integers that are multiple of
     * 2 in descending order.
     *
     * @param number
     */
//    public void allMultiple(int number) {
//        System.out.println("enter number");
//        number = scanner.nextInt();
//        if (number%2 != 0){
//            while (number >= 2){
//                number-=2;
//                System.out.println(number);
//            }
//        }
//    }

    /**
     * 8. Input N natural number till N would be the exact power of 2.If N is
     * the exact power of 2 .
     * - Print N
     * - Print count of input integers
     * - break loop
     * @param a
     */
//    public boolean square(int a) {
//        int num = a;
//        while (num % 2 == 0 && num > 0) {
//            num /= 2;
//        }
//        return num == 1;
//    }
//    public void calculatorSquare() {
//        int z;
//        int count = 0;
//        while (true) {
//            z = scanner.nextInt();
//            count++;
//            if (square(z)) {
//                break;
//            }
//        }
//        System.out.println(z + " : " + count);
//    }

    /**
     * 9.For a given natural N print the smallest integer k that`
     * Math.pow(2,k)≥N.(You can not use Math.pow())
     * Example` Input 7
     * Output 3
     */
//    public void smallPow(int n) {
//        n = scanner.nextInt();
//        int k = 1;
//        int count = 0;
//        while (k <= n) {
//            if (k == n) {
//                System.out.println(n);
//                break;
//            } else {
//                k *= 2;
//                count++;
//            }
//        }
//        System.out.println(k + " - " + count);
//    }

    /**
     * 10.Write Java program to print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters
     * at each line.
     */
//    public void changeChar() {
//        int end = 122;
//        int start = 32;
//        while (start <= end) {
//            start++;
//            if (start % 10 == 2) {
//                System.out.print("\n");
//            }
//            System.out.print(" " + (char) start);
//        }
//    }

    /**
     * 11.Print all integer numbers from 1 to N, except that are multiple of
     * 3(Input N from console)
     * System.out.println(i);
     * }
     * @param number
     */
//    public void notMultiple3(int number) {
//        System.out.println("enter number");
//        number = scanner.nextInt();
//        int range = 0;
//        while (range < number) {
//            range++;
//            if (range % 3 == 0) {
//                continue;
//            }
//            System.out.println(range);
//        }
//    }

    /**
     * 12.Given integer number A &gt; 1,define what is the Fibonacci number
     * is A, i.e print such number n that φn=A.If A is not a Fibonacci
     * number print -1. Example
     * Input 8
     * Output 6
     * Input 10
     * Output -1
     * @param fib
     */
//    public void fibonacci(int fib) {
//        fib = scanner.nextInt();
//        int num1 = 0;
//        int num2 = 1;
//        int num3 = num1 + num2;
//        int count = 1;
//        while (num3 != fib) {
//            if (num3 > fib) {
//                System.out.println("-1");
//                break;
//            } else {
//                num3 = num1 + num2;
//                num1 = num2;
//                num2 = num3;
//            }
//            count++;
//        }
//        System.out.println(count);
//    }

    /**
     * 13.On the first day, the athlete ran x kilometers,and then every day
     * he increased the mileage by 10% from the previous value,Given the
     * number y, determine the number of the day for which the athlete&#39;s
     * mileage will be at least y kilometers.
     * Example` Input 10 Output 9
     * System.out.println(i);
     * }
     * 20
     */
    public void athlete() {
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        int count = 1;

        while (x < y) {
            x = (float) 1.1 * x;
            count++;
            System.out.print(x + "\t");
        }
        System.out.println("\n" + count);
    }
    /**
     *14.The deposit in the bank is x dollars. It increases annually by p
     * percent, after which the fractional part of cents is discarded.
     *
     * Determine how many years the contribution(ներդրում) will be at
     * least y dollars.(Input x , p , y from console) Example `
     *
     * Input ` Output ` 8
     * 100
     * 10
     * 200
     */
//    public void depositPercent(){
//        System.out.println("enter how many dollar");
//        double x = scanner.nextDouble();
//        System.out.println("enter the percent");
//        double p = scanner.nextDouble();
//        System.out.println("enter the years");
//        double y = scanner.nextDouble();
//        int years = 1;
//        while (x < y) {
//            x = (float) p * x;
//            years++;
//            System.out.print(x + "\t");
//        }
//        System.out.println("\n" + years);
//    }
    /**
     * 15.The sequence consists of different natural numbers and ends
     * with the number 0. Determine the value of the second largest
     * element in this sequence.
     * (A sequence of natural numbers is introduced, ending with the number 0 (the
     * number 0 itself is not included in the sequence, but serves as a sign of its
     * termination)).
     * Input ` 1 Output` 7
     * 7
     * 9
     * 0
     */
//    public void DetermineValue(){
//                    Scanner scanner = new Scanner(System.in);
//                    int max = Integer.MIN_VALUE;
//                    int second = 0;
//                    int i;
//                    while (true) {
//                        i = scanner.nextInt();
//                        if (i == 0) {
//                            break;
//            }
//            if (i > max) {
//                second = max;
//                max = i;
//            } else if (i > second && i != max) {
//                second = i;
//            }
//        }
//        System.out.println(second);
//
//    }
    /**
     * 16.Write a program that generates a random number and asks the user
     * to guess what the number is. If the user’s guess is higher than the
     * random number, the program should display Too high, try again. If the
     * user’s guess is lower than the random number, the program should
     * display Too low, try again. If you find the number print Yes, you
     * guessed the number.The program should use a loop that repeats
     * until the user correctly guesses the random number.
     */
//    public void randNum(int numbers) {
//        numbers = random.nextInt(20);
//        int number;
//        while (true) {
//             number = scanner.nextInt();
//            if (number < numbers) {
//                System.out.println(" Too low, try again.");
//            } else if (number > numbers) {
//                System.out.println(" Too high, try again");
//            } else {
//                System.out.println(" Yes, you guessed the number.");
//                break;
//            }
//        }
//    }

    /**
     *17. Write a Java Program to Compute the Sum of Digits in a given
     * Integer.
     */
//    public void sumDigits(){
//        int a = scanner.nextInt();
//        int b;
//        int c = 0;
//        while (a != 0){
//         b = a %10;
//         c = c + b;
//         a = a/10;
//        }
//        System.out.println("Sum of Digits:"+c);
//    }
}

