package home.company.day21.task3;

/**
 * 3.Write a animal class
 * - with fields age, name and   with method sound()
 * - write a Cat class which extends from Animal, overrides a sound method also has an age and name
 * - create in main method Animal object, Cat object with Animal type reference, and Cat object with Cat type
 * - Call and print for all created objects its methods and fields
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat1 = new Cat();
        Cat cat = new Cat();
        animal.sound();
        cat.sound();
        cat1.sound();
    }
}
