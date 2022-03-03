package home.company.day20.task5.other;

import home.company.day20.task5.Car;

public class Bmw extends Car {
    @Override
    public void speed() {
        System.out.println("speed is Bmw = 240");
    }

    @Override
    public void cost() {
        System.out.println("cost is Bwm = 8000$");
    }
}
