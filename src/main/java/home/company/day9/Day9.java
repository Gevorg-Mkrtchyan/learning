package home.company.day9;

import java.util.Scanner;

public class Day9 {
    Scanner scanner = new Scanner(System.in);

    /**
     * 1 Write a java program, which has 2 String variables, initialize them from console.
     * - - Compare them with == assignment
     * - - Compare them with equals to
     */
//    public void equalsStr() {
//        String str = scanner.next();
//        String string = scanner.next();
//        System.out.println(str == string);
//        System.out.println(str.equals(string));
//    }

    /**
     * 2 Write a java program, which has 2 String variables, initialize them, One with literal,
     * another using new keyword
     * - - Compare them with == assignment
     * - - Compare them with equals to
     */
//    public void equalsString() {
//        String string1 = new String(scanner.next());
//        String string2 = scanner.next();
//        System.out.println(string1 == string2);
//        System.out.println(string1.equals(string2));
//    }

    /**
     * 3 - - Input integer value from console, if value greater than 0 print n positive, else
     * print negative.
     * - - Input integer value from console, if value greater than 0 print positive, else
     * print negative, else if 0 print 0;
     * @param n
     */
//    public void ternary(int n) {
//        n = scanner.nextInt();
//        System.out.println(n > 0 ? "positive" : "negative");
//        System.out.println(n > 0 ? "positive" : n == 0 ? "0" : "negative");
//    }

    /**
     * 4 Using ternary operator`
     * - - achieve Math.max(a,b) function
     * - - achieve Math.abs(a) function
     *
     * @param a
     * @param b
     */
//    public void maxValue(int a, int b) {
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        int max = (a > b) ? a : b;
//        System.out.println("max number between " + a + " or " + b + " is " + max);
//    }

    /**
     * 5 Using ternary operator`
     * - - achieve Math.abs(a) function
     * @param value
     */
//    public void absValue(int value) {
//        value = scanner.nextInt();
//        System.out.println("please enter the number  negative number or positive ");
//        System.out.println(value < 0 ? Math.abs(value) : value);
//    }
    /**)
     * 6 Using ternary operator check if the given String
     * - - is a null so return -1
     * - - if given String is “ ” return 0
     * - - else return 1
     * @param string
     */
//    public void sizeStr(String string) {
//        System.out.println(string == null ? "-1" : string == "" ? "0" : "1");
//    }

