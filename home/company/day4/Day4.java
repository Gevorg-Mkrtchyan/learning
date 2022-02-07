package home.company.day4;

import java.util.Random;
import java.util.Scanner;

public class Day4 {


    /**
     * 1 Widening Primitive Conversion (Implicit)
     *
     * @param // b
     */
//    public static void castWidening(byte b) {
//        System.out.println("Please enter number");
//        short s = b;
//        int i = s;
//        long l = i;
//        float f = l;
//        double d = f;
//        System.out.println(b + ", " + s + ", " + i + ", " + l + ", " + f + ", " + d);
//    }

    /**
     * 2 Narrowing Primitive Conversion (Explicit)
     * @param // dd
     */
//    public static void castNarrowing(double dd) {
//        float ff = (float) dd;
//        long ll = (long) ff;
//        int ii = (int) ll;
//        short ss = (short) ii;
//        byte bb = (byte) ss;
//        System.out.println(dd + ", " + ff + ", " + ll + ", " + ii + ", " + ss + ", " + bb);
//    }

    /**
     * 3 Write a Java program to convert temperature from Fahrenheit to
     * @param // cel
     */
//    public static void fahrenheit(double cel) {
//        double far = (cel * 9 / 5) + 32;
//        System.out.println(far);
//        float farCastToFloat = (float)far;
//        System.out.println("Float cast result is "+farCastToFloat);
//        int farCast = (int) farCastToFloat;
//        System.out.println("Int Cast result is " + farCast);
//    }

    /**
     * 4 Compute area  and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
     * @param // are
     */
//       public static  void area(double are) {
//        double ss = Math.PI * Math.pow(are / 2,2);
//        System.out.println("Perimetr is " + ss);
//       }

    /**
     * 5 Compute area  and perimeter of circle.(Input double type radius from console)(PI = 3.14159)
     */
//    public static void result() {
//        float f = 1 / 3f;
//        double d = 1 / 3d;
//        System.out.println(f + " , " + d);
//    }

    /**
     * 6 Write java program to print your Name and year of birth
     * using only char primitive and int types.Output` (Ara 1996)
     */
//    public static void usingName() {
//        char a = 'A';
//        char b = 'r';
//        char c = 'a';
//        int i = 1996;
//        System.out.println("result " + a + b + c + " -- " + i);
//    }

    /**
     * Cast char to int
     */
//    public static void castInt() {
//        char isChars = 'a';
//        int isInts = isChars;
//        System.out.println(isInts);
//    }
/**
 * Write a java program which parses your name letters as a integers,
 * calculate average of them, Output  Ara -- 92.0
 */
//public static  void nameLetters(String str) {
//   int sum = 0;
//    for (int i = 0; i < str.length(); i++) {
//        sum = str.charAt(0);
//    }
//    double d = sum / str.length();
//    System.out.println(d);
//    }


    /**
     * Input int value from console, find char value corresponding
     * to that int value.Output ` 65 - A. (input int in range 32 to 127)
     */
//    public static void val(int a) {
//        char ch = (char) a;
//        System.out.println(a + " - " + ch);
//    }
    /**
     *   10 String
     *  Define simple String variable, initialize it
     *  Define another String variable, initialize it
     *  Concatenate them , print output
     * @param //firstStr
     * @param //secondStr
     */
//    public static void concat(String firstStr,String secondStr) {
//        System.out.println(firstStr +  secondStr);
//    }

    /**
     *     11. What happens if concatenate string and another primitive type
     */
//    public static void otherConcat(int num1, int num2,String str) {
//        System.out.println(" result =" + num1 + num2);
//        System.out.println(" result = " + num1 + str);
//    }

    /**
     * 12 How to solve 12 problem
     * We can use backslash for word “Vikings”
     * String txt = "We are the so-called \"Vikings"\ from the north.";
     *
     * \n                     New Line
     * \r                          Carriage return
     * \t                          Tab
     * \b                         backslash
     * try with this features print txt
     */
//    public static  void covert() {
//        String txt1 = "We are the so-called\b \"Vikings\" from  the north.";
//        String txt2 = "We are the so-called\n \"Vikings\" from  the north.";
//        String txt3 = "We are the so-called\t \"Vikings\" from  the north.";
//        String txt4 = "We are the so-called\r \"Vikings\" from  the north.";
//        System.out.println(txt1 + "\n" + txt2 + "\n" + txt3 + "\n" + txt4);
//    }
/**
 * 14 Swap 2 integers without using temp
 */
//public static  void swap(int a,int b) {
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println(a +" : " + b);
//}



    /**
     * 15
     * 1  Which data type would you use to represent the following values
     * a. Child age  -- byte
     * b. Employee salary -- int or double
     * c .Whether somebody has children or not  --- boolean
     * d. Apartment letter  -- String
     * <p>
     * 2  Find the errors in the following Java sentences:
     * a) int a, b, c a = 0   --- errors is -> answer -> ;
     * b) System.out.println('ab'); errors is -> answer -> " "
     * c) System.out.println( (3 + 2) – 1) ); errors is -> bracket:
     * d) int a = 3.2; errors is -> 3.2 int can not keep in float number
     * e) float a = 2.1; int c = a; -> not done Narrowing Casting
     * f) int i = 10; float b; i = b;-> not done Narrowing Casting
     * g) int x; { x = 10; } System.out.println(x); -> there is not errors
     * h) boolean a, b; a = false, b = true; ->  initialization
     * i) int x; x = 1; r = x + 1; errors is -> did not create a variable r
     * j) String s = 'This is a string'; errors is -> ' ' answer " "
     * <p>
     * 3  task 3 What will be output
     * int i = 10;
     * int n = i++ % 5;
     * System.out.println(n); answer 0
     * <p>
     * 4  Find the value of the variable result after executing the following sentences:
     * int a;
     * int b;
     * int result;
     * a) a = 4; b = 12; result = a + b / 3; answer  -> 8
     * b) a = 3; a = a + 3; b = 2; result = a – b; answer -> 4
     * c) a = 2; b = a + 1; a = b + 2; result = a + b + a; result = -result; answer -> -13
     * d) a = 3; b = 11; result = (b % a) + 1; answer  -> 3
     * e) a = 3; b = a++; result = 1; result += a – b; answer ->compile time exceptions illegal character
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
//        byte a = scan.nextByte();
//        double d = scan.nextDouble();
//        String str1 = scan.next();
//        String str2 = scan.next();
//        int rand = ran.nextInt(33)+80;
//        int i = scan.nextInt();
//        int j = scan.nextInt();
//        castWidening(a);
//        castNarrowing(d);
//        fahrenheit(d);
//        area(d);
//        result();
//        usingName();
//        castInt();
//        nameLetters(str);
//        val(rand);
//        concat(str1,str2);
//        otherConcat(i,j,str2);
//        covert();
//        swap(i,j);
    }
}

