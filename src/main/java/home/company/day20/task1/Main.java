package home.company.day20.task1;

/**
 * Write a java program which`
 * --has a Shape abstract class with methods getArea(), getPerimeter(), which get as a parameter
 * double radius and have an protected access modifier
 * -create a Circle class which extends from Shape abstract class and overrides it’s methods.
 * -create a Square class which extends from Shape abstract class and overrides it’s methods.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        System.out.println(square.getArea(11));
        System.out.println(square.getArea(5));
        System.out.println(circle.getArea(3));
        System.out.println(circle.getPerimeter(5));
    }
}
