package home.company.day20.task3;

/**
 * 3.Write a java program which`
 * -        -        has a interface flyAble;
 * -        -        has a Bird class that implement flyAble
 * -        -        has a Airplane class that implement flyAble
 */
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();
        bird.fly();
        airplane.fly();
    }
}
