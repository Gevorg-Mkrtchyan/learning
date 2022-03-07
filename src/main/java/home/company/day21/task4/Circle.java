package home.company.day21.task4;

public class Circle implements Shape {
    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double perimeter() {
        return 2 * r;
    }
}
