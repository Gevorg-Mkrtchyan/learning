package home.company.day21.task3;

public class Cat extends Animal{
    @Override
    protected void sound() {
        System.out.println("Cat sound");
    }

    public Cat() {
        super();
    }

    public Cat(int age, String name) {
        super(age, name);
    }
}
