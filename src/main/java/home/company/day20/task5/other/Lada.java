package home.company.day20.task5.other;

import home.company.day20.task5.Car;

public class Lada extends Car {
    @Override
    public void speed() {
        System.out.println("speed is Lada = 170");
    }
    @Override
    public void cost() {
        System.out.println("cost is lada = 2000$");
    }
}