    /**
     * 7 Write a java program to find maximum from a given 3 integer numbers using ternary
     * operator.Input numbers from console
     * @param a
     * @param b
     * @param c
     */
//    public void maxNum(int a, int b, int c) {
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        System.out.println(a > b && a > c ? "max num a = " + a : b > a && b > c ?
//                "max num b = " + b : c> a && c > b ? "max num c = " + c : "not a max num");
//    }

    /**
     * 8.Write a Java program that allows the user to choose the correct answer of a question.If
     * he choose correct answer Print “Congratulation”,
     * in case of illegal choice print “Invalide choice”.
     * Example`
     * What is the correct way to declare a variable to store an integer value in Java?
     * a. int 1x=10;
     * b. int x=10;
     * c. float x=10.0f;
     * d. string x=&quot;10&quot;;
     * Enter your choice: c
     * @param a
     */

//    public void answerOfQuest(String a) {
//        System.out.println(" choose the correct answer of a question.  " +
//                "which is the  largest primitive type of the above");
//        System.out.println(" a - int \n b - short \n c - long \n d - float ");
//        a = scanner.next();
//        switch (a) {
//            case "a":
//                System.out.println("Invalid choice");
//                break;
//            case "b":
//                System.out.println("Invalid choice ");
//                break;
//            case "c":
//                System.out.println("Invalid  choice");
//                break;
//            case "d":
//                System.out.println("Congratulation");
//                break;
//            default:
//                System.out.println("there is no such option");
//        }
//    }

    /**
     * 9.Write Java Program to check Vowel or Consonant using Switch Case.
     * Example`
     * Enter a character :
     * A
     * A is a Vowel
     *
     * @param a
     */
//    public void vowelOrCon(String a) {
//        System.out.println("write the letter and the programing will \n" +
//                "say whether it is a vowel or a consonant");
//            a = scanner.next();
//            switch (a) {
//                case "a":
//                    System.out.println("a is vowel");
//                    break;
//                case "e":
//                    System.out.println("b is vowel");
//                    break;
//                case "i":
//                    System.out.println("i is vowel");
//                    break;
//                case "o":
//                    System.out.println("o is vowel");
//                    break;
//                case "u":
//                    System.out.println("u is vowel");
//                    break;
//                default:
//                    System.out.println("the letter  is consonant");
//            }
//        }
    /**
     * 10. If the user pressed number keys( from 0 to 9), the program will tell the number that is
     * pressed, otherwise, the program will show "Not allowed".
     * @param number
     */
//    public void pressedNumber(String number) {
//        System.out.println("please enter the number from 0 to 9");
//            number = scanner.next();
//            switch (number) {
//                case "0":
//                    System.out.println("you  pressed the 0");
//                    break;
//                case "1":
//                    System.out.println("you  pressed the 1");
//                    break;
//                case "2":
//                    System.out.println("you  pressed the 2");
//                    break;
//                case "3":
//                    System.out.println("you  pressed the 3");
//                    break;
//                case "4":
//                    System.out.println("you  pressed the 4");
//                    break;
//                case "5":
//                    System.out.println("you  pressed the 5");
//                    break;
//                case "6":
//                    System.out.println("you  pressed the 6");
//                    break;
//                case "7":
//                    System.out.println("you  pressed the 7");
//                    break;
//                case "8":
//                    System.out.println("you  pressed the 8");
//                    break;
//                case "9":
//                    System.out.println("you  pressed the 9");
//                    break;
//                default:
//                    System.out.println("Not allowed");
//            }
//        }
    /**
     * 11.Using switch statements determine if the number is even or odd.
     * Input number from console
     * @pharm number
     */
//    public void evenOrOdd(int number) {
//        System.out.println("please enter the number");
//        number = scanner.nextInt();
//        switch (number % 2) {
//            case 0:
//                System.out.println(number + " is an even number ");
//                break;
//            case 1:
//                System.out.println(number + " is an odd number");
//        }
//    }

    /**
     * 12 Program to make a calculator using switch case in Java
     * In this Program we are making a simple calculator that performs addition, subtraction, multiplication and
     * division based on the user input. The program takes the value of both the numbers (entered by user) and
     * then user is asked to enter the operation (+, -, * and /), based on the input program performs the selected
     * operation on the entered numbers using switch case.
     * Example`
     * Enter first number:40
     * Enter second number:4
     * Enter an operator (+, -, *, /): /
     * 40.0 / 4.0: 10.0
     * /* If user enters any other operator or char apart from
     * * +, -, * and /, then display an error message to user
     * @param number1
     * @param number2
     */
//    public void calculator(int number1, int number2) {
//        System.out.println("welcome in the calculator ");
//        System.out.println("please enter number1");
//        number1 = scanner.nextInt();
//        System.out.println("please enter operator + or - or * or / ");
//        String operator = scanner.next();
//        System.out.println("please enter number2");
//        number2 = scanner.nextInt();
//        switch (operator) {
//            case "+":
//                System.out.println(number1 + number2);
//                break;
//            case "-":
//                System.out.println(number1 - number2);
//                break;
//            case "*":
//                System.out.println(number1 * number2);
//                break;
//            case "/":
//                if (number2 != 0) {
//                    System.out.println(number1 / number2);
//                } else {
//                    System.out.println("the number can't be divided by 0");
//                }
//                break;
//            default:
//                System.out.println("incorrect expression");
//        }
//    }

    /**
     * 13.Given the String variable day holding the name of the weekday Sunday, Monday,
     * etc., set an int variable to 1, 2,etc.
     * @param days
     */
//    public void weekDays(int days) {
//        System.out.println("please enter the number 1 to 7 ");
//        days = scanner.nextInt();
//        switch (days) {
//            case 1:
//                System.out.println(days + " is a monday");
//                break;
//            case 2:
//                System.out.println(days + " is a tuesday");
//                break;
//            case 3:
//                System.out.println(days + " is a wednesday");
//                break;
//            case 4:
//                System.out.println(days + " is a thursday");
//                break;
//            case 5:
//                System.out.println(days + " is a friday");
//                break;
//            case 6:
//                System.out.println(days + " is a saturday");
//                break;
//            case 7:
//                System.out.println(days + " is a sunday");
//                break;
//            default:
//                System.out.println("wrong command");
//        }
//    }

    /**
     * 14.The program will read three types of scores(quiz, mid-term, and final scores) and determine the
     * grade based on the following rules:
     * -if the average score ;>= 80% =;grade=A
     * -if the average score >= 60% and <=;80% =; grade=B
     * -if the average score;<=40% and <=; 60% =;grade=C
     * -else =;grade=F
     * Input`
     * Quiz score: 80
     * Mid-term score: 68
     * Final score: 90
     * Output`
     * Your grade is B.
     * Use switch statement
     *
     * @param quiz
     * @param mid_term
     * @param final_scores
     */

    // switch- option
//    public void scores(int quiz, int mid_term, int final_scores) {
//        System.out.println("please enter Quiz score and Mid-term score: and final scores");
//        quiz = scanner.nextInt();
//        mid_term = scanner.nextInt();
//        final_scores = scanner.nextInt();
//        int scores = (quiz + mid_term + final_scores) / 3;
//        switch (scores / 10) {
//            case 8:
//            case 9:
//            case 10:
//                System.out.println(scores + " = grade = A ");
//                break;
//            case 7:
//            case 6:
//                System.out.println(scores + " = grade = B");
//                break;
//            case 5:
//            case 4:
//                System.out.println(scores + " = grade = c");
//                break;
//            default:
//                System.out.println(scores + " = grade = f");
//        }
//    }

    // if- option
//        if (scores >= 80) {
//            System.out.println(scores + " = grade = A");
//        } else if (scores >= 60) {
//            System.out.println(scores + " = grade = B");
//        } else if (scores >= 40) {
//            System.out.println(scores + " = grade = c");
//        } else {
//            System.out.println(scores + " = grade = f");
//        }
}