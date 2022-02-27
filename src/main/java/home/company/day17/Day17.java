package home.company.day17;

import java.util.Arrays;

public class Day17 {
    /**
     * 1.Write a function add with these 3 types of overloading.
     * static void add();
     * Which prints which method is called and result
     */
    public void add(int a, int b) {
        System.out.println("int a , int b");
    }

    public void add(float a, int b) {
        System.out.println("float a, int b");
    }

    public void add(int a, int b, int c) {
        System.out.println("int a,int b ,int c");
    }

    /**
     * 2.Write 2 functions where first returns float second returns int,
     * and they have the same parameters for input.
     */
//    public float printFloat(float a, float b) {
//        return a + b;
//    }
//
//    public int printFloat(float a, float b) {
//        return (int) (a + b);
//    }

    /**
     * 3.Fix bug for 2 nd problem.
     */
    public float printFloat(float a, float b) {
        return a + b;
    }

    public int printFloat(int a, int b) {
        return a + b;
    }

    /**
     * 4.Write a method called print(), which takes an array and print its contents in the form of [a1, a2, ..., an].
     * Take note that there is no comma after the last element. The method's signature is as follows:
     * We need to overload this method for int[ ], float[ ], double[ ] arrays.
     */
    public String print(int[] arr) {

        return Arrays.toString(arr);
    }

    public String print(double[] arr) {
        return Arrays.toString(arr);
    }

    public String print(float[] arr) {
        return Arrays.toString(arr);
    }

    /**
     * 5.Write a search function, which
     * -         get as an argument int[ ] array, (returns the size of array)
     * public static int search(int[ ] array)
     * -         get as an argument int[ ] array , also int a, and returns an index of that argument
     * public static int search(int[ ] array, int a)
     * <p>
     * <p>
     * -         get as an argument int[ ] array, int argument, int index
     * returns true if that element is in that place in array,otherwise false
     * public static boolean search(int[] array, int argument, int index)
     */
    public int search(int[] arr) {
        return arr.length;
    }

    public int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a)
                return i;
        }
        return -1;
    }

    public boolean search(int[] array, int argument, int index) {
        return array[index] == argument;
    }

    /**
     * 6. Write a square() method, which
     * -         if get one  int parameter returns the square of cirqle
     * -         if get one float parameter returns the square of square
     * -         if get 2 parameters returns the square of rectangle
     */
    public int area(int area) {
        return (int) (area * area * Math.PI);
    }

    public float area(float area) {
        return area * area;
    }

    public int area(int a, int b) {
        return a * b;
    }

    /**
     * 7.Write a max() function which
     * -         max(int a, int b)
     * -         max(int a, int b, int c)
     * -         max(int a , int b, int c, int d)
     */
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int max(int a, int b, int c, int d) {
        return max(max(a, b, c), d);
    }

    /**
     * 8.Write a distance() function which
     * -         return distance from (0.0 , 0.0) to (a)
     * distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
     * distance(int, int)
     * -return the distance from a to be, if method distance get 4 int parameters
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
    }

    public String distance(int x1, int x2) {
        return "don't print distance in 2 parameters ";
    }

    /**
     * 9.Write a fahrenheitCelsius() function which
     * -         prints fahrenheit value  when pass (float celsius, int choice), where choice is the type of fahrenheit`
     * 1 , print fahrenheit as int value
     * 2 , print fare fahrenheit asa double value
     * , if pass another value print illegal argument
     * -         prints celsius when pass (int choice, float fahrenheit)
     * Example` fahrenheitCelsius(32.0, 1);
     * Output` 32 fahrenheit is 0 celsius ;
     */
    public void fahrenheitCelsius(float celsius, int choice) {
        System.out.println(celsius + " celsius  in int = " + (int) ((celsius * 1.8) + 32) + " fahrenheit");
        System.out.println(celsius + " celsius in double = " + ((celsius * 1.8) + 32) + " fahrenheit");
    }

    public void fahrenheitCelsius(int choice, float fahrenheit) {
        System.out.println(fahrenheit + " fahrenheit = " + ((fahrenheit - 32) / 1.8) + " celsius");
    }

    public void fahrenheitCelsius(int choice, int celsius) {
        System.out.println("illegal argument");
    }

    /**
     * 10.Write a function` remainder() which
     * -         when pass one int value, return sum of digits for that value remainder(int)
     * -         when pass one int value and one natural int, return reminder from sum of digits divided to
     * second parameter(reminder(int 331, int 5) {
     * return  (3 + 3 + 1) % 5
     */
    public int remainder(int n) {
        int sum = 0;
        if (n < 0) {
            return -1;
        }
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public double remainder(int n, int sec) {
        return remainder(n) % sec;
    }
}
