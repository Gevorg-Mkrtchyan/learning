package home.company.day20.task1;

public class Square extends Shape{
    @Override
    protected double getArea(double radius) {
        return (radius * radius);
    }

    @Override
    protected double getPerimeter(double radius) {
        return (4 * radius);
    }
}
