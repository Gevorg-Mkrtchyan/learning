package home.company.day21.task4;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = {new Square(), new Circle(), new Rectangle()};
        for (Shape value : shape) {
            System.out.println(value.area() + "  " + value.perimeter());
        }
    }
}
