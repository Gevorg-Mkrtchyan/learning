package home.company.day21.task2;

/**
 * Write a examples of    `
 * -        compile time polymorphism
 * -        runtime polymorphism
 */
public class Main {
    public static void main(String[] args) {
        Animal dolphin = new Dolphin();
        System.out.println(dolphin.info(120));
        dolphin.info(120, true);
        System.out.println(dolphin.sound());
    }
}