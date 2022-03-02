package home.company.day19.task1;

public class TestTask1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.eat();
        animal.voice();
        dog.voice();
        dog.eat();
    }
}
