package home.company.day10;

import java.util.Scanner;

public class Day10 {
    Scanner scanner = new Scanner(System.in);
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
//        while (num * num < n) {
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
//        while (m * 2 < num) {
//            m *= 2;
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
//        if (number%2 == 0){
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
     *10.Write Java program to print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters
     * at each line.
     */
//    public void charEvoluation(){
//        int start = 32;
//        int end = 122;
//        while (start <= end){
//
//        }
//    }

}

