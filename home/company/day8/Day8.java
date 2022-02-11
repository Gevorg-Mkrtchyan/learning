package home.company.day8;

import java.util.Random;
import java.util.Scanner;

public class Day8 {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    /**
     *1. Write a Java program to allow the user to input his/her age. Then the
     *   program will show if the person is eligible to vote. A person who is
     *   eligible to vote must be older than or equal to 18 years old.
     *   @param age
     */
//    public void vote(int age) {
//        age = scanner.nextInt();
//        if (age >= 18) {
//            System.out.println("person is eligible to vote");
//        } else {
//            System.out.println("don't  is eligible to vote");
//        }
//    }

    /**
     * 2 Write a Java program to determine whether an input number is an
     *   even number.
     * @param even
     */
//    public void even(int even) {
//        even = scanner.nextInt();
//        if (even % 2 == 0) {
//            System.out.println("number is even");
//        } else {
//            System.out.println("number is odd");
//        }
//    }

    /**
     * 3  Generate and print random integer number between 2 to 7(not using
     *    bound)
     */
//    public  void generate() {
//        int random = (int) (Math.random() * 6) + 2);
//        System.out.println(random);
//    }
    /**
     * 4. Write a Java program to determine whether an input number is a
     *    multiple of a 5.
     *    @param sum
     */
//    public void multiple(int sum) {
//        sum = scanner.nextInt();
//       if (sum % 5 ==0){
//           System.out.println("yes multiple");
//       }
//       else {
//           System.out.println("no multiple");
//       }
//   }

    /**
     * 5 Take three numbers from the user and print the greatest number.
     *   @param num1
     *   @param num2
     *   @param num3
     */
//    public void greatest(int num1, int num2, int num3) {
//        num1 = scanner.nextInt();
//        num2 = scanner.nextInt();
//        num3 = scanner.nextInt();
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("greatest number is " + num1);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("greatest number is " + num2);
//        } else {
//            System.out.println("greatest number is " + num3);
//        }
//    }

    /**
     * 6. Write a Java program that reads a floating-point number and prints
     *    &quot;zero&quot; if the number is zero. Otherwise, print &quot;positive&quot; or &quot;negative&quot;.
     *    Add &quot;small&quot; if the absolute value of the number is less than 1, or
     *    &quot;large&quot; if it exceeds 1,000,000
     *    (use Math.abs() for absolute value)
     *    @param num
     */
//    public void numb(double num) {
//        num = scanner.nextDouble();
//        if (num == 0) {
//            System.out.println("zero");
//        } else if (num > 0) {
//            System.out.print("positive");
//            if (Math.abs(num) > 1_000_000) {
//                System.out.print(" - large");
//            } else if (Math.abs(num) < 1) {
//                System.out.print(" - small");
//            }
//        }
//        if (num < 0) {
//            System.out.print("negative");
//            if (Math.abs(num) > 1_000_000) {
//                System.out.print(" - large");
//            } else if (Math.abs(num) < 1) {
//                System.out.print(" - small");
//            }
//        }
//    }

    /**
     * 7. Write a Java program that keeps a number from the user and generates
     *    an integer between 1 and 7 and displays the name of the weekday.
     *    @param days
     */
//    public void week(int days) {
//        days = scanner.nextInt();
//        int day = days % 7 + 1;
//        if (day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesday");
//        } else if (day == 4) {
//            System.out.println("Thursday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else if (day == 6) {
//            System.out.println("Saturday");
//        } else if (day == 7) {
//            System.out.println("Sunday");
//        }
//    }

    /**
     * 8. The ice cream parlor sells three balls and five balls. Can you buy
     *    exactly k balls of ice cream?
     *    In the cafe they sell an ice-cream with 3 balls and 5 balls.Input K integer
     *    value from console, check if you can buy exactly K balls ice-cream.
     *    @param balls
     */
//    public void ice(int balls) {
//        balls = scanner.nextInt();
//        if (balls == 0 || balls == 1 || balls == 2 || balls == 4 || balls == 7) {
//            System.out.println("no");
//        } else {
//            System.out.println("yes");
//        }
//    }

