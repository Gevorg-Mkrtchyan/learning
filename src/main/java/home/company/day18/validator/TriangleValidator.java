package home.company.day18.validator;

import home.company.day18.example.Triangle;

public class TriangleValidator {
    private TriangleValidator() {

    }

    public static boolean validSide(int side) {
        return side > 1 && side < 20;
    }
    public static boolean check(Triangle triangle){
        return  isValidTriangle(triangle);
    }
    private static boolean isValidTriangle(Triangle triangle){
        if (triangle == null){
            return false;
        }
        return triangle.getSideA() + triangle.getSideB() > triangle.getSideC()
                && triangle.getSideA() + triangle.getSideC() > triangle.getSideB()
                && triangle.getSideB() + triangle.getSideC() > triangle.getSideA();
    }
    public static boolean isTriangle(Triangle triangle){
        return triangle.getSideC() == Math.sqrt(Math.pow(triangle.getSideA(), 2) + Math.pow(triangle.getSideB(), 2)) ||
                triangle.getSideA() == Math.sqrt(Math.pow(triangle.getSideC(), 2) + Math.pow(triangle.getSideB(), 2)) ||
                triangle.getSideB() == Math.sqrt(Math.pow(triangle.getSideA(), 2) + Math.pow(triangle.getSideC(), 2));
    }
}
