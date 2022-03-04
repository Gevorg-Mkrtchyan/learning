package home.company.day21.task3;

public class Animal {
    protected int age;
    protected String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    protected void sound(){
        System.out.println("animal");

    }
}
