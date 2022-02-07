package home.company.day5.task1;

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

    public void write() {
        System.out.println( "Person name = " +name + " Person age = " +
                age + " Person address = " + address );
    }
}