    /**
     * 9. LEAP YEAR
     *    Write a Java program that takes a year from the user and print whether
     *    that year is a leap year or not.
     *    @param year
     */
//    public void leap(int year) {
//        year =scanner.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println(year + " leap year");
//                } else {
//                    System.out.println(" not leap year");
//                }
//            }
//             else {
//                System.out.println("is leap year");
//            }
//        } else {
//            System.out.println("not leap year");
//        }

    /**
     * 10.Generate random integer value, print true if random value
     * corresponds these conditions, else print false(use boolean primitive
     * type)
     * -input number is greater than -1000 and less than 1000
     * -input number is multiple of 3 or input number is multiple of 5
     */
//    public void numbers(int multiple) {
//        multiple = scanner.nextInt();
//        int sum1 = 1000;
//        int sum2 = -1000;
//        double d = random.nextDouble() * (sum1 - sum2) + sum2;
//        boolean bool = d > -1000 && d < 1000;
//        System.out.println(bool);
//        boolean boole = multiple % 5 == 0 || multiple % 3 == 0;
//        System.out.println(boole);
//    }

    /**
     * 11. Input from console int a and int b, if a and b corresponds for following
     * requirements print “Both a and b legal”, if any of them does not
     * correspond print about it like this “a is legal b is illegal &#39;&#39;. or vice versa
     * - a &gt; 10 and b is not equal to 10
     * - both a and b is positive
     * - both a and b is negative
     * - a &gt; 10 b &lt; 1 both of them are odd
     * - a is a multiple of 5 OR b is a multiple of 5
     * - a is not a multiple of 5 but b is a multiple of 5
     * @param a
     * @param b
     */
//    public void numEquals(int a, int b) {
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        //- a > 10 and b is not equal to 10
//        if (a > 10 & b != 10) {
//            System.out.println("Both a and b legal");
//        } else if (b == 10) {
//            System.out.println("b is illegal");
//        } else if (a < 10) {
//            System.out.println("a is illegal");
//        }
//        //both a and b is positive
//        if (a > 0 & b > 0) {
//            System.out.println("Both a and b legal");
//        } else if (a < 0 & b > 0) {
//            System.out.println("a is illegal");
//        } else if (a > 0 & b < 0) {
//            System.out.println("b is illegal");
//        }
//        //both a and b is negative
//        if (a < 0 & b < 0) {
//            System.out.println("Both a and b legal");
//        } else if (a < 0 & b > 0) {
//            System.out.println("b is illegal");
//        } else if (a > 0 & b < 0) {
//            System.out.println("a is illegal");
//        }
//        //a > 10 b < 1 both of them are odd
//        if (a > 10 & b < 1) {
//            System.out.println("Both a and b legal");
//        } else if (a < 10 & b > 1) {
//            System.out.println("a is illegal");
//        } else if (a > 10 & b > 1) {
//            System.out.println("b is illegal");
//        }
//        //a is a multiple of 5 OR b is a multiple of 5
//        if (a % 5 == 0 | b % 5 == 0) {
//            System.out.println("Both a and b legal");
//        }
//        if (a % 5 == 1 ^ b % 5 == 1) {
//            System.out.println("b is illegal");
//        }
//    }

