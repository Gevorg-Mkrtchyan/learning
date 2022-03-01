package home.company.day18.example;

/**
 * 3.Write a Triangle class which `
 * -        has a sideA, sideB, sideC
 * -        write getters and setters for that
 * all sides must be in range 1 - 20
 * -        define constructor
 * -        also your class must have an isTriangleValid() private method.
 * -        and also a public check() method which will get as a parameter triangle object
 * and will call isValidTriangle() method.
 * <p>
 * -        also add a method which will check if your triangle is right or not.
 * -        if the triangle count square else count perimeter.
 * -        use method overloading
 */
public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {

    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
    public double perimeterOfArea(double side1,double side2){
        return (side1 * side2)/2;
    }
    public double perimeterOfArea(double side1,double side2,double side3){
        return side1 + side2 + side3;
    }
}
