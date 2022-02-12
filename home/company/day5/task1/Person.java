package home.company.day5.task2;

/**
 * 1. Define a Person class which
 *  Has fields name, age, address
 *  define no argument constructor
 *  define all argument constructor
 *  write method which will print all information about person
 *  create 2 person objects, print all info about them
 */
public class Person {
    String name;
    int age;
    String address;

    public Person() {

    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void allInfoPerson() {
        System.out.println("Person name = " + name + " Person age = " +
                age + " Person address = " + address);
    }
}