    /**
     * 12. Input int values a and b from console
     * - if one of them is multiple of 7, and both positive, and a
     * greater than b, print all odd values between them
     * - else print all even values between them
     *
     * @param a
     * @param b
     */
//    public void value(int a, int b) {
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        int c = 0;
//        int d = 0;
//        if ((a % 7 == 0 || b % 7 == 0) && (a > 0 && b > 0) && a > b) {
//            c = b;
//            if (b % 2 == 0) {
//                ++c;
//            } else {
//                c += 2;
//            }
//            while (c < a) {
//                System.out.println(c);
//                c += 2;
//            }
//        } else {
//            c = 0;
//            d = 0;
//            if (a > b) {
//                c = b;
//                d = a;
//            } else if (a < b) {
//                c = a;
//                d = b;
//            } else {
//                System.out.println("number is equal");
//            }
//            if (c % 2 == 0) {
//                c += 2;
//            } else {
//                c++;
//            }
//            while (c < d) {
//                System.out.println(c);
//                c += 2;
//            }
//        }
//    }
    /**
     * 13. Given coordinates of two points in the coordinate plane.Write
     * java program to check if the points lie in the same plane?(quarter)
     * - Print In the same quarter , else print Not in the same quarter.
     * - Input 4 coordinates from console, all 4 coordinates != 0
     * @param x
     * @param y
     */
//    public void quadrant(int x, int y) {
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        if (x > 0 && y > 0) {
//            System.out.println("lines in first quadrant");
//        } else if (x < 0 && y > 0) {
//            System.out.println("lines in second quadrant");
//        } else if (x < 0 && y < 0) {
//            System.out.println("lines in third quadrant");
//        } else if (x > 0 && y < 0) {
//            System.out.println("lines in fourth quadrant");
//        } else if (x == 0 && y > 0) {
//            System.out.println("lines at  positive y axis");
//        } else if (x == 0 && y < 0) {
//            System.out.println("lines at  negative y axis");
//        } else if (y == 0 && x < 0) {
//            System.out.println("lines at  negative x axis");
//        } else if (y == 0 && x > 0) {
//            System.out.println("lines at  positive x axis");
//        }
//    }

    /**
     * 14. Given 3 positive numbers different from 0, Determine if there is
     * a non-degenerate triangle with such sides.
     * - Input numbers from console
     *
     * @param x
     * @param y
     * @param z
     */
//    public void triangle(int x, int y, int z) {
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//        z = scanner.nextInt();
//        if (x + y >= z && x + z >= y && y + z >= x) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//    }

    /**
     * 15.Given 3 numbers, print count of numbers that equals to each
     * other.(Input numbers from console)Example`
     * Input numbers`
     * a>b,a>c a=b a = c b>c B<c b =c
     */
//    public void giveNum(int a, int b, int c) {
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        if (a == b && b == c) {
//            System.out.println( " 3 ");
//        } else if (a == c || c == b || a == b) {
//            System.out.println("2");
//        } else {
//            System.out.println("0");
//        }
//    }

    /**
     * 16.Given 3 real numbers a , b , c .FInd all decisions for
     * ax2 + bx + c = 0.Print all decisions, if there is not a
     * decision ,print “Can&#39;t be”.
     */
//    public void decisions(int a, int b, int c) {
//        double x;
//        double y;
//        boolean bool = false;
//        System.out.print(" number a - ");
//        a = scanner.nextInt();
//        System.out.print(" number b - ");
//        b = scanner.nextInt();
//        System.out.print(" number c - ");
//        c = scanner.nextInt();
//        double d = b * 4 - 4 * a * c;
//        System.out.println("all Decisions - ");
//        if (d >= 0) {
//            x = (-b + Math.sqrt(d)) / 2 * a;
//            System.out.println("x value is -" + x);
//            y = (-b - Math.sqrt(d)) / 2 * a;
//            System.out.println("y value is -" + y);
//        }
//        else {
//            System.out.println("Can't be: " + bool );
//        }
//    }
    /**
     * 17.Given 3 integer values arrange them in non-decreasing order.
     * a&lt;= b &lt;= c.
     * Example`
     * Input
     * - 3
     * - 1
     * - 1
     * Output
     * - 1
     * - 1
     * - 3
     *
     * @param a
     * @param b
     * @param c
     */
//    public void giveNumbers(int a, int b, int c) {
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//        int max, min, med;
//        if (a > b) {
//            if (a > c) {
//                max = a;
//                if (b > c) {
//                    med = b;
//                    min = c;
//                } else {
//                    med = c;
//                    min = b;
//                }
//            } else {
//                med = a;
//                if (b > c) {
//                    max = b;
//                    min = c;
//                } else {
//                    max = c;
//                    min = b;
//                }
//            }
//        } else {
//            if (b > c) {
//                max = b;
//                if (a > c) {
//                    med = a;
//                    min = c;
//                } else {
//                    med = c;
//                    min = a;
//                }
//            } else {
//                med = b;
//                max = c;
//                min = a;
//            }
//        }
//        System.out.println("sorted number " + max + med + min);
//    }
}
