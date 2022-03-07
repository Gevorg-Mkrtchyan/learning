package home.company.day21.task4;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = {new Square(1), new Circle(1), new Rectangle(1,2)};
        for (Shape value : shape) {
            System.out.println(value.area() + "  " + value.perimeter());
        }
    }
}
