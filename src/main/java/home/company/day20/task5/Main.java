package home.company.day20.task5;

import home.company.day20.task5.other.Bmw;
import home.company.day20.task5.other.Lada;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        Lada lada = new Lada();
        bmw.speed();
        bmw.cost();
        lada.speed();
        lada.cost();
        lada.setHorsepower(170);
        System.out.println(lada.getHorsepower());
    }
}