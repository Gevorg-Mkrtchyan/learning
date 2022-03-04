package home.company.day21.task1;

/**
 * Create an animal class which has sound method()
 * -        now create sub classes of Animal class Horse and Cat
 * -        for each of them override sound() method
 * -        in main method create objects for each class
 */
public class Main {
    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal cat = new Cat();
        horse.sound();
        cat.sound();
    }
}