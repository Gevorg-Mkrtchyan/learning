package home.company.day20.task4;

/**
 *4.Write a java program which
 * -has a warrior abstract class which has a fields:
 * name, type, power, health and method hit()
 * -has a Shooter  and SwordsMen classes, extending from Warrior, which override method hit()
 *
 */
public class Main {
    public static void main(String[] args) {
        Shooter shooter = new Shooter();
        SwordsMen swordsMen = new SwordsMen();
        shooter.hit();
        swordsMen.hit();
    }
}
